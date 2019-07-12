package com.prive.exercices.euroMillion;

class Main {

	public static void main(String[] args) 
	{
		Factorielle facto = new Factorielle();
		
		try // test des exceptions pour la méthode factorielle
		{
			System.out.println(facto.factorielle(6));
			System.out.println(facto.factorielle(1));
			System.out.println(facto.factorielle(5));
		}catch (ValueGrilleException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try // test des exceptions pour la méthode simpleCombinaison
		{
			System.out.println(facto.simpleCombinaison(6, 5));
		} catch (ValueGrilleException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try // test des exceptions pour la méthode fullCombinaison
		{
			facto.fullCombinaison("EuroMillion", 50, 5, 9, 2);
		} catch (NameJeuxException | ValueGrilleException e) 
		{
			System.out.println(e.getMessage());
		}
		
		try // Test de différents jeux de loterie dans le monde 
		{
			System.out.println("Le Powerball de nouvelle-Zélande, donne "+facto.simpleCombinaison(40, 6).multiply(facto.simpleCombinaison(10, 1)).multiply(facto.simpleCombinaison(34, 1))+" combinaisons possible");
			System.out.println("Le Lotofácil au Brésil, donne "+facto.simpleCombinaison(25, 15)+" combinaisons possible");
			facto.fullCombinaison("loto suisse", 42, 6, 6, 1);
			facto.fullCombinaison("MegaMillions au Etat-Uni", 70, 5, 25, 1);
		} catch (ValueGrilleException | NameJeuxException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
