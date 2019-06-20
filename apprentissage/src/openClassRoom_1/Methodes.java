package openClassRoom_1;

public class Methodes {

	public static void main(String[] args) 
	{
		//	%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//  lien de l'exercice "https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/21114-ecrivez-des-methodes-de-classe"
		//  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		/*
		 * Petite démonstration d'utilisation de méthodes existantes
		 * - Méthode qui permet de mettre du texte en MAJUSCULE
		 * - Méthode qui permet de mettre du texte en minuscule
		 * */		
		String str1 = new String("texte initiale minuscule");
		String str2 = new String("TEXTE DE BASE MAJUSCULE");
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		/*
		 * - Méthode pour compter le nombre de caractères d'une phrase "espace inclus"
		 * */
		int t = str1.length();
		System.out.println("La variable \"str1\" compte "+t+" caractères");
		System.out.println("La variable \"str2\" compte "+str2.length()+" caractères");
	
		/*
		 * - Méthode pour vérifier l'égalité de 2 chaînes de caractères
		 * */
		str1 = "coucou";
		str2 = "coucou";
		
			if (str1.equals(str2)) // str1 est égal à str2
				System.out.println("les chaînes \"str1 - str2\" sont identiques");
			else
				System.out.println("Les chaînes \"str1 - str2\" sont différentes");
			
			if (!str1.equals(str2)) // str1 n'est pas égal à str2
				System.out.println("les chaînes \"str1 - str2\" sont différentes");
			else
				System.out.println("Les chaînes \"str1 - str2\" sont identiques");
		
		/*
		 * - Méthode pour extraire un caractère d'un string
		 * - fonctionne comme un tableau (le premier caractère vaut 0)
		 * */
		str1 = "chaîneDeCaractères";
		System.out.println(str1.charAt(3));
		
		/*
		 * - Méthode pour extraire une chaîne de caractères d'un string
		 * - le premier argument indique le premier caractère (inclu)
		 * - le deuxième argument indique le dernière caractère (exclu)
		 * - fonctionne comme un tableau (le premier caratère vaut 0)
		 * */
		System.out.println(str1.substring(6, 8));
		
		/*
		 * - Méthode pour retrouver la position d'un caractère ou une chaîne de caractère
		 * - indexOf commence du début
		 * - lastIndexOf commence de la fin
		 * - renvoie un entier de la première place ou le début de l'argument commence
		 * - renvoie la valeur -1 si l'argument n'est pas trouvé
		 * */
		System.out.println();
		System.out.println("le 'è' ce situe à la place ("+str1.indexOf('è')+") de la chaîne de caractères");
		System.out.println("le 'De' ce situe à la place ("+str1.indexOf("De")+") de la chaîne de caractères");
		System.out.println("le 'è' ce situe à la place ("+str1.lastIndexOf('è')+") de la chaîne de caractères");
		System.out.println("le 'De' ce situe à la place ("+str1.lastIndexOf("De")+") de la chaîne de caractères");
		System.out.println("le 'x' ce situe à la place ("+str1.indexOf('x')+") de la chaîne de caractères");
		System.out.println("le 'x' ce situe à la place ("+str1.lastIndexOf('x')+") de la chaîne de caractères");
		
		/*
		 * - exemple de méthode de la classe "Math" présente nativement dans le java.lang
		 * - toutes ces méthodes retourne un double
		 * */
		double x = 0.0, sin = 120.0, cos = 120.0, tan = 120.0, abs = -120.0, pow = 8.0;
		
		System.out.println();
		System.out.println(x = Math.random());// Méthode random, renvoie de manière aléatoire une nombre entre 0 et 1
		System.out.println(sin = Math.sin(sin));// Renvoie le Sinus de l'argument
		System.out.println(cos = Math.cos(cos));// Renvoie le Cosinus de l'argument
		System.out.println(tan = Math.tan(tan));// Renvoie la Tangeante de l'argument
		System.out.println(abs = Math.abs(abs));// Renvoie la valeur absolue (positive) de l'argument
		System.out.println(pow = Math.pow(pow, 2));//Renvoie la puissance (1er argument la base, 2ème argument l'exposant)
		
		/*
		 * - Exercice d'affichage d'un tableau, à l'aide d'une méthode personnalisé
		 * */
		String tab[] = {"oui","non","titi","tata","tutu","toto","tete"};
		parcourirTableau(tab);
		System.out.println(toString(tab));
		
		String[] tabStr = {"toto", "titi", "tata"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};

		//La méthode avec un tableau de String sera invoquée
		parcourirTableau(tabStr);
		//La méthode avec un tableau d'int sera invoquée
		parcourirTableau(tabInt);
		//La méthode avec un tableau de String à deux dimensions sera invoquée
		parcourirTableau(tabStr2);
	}// FIN DE LA MÉTHODE MAIN
	//
	/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	 * 											CRÉATION DE MÉTHODE PERSONNALISÉE
	 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
	
	/*
	 * Méthode d'arrondi
	 * */
	public static double arrondi(double a, double b)
	{
		return (double) ((int) (a + Math.pow(10, b) + 0.5)) / Math.pow(10, b);
	}
	
	/*
	 * - Méthode pour parcourir un tableau
	 * - surcharge de la méthode pour listage tableau String, int, 1D et 2D
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
	 * Méthode pour parcourir un tableau, 2eme méthode
	 * avec retour d'un String
	 * */
	static String toString(String[] tab)
	{
		String retour = new String("");
		System.out.println();
		retour = "méthode avec retour de valeur string !!\n";
		
		for (String str : tab) 
		{
			retour += str + "\n";
		}
		return retour;
	}
}
















