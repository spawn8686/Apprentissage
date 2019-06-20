package exercices;

import java.util.Scanner;

public class Factorielle 
{

	public static void main(String[] args) 
	{
		int facto, value, nouveau; 
		boolean choix = true;
		
		while(choix) 
		{
			// Récupération de la factorielle à calculer
			System.out.println("Entrez un entier pour le calcul de votre factorielle : ");
			Scanner scan = new Scanner(System.in);
			facto = scan.nextInt();
			scan.nextLine();
			
			// controle que la factrielle soit supérieur à 0 et calcul + résultat
			if (facto > 0) 
			{
				value = 0;
				for (int i = 0; i <= facto; i++) 
				{
					value = value + i;
				}
				System.out.println("La factorielle de "+facto+"! vaut = "+value+"\n");
				
				// nouveau calcul ou pas
				do
				{
					System.out.println("Voulez-vous effectuer un nouveau calcul?");
					System.out.println("1 : OUI");
					System.out.println("2 : NON");
					nouveau = scan.nextInt();
					scan.nextLine();
				}while(nouveau != 1 && nouveau != 2);
				// fin de boucle et message de fermeture
				if (nouveau == 2)
				{
					choix = false;
					System.out.println("Merci et aurevoir!");
					scan.close();
				}
			}else // pour tout entier plus petit que 1
				System.out.println("Une erreur c'est produite, veuillez choisir une autre factorielle supérieur à 0 !\n");
		}		
	}
}
