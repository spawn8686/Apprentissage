package p0500;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Classe représentant une onde de projectiles centrée sur l'attaquant 
 * et s'éloignant à vitesse constante de celui-ci 
 * @author Thibault Schönmann
 *
 */
public class Wave 
{
	private double speed;
	private Point2D.Double origin;
	private double absBearing;
	private long startTime;
	private int tanSpeed;

	/**
	 * Crée une onde centrée sur me d'une vitesse correspondant à la vitesse d'un missile de puissance égale 
	 * à firePower et dont l'angle 0 correspond à l'angle fourni en paramètre. 
	 * @param me Le robot à l'origine de l'onde
	 * @param angle Valeur en degrés correspondant au décalage (dans le sens horaire) entre l'angle 0 
	 * de l'onde et l'avant du robot
	 * @param firePower Puissance de feu déterminant la vitesse de l'onde 
	 */
	public Wave(Robot me, double angle, double firePower) 
	{
		origin = new Point2D.Double(me.getX(), me.getY());
		absBearing = Math.toRadians(me.getHeading() + angle);
		startTime = me.getTime();
		speed = getFireSpeed(firePower);

	}
	
	/**
	 * Crée une onde centrée sur me d'une vitesse correspondant à la vitesse d'un missile de puissance égale 
	 * à firePower dirigée vers le target 
	 * @param me Le robot à l'origine de l'onde
	 * @param target cible de l'onde
	 * @param firePower Puissance de feu déterminant la vitesse de l'onde 
	 */
	public Wave(Robot me, ScannedRobotEvent target, double firePower) 
	{
		this(me,target.getBearing(), firePower);
		tanSpeed=(int)(target.getVelocity()*Math.sin(target.getHeadingRadians()-absBearing));		
	}
	
	/**
	 * Récupère la vitesse tangentielle calculée à la création de l'onde
	 * @return la vitesse tangentielle de la cible
	 */
	public int getTanSpeed() 
	{
		return tanSpeed;
	}
	
	/**
	 * Calcule la forme de l'onde à un moment donné
	 * @param when Moment de l'aperçu comme retourné par Robot.getTime()
	 * @return La forme (cercle) représentant l'onde
	 */
	public Shape getShape(long when) 
	{
		double radius= (when-startTime)*speed;
		Shape s = new Ellipse2D.Double((int)(origin.x-radius),(int)(origin.y-radius),(int)radius*2,(int)radius*2);
		GeneralPath p = new GeneralPath(s);
		p.moveTo(Math.sin(absBearing)*radius+origin.x, Math.cos(absBearing)*radius+origin.y);
		radius = Math.max(0, radius-10);
		p.lineTo(Math.sin(absBearing)*radius+origin.x, Math.cos(absBearing)*radius+origin.y);
		return p;
	}

	/**
	 * Indique si une onde a atteint un point donné
	 * @param target Point que l'on désire tester (le point 0,0 se trouve en bas à gauche)
	 * @param when Moment où l'on effectue le test comme retourné par Robot.getTime()
	 * @return true si l'onde a atteint ou dépassé le target au moment when
	 */
	public boolean reaches(Point2D.Double target, long when) 
	{
		return (when-startTime)*speed>=origin.distance(target);
	}

	/**
	 * Détermine l'angle avec lequel une onde touche un point
	 * @param target Point que l'on désire tester
	 * @return l'angle en radians entre le 0 de l'onde et le target
	 */
	public double getReachingAngle(Point2D.Double target)
	{
		return Utils.normalRelativeAngle(Utils.normalAbsoluteAngle(Math.atan2(target.x-origin.x, target.y-origin.y))-absBearing);
	}
	
	/**
	 * Détermine la vitesse d'un projectile en fonction de sa puissance
	 * @param firePower Puissance de feu
	 * @return la vitesse du projectile
	 */
	private double getFireSpeed(double firePower) 
	{
		return 20-firePower*3; 
	}
}