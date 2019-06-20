package p0400;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class P0427 extends Robot 
{
	private final int NBR_LOCATIONS = 19;
	private final double ANGLE_MAX = 90;
	private final double ANGLE_DELTA = 2*ANGLE_MAX / (NBR_LOCATIONS-1);
	private final int DISTANCE_STD = 100;
	private final int MARGIN = 50;
	
	private Location enemyLocation;
	private Location bestLocation;
	private Location[] locations = new Location[NBR_LOCATIONS];
	
	private Rectangle2D.Double safeArea;
	

	@Override
	public void run() 
	{
		safeArea = new Rectangle2D.Double(MARGIN, MARGIN, getBattleFieldWidth()-2*MARGIN, getBattleFieldHeight()-2*MARGIN);
		
		while (true) 
		{
			turnRadarRight(360);
			
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent event) 
	{
		super.onScannedRobot(event);

		//Trouve l'ennemi
		enemyLocation = new Location(this, event.getBearing(), event.getDistance());
		//Défini des locations (tous les 15 degrés, de -60 à +60
		for (int i = 0; i < locations.length; i++) 
		{
			locations[i] = new Location(this, i*ANGLE_DELTA-ANGLE_MAX, DISTANCE_STD);
		}

		//Trouve la location la plus éloignée de l'ennemi
		bestLocation = locations[0];
		for (int i = 1; i < locations.length; i++) 
		{
			if (safeArea.contains(locations[i])) 
			{
				
			}
			
			if (locations[i].distance(enemyLocation) > bestLocation.distance(enemyLocation)) 
			{
				bestLocation = locations[i];
			}			
		}
		//S'y rend
		turnRight(bestLocation.getAngle());
		ahead(bestLocation.getDistance());
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

	}

}
