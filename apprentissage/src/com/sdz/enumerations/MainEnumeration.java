package com.sdz.enumerations;

import com.sdz.exercices.Titre;

class MainEnumeration 
{
	public static void main(String[] args) 
	{
		Titre titre = new Titre();
		
		titre.titre("Test d'�num�ration des objets de la class enum");
		for (Langage langue : Langage.values()) 
		{
			if (Langage.JAVA.equals(langue)) 
				System.out.println("------"+langue+"------");
			else
				System.out.println(langue);
		}
		
		titre.titre("Test des m�thodes de la class enum");
		Langage l1 = Langage.CSS;
		Langage l2 = Langage.JAVA;
		
		titre.titre("Contr�le des donn�es avant modification", false);
		System.out.println("l1 name = "+l1.getName());
		System.out.println("l2 editor = "+l2.getEditor());
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		titre.titre("Modification des donn�es", false);		
		l1.setName("CSS3");
		l2.setEditor("SublimText");
		
		titre.titre("Contr�le des donn�es apr�s modification", false);
		System.out.println("l1 name = "+l1.getName());
		System.out.println("l2 editor = "+l2.getEditor());
		System.out.println(l1.toString());
		System.out.println(l2.toString());
	}

}
