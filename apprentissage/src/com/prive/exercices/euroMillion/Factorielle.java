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
	// retourne la factorielle du nombre entier entr� en param�tre
	public BigInteger factorielle(Integer fac)
	throws ValueGrilleException // appel de la class exception
	{
		if (fac instanceof Integer && fac > 0) // test si le param�tre fourni est bien un entier positif sup�rieur � 0
		{
			// Si param�tre ok, ex�cution du calcul et retour du r�sultat
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
			// si test n�gatif, appel de la class exception et envoie d'un message d'erreur
			throw new ValueGrilleException("\tErreur\n"+
											"Un entier positif sup�rieur � 0 est attendu en param�tre");
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
											"2 entier positif sup�rieur � 0 sont attendu en param�tre\n"+
											"et le premier param�tre doit �tre sup�rieur au deuxi�me");
		}

	}
	// calcul des combinaisons total pour un jeu compos� d'une grille et d'une second liste de choix compl�mentaire
	public void fullCombinaison(String str, Integer grille1, Integer choix1, Integer grille2, Integer choix2)
	throws NameJeuxException, ValueGrilleException
	{
		if (str instanceof String)
		{
			if (grille1 instanceof Integer && grille1 > 0 && choix1 instanceof Integer && choix1 > 0 && grille1 > choix1) // test des valeurs de la premi�re grille
			{
				if (grille2 instanceof Integer && grille2 > 0 && choix2 instanceof Integer && choix2 > 0 && grille2 > choix2) // test des valeurs de la deuxi�me grille
				{
					Factorielle facto = new Factorielle();		
					BigInteger res = facto.simpleCombinaison(grille1, choix1).multiply(facto.simpleCombinaison(grille2, choix2));
					
					System.out.println("Pour le jeux : '"+str+"', il y a un total de '"+res+"' combinaisons possibles");
				}else
				{
					throw new ValueGrilleException("\tERREUR\n"+
							"2 entier positif sup�rieur � 0 sont attendu en param�tre 4-5\n"+
							"et le param�tre 4 doit �tre sup�rieur au 5");
				}
			}else
			{
				throw new ValueGrilleException("\tERREUR\n"+
						"2 entier positif sup�rieur � 0 sont attendu en param�tre 2-3\n"+
						"et le param�tre 2 doit �tre sup�rieur au 3");
			}
		}else
		{
			throw new NameJeuxException("un String est attendu en premier param�tre");
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
