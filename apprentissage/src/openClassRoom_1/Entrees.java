package openClassRoom_1;

import java.util.Scanner;

public class Entrees 
{

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20615-apprenez-a-lire-les-entrees-clavier"
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Importation de la class java.util.scanner
		 * Cr�ation d'un objet Scanner, Cr�ation d'une variable String afin de r�cup�rer l'entr�e pr�c�dente
		 * affichage de la variable String avec System.out.println
		 * */
		Scanner sc1 =  new Scanner(System.in);
		System.out.println("Veuillez saisir un mot : ");
		String str = sc1.nextLine();
		System.out.println("Vous avez saisi : "+str);
		
		/*
		 * Cr�ation d'un objet Scanner, Cr�ation d'une variable int afin de r�cup�rer l'entr�e pr�c�dente
		 * affichage de la variable int avec System.out.println
		 * */
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier : ");
		int nbr1 = sc2.nextInt();
		System.out.println("Vous avez saisi le nombre : "+nbr1);
		
		/*
		 * Cr�ation d'un objet Scanner, Cr�ation d'une variable double 
		 * r�cup�ration en int de l'entr�e pr�c�dente et cast en double
		 * affichage de la variable double avec System.out.println
		 * */
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier : ");
		double nbr2 = (double)sc3.nextInt();
		System.out.println("Vous avez saisi : "+nbr2);
		
		/*
		 * Cr�ation d'un objet Scanner, Cr�ation d'une variable String, int et double
		 * R�cup�ration en cascade de chacune des valeurs
		 * affichage des variables String, int, double avec System.out.println
		 * */
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Entr� un mot : ");
		String mot = sc4.nextLine();
		System.out.println("Entr� un int : ");
		int valueInt = sc4.nextInt();
		System.out.println("Entr� un double : ");
		double valueDouble = sc4.nextDouble();
		System.out.println("Vous avez entr�e les infos suivantes : "+mot+" - "+valueInt+" - "+valueDouble);	
		
		/*
		 * Cr�ation d'un objet Scanner, Cr�ation d'une variable String et d'une variable char
		 * Affectation de l'entr�e dans la variable String
		 * Affectation du premier caract�re de la valeur String dans la variable char
		 * Affichage du caract�re avec System.out.println
		 * */
		System.out.println("Saisissez une lettre :");
		Scanner sc = new Scanner(System.in);
		String mot2 = sc.nextLine();
		char carac = mot2.charAt(0);
		System.out.println("Vous avez saisi le caract�re : " + carac);
		
		/*
		 * 
		 * */
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Saisissez un entier : ");
	    int int1 = scan.nextInt();
	    System.out.println("Saisissez une cha�ne : ");
	    //l'entr�e ne sera pas demand� et affichera direct "FIN ! "
	    String mot3 = scan.nextLine();      
	    System.out.println("FIN ! ");
	    
	    Scanner scan2 = new Scanner(System.in);
	    System.out.println("Saisissez un entier : ");
	    int int2 = scan2.nextInt();
	    System.out.println("Saisissez une cha�ne : ");
	    //On vide la ligne avant d'en lire une autre
	    scan2.nextLine();
	    String mot4 = scan2.nextLine();      
	    System.out.println("FIN ! ");
	}
}
