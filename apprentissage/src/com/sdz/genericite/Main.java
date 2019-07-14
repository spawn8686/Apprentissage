package com.sdz.genericite;

import java.util.*;

import com.prive.exercices.Titre;

public class Main 
{
	public static void main(String[] args) 
	{
		Titre ti = new Titre();
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							Généricité à 1 paramètre
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ti.titre("Généricité à 1 paramètre");
		// Création de plusieurs objet Solo de type différents
		Solo<Integer> solI = new Solo<Integer>(12);		// Integer
		Solo<Double> solD = new Solo<Double>(12.57);	// Double
		Solo<Character> solC = new Solo<Character>('B');// Char
		Solo<String> solS = new Solo<String>("Coucou");	// String
		Solo<Boolean> solB = new Solo<Boolean>(true);	// Boolean
		Solo<Byte> solBy = new Solo<Byte>((byte)000101);// Byte
		Solo<Short> solSh = new Solo<Short>((short)2);	// Short
		Solo<Long> solL = new Solo<Long>(132165l);		// Long
		Solo<Float> solF = new Solo<Float>(12.2f);		// Float
		
		
		//Chaque instanciation d'objet Solo peut aussi s'écrire de manière condensée
		/*
		Solo<Integer> solI = new Solo<>(12);		// Integer
		Solo<Double> solD = new Solo<>(12.57);		// Double
		Solo<Character> solC = new Solo<>('B');		// Char
		Solo<String> solS = new Solo<>("Coucou");	// String
		Solo<Boolean> solB = new Solo<>(true);		// Boolean	
		Solo<Byte> solBy = new Solo<>((byte)000101);// Byte
		Solo<Short> solSh = new Solo<>((short)2);	// Short
		Solo<Long> SoloL = new Solo<>(132165l);		// Long
		Solo<Float> SoloF = New Solo<>(12.2f);		// Float 
		*/
		
		int i = solI.getSolo();
		double d = solD.getSolo();
		char c = solC.getSolo();
		String str = solS.getSolo();
		boolean b = solB.getSolo();
		byte by = solBy.getSolo();
		short s = solSh.getSolo();
		long l = solL.getSolo();
		float f = solF.getSolo();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(str);
		System.out.println(b);
		System.out.println(by);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							Généricité à 2 paramètres
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ti.titre("Généricité à 2 paramètres");
		
		Duo<String, Boolean> dual = new Duo<>("toto", true);
		System.out.println("Valeur de l'objet dual : val1 = " + dual.getValue1() + ", val2 = " + dual.getValue2());
		                
		Duo<Double, Character> dual2 = new Duo<>(12.2585, 'C');
		System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValue1() + ", val2 = " + dual2.getValue2());
		  
		  
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							Généricité et collection d'objets
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ti.titre("La Généricité et les collections d'Objets");

		ti.titre("Liste de String", false);
		List<String> listeString= new ArrayList<String>();
		listeString.add("Une chaîne");
		listeString.add("Une autre");
		listeString.add("Encore une autre");
		listeString.add("Allez, une dernière");
		
		for(String str2: listeString)
			System.out.println(str2);

		ti.titre("Liste de float", false);
		                
		List<Float> listeFloat = new ArrayList<Float>();
		listeFloat.add(12.25f);
		listeFloat.add(15.25f);
		listeFloat.add(2.25f);
		listeFloat.add(128764.25f);
		                
		for(float f2 : listeFloat)
		  System.out.println(f2);
	}

}





























