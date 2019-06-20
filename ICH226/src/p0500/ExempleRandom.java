package p0500;

import java.util.Random;

public class ExempleRandom 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		int i = r.nextInt(20);
		System.out.println(i);
	}

}
