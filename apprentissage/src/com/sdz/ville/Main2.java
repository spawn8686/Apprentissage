package com.sdz.ville;

import com.prive.exercices.Titre;

class Main2 
{

	public static void main(String[] args)
	{
		Titre titre = new Titre();
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// Utilisations et gestions d'exeptions personnalis�es pour l'instanciation d'une classe Ville
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

		titre.titre("Utilisations et gestions d'exc"
				+ "exceptions personnalis�es\n"+
					"\tpour l'instanciation d'une classe Ville", true);
		
		Ville ville0 = null; // Cr�ation d'une ville null pour permettre son utilisation en dehors du try
		
		try {
			ville0 = new Ville("Mo", "Suisse", 10);	// Instanciation de la ville null dans le try avec des param�tres de test pour la lev�e d'exception
		} 
		// Seul le premier catch � lever une exception sera affich�
		// Fa�on d�taill� de g�rer les catch
/*
		catch (NbrHabitantsExceptions e) // l'exception est g�r�e par la class NbrHabitantsExceptions
		{
			System.out.println(e.getMessage()+"\n");
		}
				catch (NomVilleException e2) // l'exception est g�r�e par la class NomVilleException
		{
			System.out.println(e2.getMessage()+"\n");
		}
*/
		// fa�on condens� de g�rer les catch
		catch (NbrHabitantsExceptions | NomVilleException e) // l'exception est g�r�e par les class NbrHabitantsExceptions et NomVilleException
		{
			System.out.println(e.getMessage()+"\n");
		}
		// si une exception est lev�e dans la clause try, l'objet restera null, donc test est instanciation par defaut dans la clause finally
		finally		
		{
			if (ville0 == null) 
			{
				ville0 = new Ville();
			}
		}
		// en cas de lev�e d'exception dans la clause try et sans instanciation dans la clause finally, cette instruction levera une nouvelle exception. car l'objet ville0 sera toujours null
		System.out.println(ville0.toString());	

	}

}
