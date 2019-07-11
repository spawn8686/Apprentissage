package com.sdz.exercices.euroMillion;

import java.math.BigInteger;

class Main {

	public static void main(String[] args) 
	{
		Factorielle facto = new Factorielle();
		BigInteger res = facto.simpleCombinaison(50, 5).multiply(facto.simpleCombinaison(9, 2));
		
		System.out.println("le nombre de possibilité pour l'EuroMillion, sans les étoiles, est de \""+facto.simpleCombinaison(50, 5)+"\"");
		
		System.out.println("le nombre de possibilité pour l'EuroMillion, uniquement des étoiles, est de \""+facto.simpleCombinaison(9, 2)+"\"");	
		
		System.out.println("le nombre TOTAL de possibilité pour l'EuroMillion est de \""+res+"\"");
		
		facto.fullCombinaison("EuroMillion", 50, 9, 5, 2);
	}

}
