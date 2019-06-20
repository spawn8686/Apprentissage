package p0400;

import java.awt.geom.Point2D;

import robocode.Robot;

public class Location extends Point2D.Double 
{
	private static final long serialVersionUID = 1L;
	private double angle;
	private double distance;
	
	public Location(Robot me, double angle, double distance)
	{
		double angleTotal, angleRadians;
		angleTotal = angle + me.getHeading();
		angleRadians = Math.toRadians(angleTotal);
		x = me.getX() + Math.sin(angleRadians)* distance;
		y = me.getY() + Math.cos(angleRadians)* distance;
		this.angle = angle;
		this.distance = distance;
	}
	
	public double getAngle()
	{
		return angle;
	}
	
	public double getDistance()
	{
		return distance;
	}
}
