package com.sdz.animal;

public class Test 
{
	public static void main(String[] args) 
	{
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							UTILSATIONS DES METHODES ABSTRAITES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//création d'un loup
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
	    System.out.println("\n\n-------------------------------------------------------------");
	    System.out.println("\tUTILSATIONS DES METHODES INTERFACES");
	    System.out.println("-------------------------------------------------------------");
	    Chien chi = new Chien("Beige", 15);
	    System.out.println(chi); 	//Méthode de la class Animal
	    chi.faireLeBeau();			//Méthode abstraite de la class Rintintin (Polymorphisme défini dans la class Chien)
	    chi.faireCalin();			//Méthode abstraite de la class Rintintin (Polymorphisme défini dans la class Chien)
	    chi.faireLechouille();		//Méthode abstraite de la class Rintintin (Polymorphisme défini dans la class Chien)
	}
}





































