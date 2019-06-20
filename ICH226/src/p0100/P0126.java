package p0100;

import java.util.Scanner;

public class P0126 {

	public static void main(String[] args) 
	{		
		System.out.printf("indiquez une valeur entière = ");
		Scanner input = new Scanner(System.in);
		int nbr = input.nextInt();
		
		
		System.out.printf("\nLa factoriel de %d vaut %d",nbr,factoriel(nbr));
		input.close();
	}

	public static int factoriel(int nbr) 
	{
		if(nbr == 0)
		{
			return 1;			
		}
		return nbr * factoriel(nbr -1);
	}
}
