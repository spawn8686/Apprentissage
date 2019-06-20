package appui;

public class Fibonacci 
{	
	static long nbr1 = 1;
	static long nbr2 = 0;
	static long res;
	static short boucle;	
	
	public static void main(String[] args) 
	{
		for(boucle = 1; boucle > 0; boucle++)
		{
			res = nbr1 + nbr2;
			nbr1 = nbr2;
			nbr2 = res;
				
			System.out.println("Nombre "+boucle+" vaut : " +res);
			
			if(boucle == 20)
			{
				break;
			}
		}
	}
}
