package com.sdz.animal;

import com.sdz.exercices.Titre;

public class Main 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Titre titre = new Titre();
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							UTILSATIONS DES METHODES ABSTRAITES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//création d'un loup
		titre.titre("UTILSATIONS DES METHODES ABSTRAITES"); // ----TITRE----
	    Animal lo = new Loup("Gris bleuté", 20);
	    lo.boire();
	    lo.manger();
	    lo.deplacement();
	    lo.crier();
	    System.out.println(lo.toString()+"\n\n");
	    
	    //création d'un tigre
	    Animal ti = new Tigre();
	    ti.crier();
	    System.out.println(ti.toString()+"\n\n");
	    
	    //création d'un chat
	    Animal ch = new Chat();
	    
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							UTILSATIONS DES METHODES INTERFACES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	    //Création d'un chien
		titre.titre("UTILSATIONS DES METHODES INTERFACES");// ----TITRE----
	    Chien chi = new Chien("Beige", 15);
	    System.out.println(chi); 	//Méthode de la class Animal
	    chi.faireLeBeau();			//Méthode abstraite de la class Rintintin (Polymorphisme défini dans la class Chien)
	    chi.faireCalin();			//Méthode abstraite de la class Rintintin (Polymorphisme défini dans la class Chien)
	    chi.faireLechouille();		//Méthode abstraite de la class Rintintin (Polymorphisme défini dans la class Chien)
	    
		titre.titre("TEST INTERFACES ET POLYMORPHISME");// ----TITRE----
	    
	    //Les méthodes d'un chien 
	    Chien c = new Chien("Gris bleuté", 20);
	    c.boire();
	    c.manger();
	    c.deplacement();
	    c.crier();
	    System.out.println(c.toString());
				
	    System.out.println("--------------------------------------------");
	    //Les méthodes de l'interface
	    c.faireCalin();
	    c.faireLeBeau();
	    c.faireLechouille();
			
	    System.out.println("--------------------------------------------");
	    //Utilisons le polymorphisme de notre interface
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	    // r.crier(); // la méthode crier(), ne peut être appelé ainsi, vu que nous avons ici l'interface rintintin qui ne contient pas cette méthode
	    
		titre.titre("DESIGN PATTERN");// ----TITRE----
	}
}





































