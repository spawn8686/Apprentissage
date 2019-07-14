package com.sdz.genericite;

import com.prive.exercices.Titre;

public class Main 
{
	public static void main(String[] args) 
	{
		Titre ti = new Titre();
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//							G�n�ricit� � 1 param�tre
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ti.titre("G�n�ricit� � 1 param�tre");
		// Cr�ation de plusieurs objet Solo de type diff�rents
		Solo<Integer> solI = new Solo<Integer>(12);		// Integer
		Solo<Double> solD = new Solo<Double>(12.57);	// Double
		Solo<Character> solC = new Solo<Character>('B');// Char
		Solo<String> solS = new Solo<String>("Coucou");	// String
		Solo<Boolean> solB = new Solo<Boolean>(true);	// Boolean
		Solo<Byte> solBy = new Solo<Byte>((byte)000101);// Byte
		Solo<Short> solSh = new Solo<Short>((short)2);	// Short
		Solo<Long> solL = new Solo<Long>(132165l);		// Long
		Solo<Float> solF = new Solo<Float>(12.2f);		// Float
		
		
		//Chaque instanciation d'objet Solo peut aussi s'�crire de mani�re condens�e
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
		//							G�n�ricit� � 2 param�tres
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ti.titre("G�n�ricit� � 2 param�tres");
	}

}
