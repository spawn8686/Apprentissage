package com.sdz.army2;

import com.sdz.army2.comportements.*;
import com.sdz.army2.personnages.*;
import com.sdz.exercices.Titre;

public class Main 
{
	public static void main(String[] args) 
	{
		Titre titre = new Titre();
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// 							EXERCICES POUR PATTERN STRATEGY
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		titre.titre("EXERCICES POUR PATTERN STRATEGY");
		
		Personnage[] tPers0 = {
				new Civil(new CombatCouteau(), new Courir(), new AucunSoin()), 
				new Guerrier(new CombatPistolet(), new Courir(), new PremierSoin()), 
				new Sniper(), 
				new Medecin(), 
				new Chirurgien()
				};
		for (Personnage p0 : tPers0) 
		{
			System.out.println("\n Je suis un "+p0.getClass().getSimpleName()+"\n****************************************************");
			p0.combattre();
			p0.seDeplacer();
			p0.soigner();
		}
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// 									MUTATEUR
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		titre.titre("INSTANCIATION DE CLASS DE BASE");
		Personnage[] tPers1 = { // Création d'une liste de personnages de base pour les tests
				new Civil(), 
				new Guerrier(), 
				new Sniper(), 
				new Medecin(), 
				new Chirurgien()
				};
		for (Personnage p1 : tPers1) // Boucle pour afficher les personnages de références
		{
			System.out.println(p1.toString());
		}
		
		titre.titre("Modification des valeur de base grâce au accesseur");
		
		tPers1[0].setEspritCombatif(new CombatCouteau());// modification de l'esprit combatif du civil
		tPers1[1].setEspritCombatif(new CombatPistolet());// modification de l'esprit combatif du guerrier
		tPers1[3].setEspritCombatif(new CombatPistolet());// modification de l'esprit combatif du médecin
		tPers1[3].setDeplacement(new Marcher());// modification du déplacement du médecin
		// Affichage des résultat
		System.out.println("\nModification "+tPers1[0].getClass().getSimpleName()+
				"\n--------------------------------------"+
				"\nCombat = "+tPers1[0].getEspritCombatif());
		
		System.out.println("\nModification "+tPers1[1].getClass().getSimpleName()+
				"\n--------------------------------------"+
				"\nCombat = "+tPers1[1].getEspritCombatif());
		
		System.out.println("\nModification "+tPers1[3].getClass().getSimpleName()+
				"\n--------------------------------------"+
				"\nCombat = "+tPers1[3].getEspritCombatif()+
				"\nDeplacement = "+tPers1[3].getDeplacement());
	}
}
