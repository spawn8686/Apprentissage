package com.sdz.army2.comportements;

import com.sdz.army2.interfaces.EspritCombatif;

public class CombatCouteau implements EspritCombatif 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//					CLASS AVEC IMPLEMENT DE L'INTERFACE EspritCombatif
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	@Override
	public void combat() // Méthode Polymorphe de l'interface EspritCombatif
	{
		System.out.println("Je combat au couteau!!!");
	}

}
