package p0100;

import java.util.Scanner;

public class P0125 {

	public static void main(String[] args) 
	{
		int valeur = 1;
		int intermediaire = 1;
		
		System.out.printf("indiquez une valeur entière = ");
		Scanner input = new Scanner(System.in);
		int indic = input.nextInt();
		
		// calcul factoriel
		for (int nbr = 1; nbr <= indic; nbr++) 
		{			
			valeur = valeur * nbr;
			
			System.out.printf("%d * %d = %d\n",intermediaire,nbr,valeur);
			
			intermediaire = valeur;
		}
		System.out.printf("\nLa factoriel de %d vaut %d",indic,valeur);
		input.close();
	}

	public static int factoriel(int indic) 
	{
		int valeur = 1;
		int intermediaire = 1;
		
		for (int nbr = 1; nbr <= indic; nbr++) 
		{			
			valeur = valeur * nbr;
			
			System.out.printf("%d * %d = %d\n",intermediaire,nbr,valeur);
			
			intermediaire = valeur;
		}
		return valeur;
	}
}
