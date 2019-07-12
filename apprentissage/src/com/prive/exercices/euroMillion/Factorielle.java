package com.prive.exercices.euroMillion;

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
	public BigInteger factorielle(Integer fac)
	throws ValueGrilleException // appel de la class exception
	{
		if (fac instanceof Integer && fac > 0) // test si le paramètre fourni est bien un entier positif supérieur à 0
		{
			// Si paramètre ok, exécution du calcul et retour du résultat
			this.facteur = fac;
			int loop = 1;
			BigInteger result = BigInteger.ONE;
			
			while (loop <= this.facteur) 
			{
				result = result.multiply(BigInteger.valueOf(loop));
				loop++;
			}
			
			return result;
		}else
		{
			// si test négatif, appel de la class exception et envoie d'un message d'erreur
			throw new ValueGrilleException("\tErreur\n"+
											"Un entier positif supérieur à 0 est attendu en paramètre");
		}

	}
	// Calcul des combinaisons possible pour un jeu simple, comportant une grille unique
	public BigInteger simpleCombinaison(Integer grille, Integer choix)
	throws ValueGrilleException
	{
		if (grille instanceof Integer && grille > 0 && choix instanceof Integer && choix > 0 && grille > choix) 
		{
			Factorielle facto = new Factorielle();
			
			BigInteger nbr1 = facto.factorielle(grille);
			BigInteger nbr2 = facto.factorielle(grille - choix);
			BigInteger nbr3 = facto.factorielle(choix);
			
			BigInteger temp = nbr2.multiply(nbr3);
			BigInteger result = nbr1.divide(temp);		
			
			return result;
		}else
		{
			throw new ValueGrilleException("\tERREUR\n"+
											"2 entier positif supérieur à 0 sont attendu en paramètre\n"+
											"et le premier paramètre doit être supérieur au deuxième");
		}

	}
	// calcul des combinaisons total pour un jeu composé d'une grille et d'une second liste de choix complémentaire
	public void fullCombinaison(String str, Integer grille1, Integer choix1, Integer grille2, Integer choix2)
	throws NameJeuxException, ValueGrilleException
	{
		if (str instanceof String)
		{
			if (grille1 instanceof Integer && grille1 > 0 && choix1 instanceof Integer && choix1 > 0 && grille1 > choix1) // test des valeurs de la première grille
			{
				if (grille2 instanceof Integer && grille2 > 0 && choix2 instanceof Integer && choix2 > 0 && grille2 > choix2) // test des valeurs de la deuxième grille
				{
					Factorielle facto = new Factorielle();		
					BigInteger res = facto.simpleCombinaison(grille1, choix1).multiply(facto.simpleCombinaison(grille2, choix2));
					
					System.out.println("Pour le jeux : '"+str+"', il y a un total de '"+res+"' combinaisons possibles");
				}else
				{
					throw new ValueGrilleException("\tERREUR\n"+
							"2 entier positif supérieur à 0 sont attendu en paramètre 4-5\n"+
							"et le paramètre 4 doit être supérieur au 5");
				}
			}else
			{
				throw new ValueGrilleException("\tERREUR\n"+
						"2 entier positif supérieur à 0 sont attendu en paramètre 2-3\n"+
						"et le paramètre 2 doit être supérieur au 3");
			}
		}else
		{
			throw new NameJeuxException("un String est attendu en premier paramètre");
		}
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									GETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public int getFacteur()
	{
		return this.facteur;
	}
}
