package p0500;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

/**
 * Classe repr�sentant une onde de projectiles centr�e sur l'attaquant 
 * et s'�loignant � vitesse constante de celui-ci 
 * @author Thibault Sch�nmann
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
	 * Cr�e une onde centr�e sur me d'une vitesse correspondant � la vitesse d'un missile de puissance �gale 
	 * � firePower et dont l'angle 0 correspond � l'angle fourni en param�tre. 
	 * @param me Le robot � l'origine de l'onde
	 * @param angle Valeur en degr�s correspondant au d�calage (dans le sens horaire) entre l'angle 0 
	 * de l'onde et l'avant du robot
	 * @param firePower Puissance de feu d�terminant la vitesse de l'onde 
	 */
	public Wave(Robot me, double angle, double firePower) 
	{
		origin = new Point2D.Double(me.getX(), me.getY());
		absBearing = Math.toRadians(me.getHeading() + angle);
		startTime = me.getTime();
		speed = getFireSpeed(firePower);

	}
	
	/**
	 * Cr�e une onde centr�e sur me d'une vitesse correspondant � la vitesse d'un missile de puissance �gale 
	 * � firePower dirig�e vers le target 
	 * @param me Le robot � l'origine de l'onde
	 * @param target cible de l'onde
	 * @param firePower Puissance de feu d�terminant la vitesse de l'onde 
	 */
	public Wave(Robot me, ScannedRobotEvent target, double firePower) 
	{
		this(me,target.getBearing(), firePower);
		tanSpeed=(int)(target.getVelocity()*Math.sin(target.getHeadingRadians()-absBearing));		
	}
	
	/**
	 * R�cup�re la vitesse tangentielle calcul�e � la cr�ation de l'onde
	 * @return la vitesse tangentielle de la cible
	 */
	public int getTanSpeed() 
	{
		return tanSpeed;
	}
	
	/**
	 * Calcule la forme de l'onde � un moment donn�
	 * @param when Moment de l'aper�u comme retourn� par Robot.getTime()
	 * @return La forme (cercle) repr�sentant l'onde
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
	 * Indique si une onde a atteint un point donn�
	 * @param target Point que l'on d�sire tester (le point 0,0 se trouve en bas � gauche)
	 * @param when Moment o� l'on effectue le test comme retourn� par Robot.getTime()
	 * @return true si l'onde a atteint ou d�pass� le target au moment when
	 */
	public boolean reaches(Point2D.Double target, long when) 
	{
		return (when-startTime)*speed>=origin.distance(target);
	}

	/**
	 * D�termine l'angle avec lequel une onde touche un point
	 * @param target Point que l'on d�sire tester
	 * @return l'angle en radians entre le 0 de l'onde et le target
	 */
	public double getReachingAngle(Point2D.Double target)
	{
		return Utils.normalRelativeAngle(Utils.normalAbsoluteAngle(Math.atan2(target.x-origin.x, target.y-origin.y))-absBearing);
	}
	
	/**
	 * D�termine la vitesse d'un projectile en fonction de sa puissance
	 * @param firePower Puissance de feu
	 * @return la vitesse du projectile
	 */
	private double getFireSpeed(double firePower) 
	{
		return 20-firePower*3; 
	}
}