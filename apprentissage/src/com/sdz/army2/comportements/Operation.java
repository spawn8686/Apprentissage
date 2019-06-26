package com.sdz.army2.comportements;

import com.sdz.army2.interfaces.Soin;

public class Operation implements Soin 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//					CLASS AVEC IMPLEMENT DE L'INTERFACE Soin
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

	@Override
	public void soigne() // Méthode Polymorphe de l'interface Soin
	{
		System.out.println("Je pratique une opération!!!");
	}

}
