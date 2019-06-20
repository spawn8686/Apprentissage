package p0400;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.Color;
import java.awt.Graphics2D;

public class P0422 extends Robot {
	private Location enemyLocation;
	private Location ptGauche;
	private Location ptDevant;
	private Location ptDroite;
	private Location bestLocation;
	
	
	
	@Override
	public void run() {
		while (true) {
			turnRadarRight(360);
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		super.onScannedRobot(event);

		enemyLocation = new Location(this, event.getBearing(), event.getDistance());
		ptGauche = new Location(this, -30, 150);
		ptDevant = new Location(this, 0, 150);
		ptDroite = new Location(this, 30, 150);
		
		
		bestLocation = ptGauche;
		if(ptDevant.distance(enemyLocation) > bestLocation.distance(enemyLocation)) {
			bestLocation = ptDevant;
		}
		if(ptDroite.distance(enemyLocation) > bestLocation.distance(enemyLocation)) {
			bestLocation = ptDroite;
		}
		turnRight(bestLocation.getAngle());
		ahead(bestLocation.getDistance());
		
		
//		if(enemyLocation.distance(ptGauche) > enemyLocation.distance(ptDevant)) {
//			//ptGauche plus grand
//			if(enemyLocation.distance(ptDroite) > enemyLocation.distance(ptGauche)){
//				//ptDroite est le plus éloigné
//				turnRight(30);
//				ahead(100);
//			} else {
//				//ptGauche plus éloigné
//				turnRight(-30);
//				ahead(100);
//			}
//		} else {
//			//ptDevant plus grand
//			if (enemyLocation.distance(ptDroite) > enemyLocation.distance(ptDevant)) {
//				//ptDroite est le plus éloigné
//				turnRight(30);
//				ahead(100);
//			} else {
//				//ptDevant plus éloigné
//				turnRight(0);
//				ahead(100);
//			}
//		}
//		
	}
	
	@Override
	public void onPaint(Graphics2D g) {
		super.onPaint(g);
		final int radius = 25;
		
		g.setColor(new Color(0, 255, 0, 100));
		
		if(enemyLocation != null) {
			g.fillOval((int)enemyLocation.x-radius, (int)enemyLocation.y-radius, 2*radius, 2*radius);
		}		
		//g.fillOval échapatoire
		if(ptGauche != null)
		{
			g.setColor(new Color(255, 255, 0, 150));
			g.fillOval((int)ptGauche.x-radius, (int)ptGauche.y-radius, 2*radius, 2*radius);
			g.fillOval((int)ptDroite.x-radius, (int)ptDroite.y-radius, 2*radius, 2*radius);
			g.fillOval((int)ptDevant.x-radius, (int)ptDevant.y-radius, 2*radius, 2*radius);
			g.setColor(new Color(0, 255, 0, 150));
			g.fillOval((int)bestLocation.x-radius, (int)bestLocation.y-radius, 2*radius, 2*radius);
		}
	}
	
	
}
