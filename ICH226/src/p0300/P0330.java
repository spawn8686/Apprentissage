package p0300;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class P0330 extends Robot {
	private Point2D.Double enemyLocation;
	
	@Override
	public void run() {
		while (true) {
			turnRadarRight(360);
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		super.onScannedRobot(event);

		double angle, angleRadians, x, y;
		angle = event.getBearing() + getHeading();
		angleRadians = Math.toRadians(angle);
		x = getX() + Math.sin(angleRadians)* event.getDistance();
		y = getY() + Math.cos(angleRadians)* event.getDistance();
		enemyLocation = new Point2D.Double(x, y);
		
		out.printf("(%1.1f, %1.1f)\n", x, y);
	}
	
	@Override
	public void onPaint(Graphics2D g) {
		super.onPaint(g);
		final int RADIUS = 25;
		
		g.setColor(new Color(0, 255, 0, 100));
		
		if(enemyLocation != null) {
			g.fillOval((int)enemyLocation.x-RADIUS, (int)enemyLocation.y-RADIUS, 2*RADIUS, 2*RADIUS);
		}
	}
	
	
}
