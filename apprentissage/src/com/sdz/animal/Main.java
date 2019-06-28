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
		//cr�ation d'un loup
		titre.titre("UTILSATIONS DES METHODES ABSTRAITES"); // ----TITRE----
	    Animal lo = new Loup("Gris bleut�", 20);
	    lo.boire();
	    lo.manger();
	    lo.deplacement();
	    lo.crier();
	    System.out.println(lo.toString()+"\n\n");
	    
	    //cr�ation d'un tigre
	    Animal ti = new Tigre();
	    ti.crier();
	    System.out.println(ti.toString()+"\n\n");
	    
	    //cr�ation d'un chat
	    Animal ch = new Chat();
	    
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							UTILSATIONS DES METHODES INTERFACES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	    //Cr�ation d'un chien
		titre.titre("UTILSATIONS DES METHODES INTERFACES");// ----TITRE----
	    Chien chi = new Chien("Beige", 15);
	    System.out.println(chi); 	//M�thode de la class Animal
	    chi.faireLeBeau();			//M�thode abstraite de la class Rintintin (Polymorphisme d�fini dans la class Chien)
	    chi.faireCalin();			//M�thode abstraite de la class Rintintin (Polymorphisme d�fini dans la class Chien)
	    chi.faireLechouille();		//M�thode abstraite de la class Rintintin (Polymorphisme d�fini dans la class Chien)
	    
		titre.titre("TEST INTERFACES ET POLYMORPHISME");// ----TITRE----
	    
	    //Les m�thodes d'un chien 
	    Chien c = new Chien("Gris bleut�", 20);
	    c.boire();
	    c.manger();
	    c.deplacement();
	    c.crier();
	    System.out.println(c.toString());
				
	    System.out.println("--------------------------------------------");
	    //Les m�thodes de l'interface
	    c.faireCalin();
	    c.faireLeBeau();
	    c.faireLechouille();
			
	    System.out.println("--------------------------------------------");
	    //Utilisons le polymorphisme de notre interface
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	    // r.crier(); // la m�thode crier(), ne peut �tre appel� ainsi, vu que nous avons ici l'interface rintintin qui ne contient pas cette m�thode
	    
		titre.titre("DESIGN PATTERN");// ----TITRE----
	}
}





































