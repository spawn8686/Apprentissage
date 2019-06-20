package privateTest;

public class Boucle
{	
	public static void main(String[] args) 
	{
		puissance (8,10);
	}
	
	public static void puissance(int base, int value) 
	{		
		for (int i = 0; i <= value; i++) 
		{
			int produit = base;
			
			for (int j = 1; j < i; j++) 
			{
				produit = produit*base;
			}
			if (i==0) 
			{
				System.out.printf("%d^%d  =  %d\n", base, i, 1);
			}else {System.out.printf("%d^%d  =  %d\n", base, i, produit);}			
		}		
	}
}