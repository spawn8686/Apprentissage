package com.sdz.ville;

import com.prive.exercices.Titre;

class Main2 
{

	public static void main(String[] args)
	{
		Titre titre = new Titre();
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// Utilisations et gestions d'exeptions personnalisées pour l'instanciation d'une classe Ville
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

		titre.titre("Utilisations et gestions d'exc"
				+ "exceptions personnalisées\n"+
					"\tpour l'instanciation d'une classe Ville", true);
		
		Ville ville0 = null; // Création d'une ville null pour permettre son utilisation en dehors du try
		
		try {
			ville0 = new Ville("Mo", "Suisse", 10);	// Instanciation de la ville null dans le try avec des paramètres de test pour la levée d'exception
		} 
		// Seul le premier catch à lever une exception sera affiché
		// Façon détaillé de gérer les catch
/*
		catch (NbrHabitantsExceptions e) // l'exception est gérée par la class NbrHabitantsExceptions
		{
			System.out.println(e.getMessage()+"\n");
		}
				catch (NomVilleException e2) // l'exception est gérée par la class NomVilleException
		{
			System.out.println(e2.getMessage()+"\n");
		}
*/
		// façon condensé de gérer les catch
		catch (NbrHabitantsExceptions | NomVilleException e) // l'exception est gérée par les class NbrHabitantsExceptions et NomVilleException
		{
			System.out.println(e.getMessage()+"\n");
		}
		// si une exception est levée dans la clause try, l'objet restera null, donc test est instanciation par defaut dans la clause finally
		finally		
		{
			if (ville0 == null) 
			{
				ville0 = new Ville();
			}
		}
		// en cas de levée d'exception dans la clause try et sans instanciation dans la clause finally, cette instruction levera une nouvelle exception. car l'objet ville0 sera toujours null
		System.out.println(ville0.toString());	

	}

}
