package com.sdz.exercices.euroMillion;

import java.math.BigInteger;

class Main {

	public static void main(String[] args) 
	{
		Factorielle facto = new Factorielle();
		BigInteger res = facto.simpleCombinaison(50, 5).multiply(facto.simpleCombinaison(9, 2));
		
		System.out.println("le nombre de possibilit� pour l'EuroMillion, sans les �toiles, est de \""+facto.simpleCombinaison(50, 5)+"\"");
		
		System.out.println("le nombre de possibilit� pour l'EuroMillion, uniquement des �toiles, est de \""+facto.simpleCombinaison(9, 2)+"\"");	
		
		System.out.println("le nombre TOTAL de possibilit� pour l'EuroMillion est de \""+res+"\"");
		
		facto.fullCombinaison("EuroMillion", 50, 9, 5, 2);
	}

}
