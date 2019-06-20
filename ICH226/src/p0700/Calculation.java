package p0700;

public class Calculation
{

	private int a = 0;
	private int b = 0;
	
	public Calculation(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int sum()
	{
		return a + b;
		
	}
	
	public int diff()
	{
		return a - b;
	}
}
