package p0700;

public class TriangleRectangle
{
	private double a;
	private double b;
	
	public TriangleRectangle(double a, double b)
	{
		this.a = a;
		this.b = b;
	}

	public double getHypotenuse()
	{
		//return Math.sqrt(a*a+b*b);
		return Math.hypot(a, b);
	}
	
	public double getAngle()
	{
		return Math.toDegrees(Math.atan2(b, a));
	}
}
