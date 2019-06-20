package p0400;

/**
1.    Objectifs
	     Optimiser l'utilisation du radar pour la détection d'un unique ennemi

2.    Procédure
	     A chaque round
		o   Si le radar a fini de tourner
		-   Le faire tourner d'une très grande valeur à droite
		o   Passer au round suivant
	     Lors de la détection d'un ennemi
		o   Faire tourner le radar du double de l'angle entre le radar et l'ennemi
		o   Ne plus tirer sur l'ennemi
		-   Les actions bloquantes peuvent perturber le scan

3.    Commentaires
	     L'angle entre le radar et votre ennemi se calcule à l'aide des méthodes suivantes :
		o   event.getBearing()
		o   getHeading()
		o   getRadarHeading()
	     Si le robot n'a rien à faire, appeler la méthode
		o   execute()
	     Pour calculer précisément l'angle minimal entre le radar et l'ennemi, vous devrez utiliser
		une des méthodes statiques suivantes de la classe Utils :
		o   normalRelativeAngle() ou normalRelativeAngleDegrees()  
*/

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class P0445 extends AdvancedRobot 
{
	private final int NBR_LOCATIONS = 19;
	private final double ANGLE_MAX = 90;
	private final double ANGLE_MIN = -ANGLE_MAX;
	private final double ANGLE_DELTA = (ANGLE_MAX - ANGLE_MIN) / (NBR_LOCATIONS - 1);
	private final int DISTANCE_STD = 100;
	private final int MARGIN = 120;

	private Location enemyLocation;
	private Location bestLocation;
	private Location[] locations = new Location[NBR_LOCATIONS];
	private Rectangle2D.Double safeArea;

	@Override
	public void run() 
	{
		double w = getBattleFieldWidth() - 2 * MARGIN;
		double h = getBattleFieldHeight() - 2 * MARGIN;
		safeArea = new Rectangle2D.Double(MARGIN, MARGIN, w, h);
		setAdjustGunForRobotTurn(true);
		
		while (true) 
		{
			if(getRadarTurnRemaining() == 0)
			{
				setTurnRadarRight(360);
			}
			execute();
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent event) 
	{
		super.onScannedRobot(event);

		// Trouve l'ennemi
		enemyLocation = new Location(this, event.getBearing(), event.getDistance());
		
		// Détermine l'angle du canon (pour pointer l'ennemi)
		double angle;
		angle = getHeading() + event.getBearing() - getGunHeading();
		angle = Utils.normalRelativeAngleDegrees(angle);
		setTurnGunRight(angle);
		setFire(1);
		
		//Radar
		double angleRadar;
		angleRadar = getHeading() + event.getBearing() - getRadarHeading();
		angleRadar = Utils.normalRelativeAngleDegrees(2*angleRadar);
		setTurnRadarRight(angleRadar);
		
		// Défini des locations (tous les 15 degrés, de -60 à +60
		for (int i = 0; i < locations.length; i++) 
		{
			locations[i] = new Location(this, i * ANGLE_DELTA - ANGLE_MAX, DISTANCE_STD);
		}

		// Trouve la location la plus éloignée de l'ennemi
		bestLocation = enemyLocation;
		for (int i = 1; i < locations.length; i++) 
		{
			if (safeArea.contains(locations[i])) 
			{
				if (locations[i].distance(enemyLocation) > bestLocation.distance(enemyLocation)) 
				{
					bestLocation = locations[i];
				}
			}
		}
		// S'y rend
		setTurnRight(bestLocation.getAngle());
		setAhead(bestLocation.getDistance());
	}

	@Override
	public void onPaint(Graphics2D g) 
	{
		super.onPaint(g);
		int radius = 25;

		g.setColor(new Color(255, 0, 0, 100));

		// L'ennemi
		if (enemyLocation != null) 
		{
			g.fillOval((int) enemyLocation.x - radius, (int) enemyLocation.y - radius, 2 * radius, 2 * radius);
		}

		radius = 10;
		g.setColor(new Color(255, 255, 0, 150));
		// Les locations
		if (locations[0] != null) 
		{
			for (int i = 0; i < locations.length; i++) 
			{
				g.fillOval((int) locations[i].x - radius, (int) locations[i].y - radius, 2 * radius, 2 * radius);
			}

			g.setColor(new Color(0, 255, 0, 150));
			g.fillOval((int) bestLocation.x - radius, (int) bestLocation.y - radius, 2 * radius, 2 * radius);
		}
		//safeArea
		g.setColor(new Color(0, 255, 0, 100));
		g.fill(safeArea);
	}

}
