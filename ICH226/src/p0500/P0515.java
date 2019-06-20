package p0500;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;
import p0400.Location;

/**
 * Un robot qui est capable de battre Walls
 * 
 * @author Student
 *
 */
public class P0515 extends AdvancedRobot {
	private final double FIRE_POWER = 1.0;
	private final int NBR_LOCATIONS = 23;
	private final double ANGLE_MAX = 120;
	private final double ANGLE_MIN = -ANGLE_MAX;
	private final double ANGLE_DELTA = (ANGLE_MAX - ANGLE_MIN) / (NBR_LOCATIONS - 1);
	private final int DISTANCE_STD = 110;
	private final int MARGIN = 130;
	private double delta_tir = 0;

	private Location enemyLocation;
	private Location bestLocation;
	private Location[] locations = new Location[NBR_LOCATIONS];
	private Rectangle2D.Double safeArea;
	private Wave wave;

	@Override
	public void run() {
		double w = getBattleFieldWidth() - 2 * MARGIN;
		double h = getBattleFieldHeight() - 2 * MARGIN;
		safeArea = new Rectangle2D.Double(MARGIN, MARGIN, w, h);
		setAdjustGunForRobotTurn(true);
		setAdjustRadarForRobotTurn(true);
		while (true) {
			if (getRadarTurnRemaining() == 0) {
				setTurnRadarRight(Integer.MAX_VALUE);
			}
			// Tire
			if (Math.abs(getGunTurnRemaining()) < 1 && getGunHeat() == 0) {
				if(wave == null) {
					wave = new Wave(this, enemyLocation.getAngle(), FIRE_POWER);
				}
				setFire(FIRE_POWER);
			}
			execute();
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		super.onScannedRobot(event);

		// Trouve l'ennemi
		enemyLocation = new Location(this, event.getBearing(), event.getDistance());

		// Est-ce que l'onde a atteint l'ennemi
		if (wave != null && wave.reaches(enemyLocation, getTime())) {
			delta_tir = Math.toDegrees(wave.getReachingAngle(enemyLocation));
			wave = null;
		}

		// Détermine l'angle du canon (pour pointer l'ennemi)
		double angle;
		angle = getHeading() + event.getBearing() - getGunHeading();
		angle = Utils.normalRelativeAngleDegrees(angle + delta_tir);
		setTurnGunRight(angle);

		// Radar
		angle = getHeading() + event.getBearing() - getRadarHeading();
		angle = Utils.normalRelativeAngleDegrees(2 * angle);
		setTurnRadarRight(angle);

		// Défini des locations (tous les 15 degrés, de -60 à +60
		for (int i = 0; i < locations.length; i++) {
			locations[i] = new Location(this, i * ANGLE_DELTA - ANGLE_MAX, DISTANCE_STD);
		}

		// Trouve la location la plus éloignée de l'ennemi
		bestLocation = enemyLocation;
		for (int i = 0; i < locations.length; i++) {
			if (safeArea.contains(locations[i])) {
				if (locations[i].distance(enemyLocation) > bestLocation.distance(enemyLocation)) {
					bestLocation = locations[i];
				}
			}
		}
		// S'y rend
		setTurnRight(bestLocation.getAngle());
		setAhead(bestLocation.getDistance());
	}

	@Override
	public void onPaint(Graphics2D g) {
		super.onPaint(g);
		int radius = 25;

		g.setColor(new Color(255, 0, 0, 100));

		// L'ennemi
		if (enemyLocation != null) {
			g.fillOval((int) enemyLocation.x - radius, (int) enemyLocation.y - radius, 2 * radius, 2 * radius);
		}

		radius = 10;
		g.setColor(new Color(255, 255, 0, 150));
		// Les locations
		if (locations[0] != null) {
			for (int i = 0; i < locations.length; i++) {
				g.fillOval((int) locations[i].x - radius, (int) locations[i].y - radius, 2 * radius, 2 * radius);
			}

			g.setColor(new Color(0, 255, 0, 150));
			g.fillOval((int) bestLocation.x - radius, (int) bestLocation.y - radius, 2 * radius, 2 * radius);
		}
		// safeArea
		g.setColor(new Color(0, 255, 0, 100));
		g.fill(safeArea);

		// l'onde
		if (wave != null) {
			g.setColor(new Color(0, 0, 255));
			g.draw(wave.getShape(getTime()));
		}
	}

}
