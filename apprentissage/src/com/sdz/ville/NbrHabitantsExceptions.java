package com.sdz.ville;

import com.sdz.exercices.Titre;

class NbrHabitantsExceptions extends Exception 
{
	Titre titre = new Titre();
	
	public NbrHabitantsExceptions()
	{
		titre.titre("ERREUR\n"+
					"\tUne ville ne peut pas avoir un nombre négatif d'habitants");
	}
}
