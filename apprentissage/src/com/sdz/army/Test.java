package com.sdz.army;

import exercices.Titre;

public class Test {

	public static void main(String[] args) 
	{
		Titre titre = new Titre();
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//										TESTS DES CONSTRUCTEURS
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		titre.titre("TEST DES CONSTRUCTEURS SANS PARAMETRE");
		Personnage per0 = new Civil();
		Personnage per1= new Sniper();
		Personnage per2 = new Guerrier();
		Personnage per3 = new Medecin();
		Personnage per4 = new Chirurgien();
		
		titre.titre("TEST DES CONSTRUCTEURS AVEC PARAMETRES");
		Personnage per00 = new Civil(1,1);
		System.out.println(per00.toString());
		Personnage per01= new Sniper(6,3);
		System.out.println(per01.toString());
		Personnage per02 = new Guerrier(4,5);
		System.out.println(per02.toString());
		Personnage per03 = new Medecin(3,2);
		System.out.println(per03.toString());
		Personnage per04 = new Chirurgien(2,1);
		System.out.println(per04.toString());
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//										TESTS DES METHODES SIMPLES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		titre.titre("TEST DES METHODES SIMPLES");
		Personnage[] tpers = {new Civil(1,1), new Sniper(6,3), new Guerrier(4,5), new Medecin(3,2), new Chirurgien(2,1)}; // création d'un tableau d'objet
		for (Personnage p : tpers) // parcours du tableau d'objet et test des méthodes associées
		{
			System.out.println("\nJe suis un "+p.getClass().getSimpleName());
			System.out.println("*****************************************");
			p.combattre();
			p.seDeplacer();
			p.soigner();
		}
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							TESTS DES METHODES AVEC VARIABLES D'INSTANCES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		titre.titre("TESTS DES METHODES AVEC VARIABLES D'INSTANCES");
		Personnage[] tpers2 = {new Civil(1,1), new Sniper(6,3), new Guerrier(4,5), new Medecin(3,2), new Chirurgien(2,1)};
		 String[] tarmes = {"pistolet", "pistolet", "couteau", "pompe", "couteau"}; 

		  for(int i = 0; i < tpers.length; i++){
		    System.out.println("\nJe suis un " + tpers[i].getClass().getName());
		    System.out.println("*****************************************");
		    tpers2[i].combattre();
		    tpers2[i].setArmes(tarmes[i]);
		    tpers2[i].combattre();
		    tpers2[i].seDeplacer();
		    tpers2[i].soigner();
		  }		
	}

}
