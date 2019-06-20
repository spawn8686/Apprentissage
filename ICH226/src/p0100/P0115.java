package p0100;

public class P0115 {

	int iNombre = 0;
	
	public static void main(String[] args) 
	{
		puissance (10);
	}
	
	public static void puissance(int value) 
	{
		for (int i = 0; i <= value; i++) 
		{
			System.out.printf("Le carré de %d vaut %d\n", i, i*i);
		}
		
	}
}
