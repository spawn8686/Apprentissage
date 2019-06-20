package openClassRoom_1;

public class Methodes {

	public static void main(String[] args) 
	{
		//	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//  lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/21114-ecrivez-des-methodes-de-classe"
		//  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Petite d�monstration d'utilisation de m�thodes existantes
		 * - M�thode qui permet de mettre du texte en MAJUSCULE
		 * - M�thode qui permet de mettre du texte en minuscule
		 * */		
		String str1 = new String("texte initiale minuscule");
		String str2 = new String("TEXTE DE BASE MAJUSCULE");
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		/*
		 * - M�thode pour compter le nombre de caract�res d'une phrase "espace inclus"
		 * */
		int t = str1.length();
		System.out.println("La variable \"str1\" compte "+t+" caract�res");
		System.out.println("La variable \"str2\" compte "+str2.length()+" caract�res");
	
		/*
		 * - M�thode pour v�rifier l'�galit� de 2 cha�nes de caract�res
		 * */
		str1 = "coucou";
		str2 = "coucou";
		
			if (str1.equals(str2)) // str1 est �gal � str2
				System.out.println("les cha�nes \"str1 - str2\" sont identiques");
			else
				System.out.println("Les cha�nes \"str1 - str2\" sont diff�rentes");
			
			if (!str1.equals(str2)) // str1 n'est pas �gal � str2
				System.out.println("les cha�nes \"str1 - str2\" sont diff�rentes");
			else
				System.out.println("Les cha�nes \"str1 - str2\" sont identiques");
		
		/*
		 * - M�thode pour extraire un caract�re d'un string
		 * - fonctionne comme un tableau (le premier caract�re vaut 0)
		 * */
		str1 = "cha�neDeCaract�res";
		System.out.println(str1.charAt(3));
		
		/*
		 * - M�thode pour extraire une cha�ne de caract�res d'un string
		 * - le premier argument indique le premier caract�re (inclu)
		 * - le deuxi�me argument indique le derni�re caract�re (exclu)
		 * - fonctionne comme un tableau (le premier carat�re vaut 0)
		 * */
		System.out.println(str1.substring(6, 8));
		
		/*
		 * - M�thode pour retrouver la position d'un caract�re ou une cha�ne de caract�re
		 * - indexOf commence du d�but
		 * - lastIndexOf commence de la fin
		 * - renvoie un entier de la premi�re place ou le d�but de l'argument commence
		 * - renvoie la valeur -1 si l'argument n'est pas trouv�
		 * */
		System.out.println();
		System.out.println("le '�' ce situe � la place ("+str1.indexOf('�')+") de la cha�ne de caract�res");
		System.out.println("le 'De' ce situe � la place ("+str1.indexOf("De")+") de la cha�ne de caract�res");
		System.out.println("le '�' ce situe � la place ("+str1.lastIndexOf('�')+") de la cha�ne de caract�res");
		System.out.println("le 'De' ce situe � la place ("+str1.lastIndexOf("De")+") de la cha�ne de caract�res");
		System.out.println("le 'x' ce situe � la place ("+str1.indexOf('x')+") de la cha�ne de caract�res");
		System.out.println("le 'x' ce situe � la place ("+str1.lastIndexOf('x')+") de la cha�ne de caract�res");
		
		/*
		 * - exemple de m�thode de la classe "Math" pr�sente nativement dans le java.lang
		 * - toutes ces m�thodes retourne un double
		 * */
		double x = 0.0, sin = 120.0, cos = 120.0, tan = 120.0, abs = -120.0, pow = 8.0;
		
		System.out.println();
		System.out.println(x = Math.random());// M�thode random, renvoie de mani�re al�atoire une nombre entre 0 et 1
		System.out.println(sin = Math.sin(sin));// Renvoie le Sinus de l'argument
		System.out.println(cos = Math.cos(cos));// Renvoie le Cosinus de l'argument
		System.out.println(tan = Math.tan(tan));// Renvoie la Tangeante de l'argument
		System.out.println(abs = Math.abs(abs));// Renvoie la valeur absolue (positive) de l'argument
		System.out.println(pow = Math.pow(pow, 2));//Renvoie la puissance (1er argument la base, 2�me argument l'exposant)
		
		/*
		 * - Exercice d'affichage d'un tableau, � l'aide d'une m�thode personnalis�
		 * */
		String tab[] = {"oui","non","titi","tata","tutu","toto","tete"};
		parcourirTableau(tab);
		System.out.println(toString(tab));
		
		String[] tabStr = {"toto", "titi", "tata"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};

		//La m�thode avec un tableau de String sera invoqu�e
		parcourirTableau(tabStr);
		//La m�thode avec un tableau d'int sera invoqu�e
		parcourirTableau(tabInt);
		//La m�thode avec un tableau de String � deux dimensions sera invoqu�e
		parcourirTableau(tabStr2);
	}// FIN DE LA M�THODE MAIN
	//
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * 											CR�ATION DE M�THODE PERSONNALIS�E
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	
	/*
	 * M�thode d'arrondi
	 * */
	public static double arrondi(double a, double b)
	{
		return (double) ((int) (a + Math.pow(10, b) + 0.5)) / Math.pow(10, b);
	}
	
	/*
	 * - M�thode pour parcourir un tableau
	 * - surcharge de la m�thode pour listage tableau String, int, 1D et 2D
	 * */
	// Tableau String 1D
	static void parcourirTableau(String[] tab) 
	{
		System.out.println();
		for (String str : tab) 
			System.out.println(str);
	}
	// Tableau int 1D
	static void parcourirTableau(int[] tab)
	{
		System.out.println();
		for (int str : tab) 
			System.out.println(str);
	}
	// Tableau String 2D
	static void parcourirTableau(String[][] tab) 
	{
		System.out.println();
		for(String str2[] : tab)
		{
			for (String str : str2) 
				System.out.println(str);
		}		
	}
	// Tableau int 2D
	static void parcourirTableau(int[][] tab)
	{
		System.out.println();
		for(int str2[] : tab)
		{
			for (int str : str2) 
				System.out.println(str);
		}		
	}
	
	/*
	 * M�thode pour parcourir un tableau, 2eme m�thode
	 * avec retour d'un String
	 * */
	static String toString(String[] tab)
	{
		String retour = new String("");
		System.out.println();
		retour = "m�thode avec retour de valeur string !!\n";
		
		for (String str : tab) 
		{
			retour += str + "\n";
		}
		return retour;
	}
}
















