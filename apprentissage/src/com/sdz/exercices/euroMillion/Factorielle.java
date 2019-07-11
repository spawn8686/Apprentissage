package com.sdz.exercices.euroMillion;

import java.math.BigInteger;

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// 						Class pour le calcul d'une factorielle
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

class Factorielle 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									VARIABLES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	int facteur = 1;
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Factorielle()
	{}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									METHODES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// retourne la factorielle du nombre entier entré en paramètre
	public BigInteger facteur(int fac)
	{
		this.facteur = fac;
		int loop = 1;
		BigInteger result = BigInteger.ONE;
		
		while (loop <= this.facteur) 
		{
			result = result.multiply(BigInteger.valueOf(loop));
			loop++;
		}
		
		return result;
	}
	public BigInteger simpleCombinaison(int grille, int choix)
	{
		Factorielle facto = new Factorielle();
		
		BigInteger nbr1 = facto.facteur(grille);
		BigInteger nbr2 = facto.facteur(grille - choix);
		BigInteger nbr3 = facto.facteur(choix);
		
		BigInteger temp = nbr2.multiply(nbr3);
		BigInteger result = nbr1.divide(temp);		
		
		return result;
	}
	public void fullCombinaison(String str, int grille1, int grille2, int choix1, int choix2)
	{
		Factorielle facto = new Factorielle();		
		BigInteger res = facto.simpleCombinaison(grille1, choix1).multiply(facto.simpleCombinaison(grille2, choix2));
		
		System.out.println("Pour le jeux : '"+str+"', il y a un total de '"+res+"' possiblités");
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									GETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public int getFacteur()
	{
		return this.facteur;
	}
}
