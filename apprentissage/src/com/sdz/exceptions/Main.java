package com.sdz.exceptions;

import com.prive.exercices.Titre;

class Main 
{

	public static void main(String[] args) 
	{
		Titre titre = new Titre();
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// 									TRY CATCH
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		titre.titre("Exercice de lev� d'exception avec try catch");
		
		int i = 10;
		int j = 0;
		
		try {
			System.out.println(i/j);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		System.out.println("COUCOU!!!");
		
		titre.titre("Exercice de lev� d'exception avec try catch et finally");
		
		try {
			System.out.println(i/j);
		} catch (ClassCastException e) 
		{
			System.out.println("Avec Finally");
			e.printStackTrace();
		}
		finally {
			System.out.println("Action du Finally");
			titre.titre("Le finally permet d'ex�cuter le code pr�sent dans ces balise,\n"+
					"\tm�me si un erreur est lev� tout ce qui va ce trouv� en dehors\n"+
					"\tde ces balise sera automatiquement ignor�!!!", false);
			}
		System.out.println("En dehors du finally");
		
	}

}
