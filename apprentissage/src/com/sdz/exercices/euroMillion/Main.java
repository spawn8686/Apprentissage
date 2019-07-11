package com.sdz.exercices.euroMillion;

import java.math.BigInteger;

class Main {

	public static void main(String[] args) 
	{
		Factorielle facto = new Factorielle();
	
		BigInteger nbr1 = facto.facteur(50);
		BigInteger nbr2 = facto.facteur(45);
		BigInteger nbr3 = facto.facteur(5);
		BigInteger nbr4 = facto.facteur(9);
		BigInteger nbr5 = facto.facteur(7);
		BigInteger nbr6 = facto.facteur(2);
		
		BigInteger C0 = nbr2.multiply(nbr3);
		BigInteger C = nbr1.divide(C0);
		BigInteger E0 = nbr5.multiply(nbr6);
		BigInteger E = nbr4.divide(E0);
		BigInteger Result = C.multiply(E);
		
		System.out.println("le nombre de possibilité pour l'EuroMillion est de \""+Result+"\"");
	}

}
