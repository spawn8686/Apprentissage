package com.sdz.animal;

public class Test 
{
	public static void main(String[] args) 
	{
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							UTILSATIONS DES METHODES ABSTRAITES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//cr�ation d'un loup
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
	    System.out.println("\n\n-------------------------------------------------------------");
	    System.out.println("\tUTILSATIONS DES METHODES INTERFACES");
	    System.out.println("-------------------------------------------------------------");
	    Chien chi = new Chien("Beige", 15);
	    System.out.println(chi); 	//M�thode de la class Animal
	    chi.faireLeBeau();			//M�thode abstraite de la class Rintintin (Polymorphisme d�fini dans la class Chien)
	    chi.faireCalin();			//M�thode abstraite de la class Rintintin (Polymorphisme d�fini dans la class Chien)
	    chi.faireLechouille();		//M�thode abstraite de la class Rintintin (Polymorphisme d�fini dans la class Chien)
	}
}





































