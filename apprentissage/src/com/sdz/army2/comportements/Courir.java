package com.sdz.army2.comportements;

import com.sdz.army2.interfaces.Deplacement;

public class Courir implements Deplacement 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//					CLASS AVEC IMPLEMENT DE L'INTERFACE Deplacement
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	@Override
	public void deplace() // M�thode Polymorphe de l'interface Deplacement
	{
		System.out.println("Je me d�place en courant!!!");
	}

}
