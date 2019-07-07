package com.sdz.enumerations;

import com.sdz.exercices.Titre;

class MainEnumeration 
{
	public static void main(String[] args) 
	{
		Titre titre = new Titre();
		
		titre.titre("Test d'énumération des objets de la class enum");
		for (Langage langue : Langage.values()) 
		{
			if (Langage.JAVA.equals(langue)) 
				System.out.println("------"+langue+"------");
			else
				System.out.println(langue);
		}
		
		titre.titre("Test des méthodes de la class enum");
		Langage l1 = Langage.CSS;
		Langage l2 = Langage.JAVA;
		
		titre.titre("Contrôle des données avant modification", false);
		System.out.println("l1 name = "+l1.getName());
		System.out.println("l2 editor = "+l2.getEditor());
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		titre.titre("Modification des données", false);		
		l1.setName("CSS3");
		l2.setEditor("SublimText");
		
		titre.titre("Contrôle des données après modification", false);
		System.out.println("l1 name = "+l1.getName());
		System.out.println("l2 editor = "+l2.getEditor());
		System.out.println(l1.toString());
		System.out.println(l2.toString());
	}

}
