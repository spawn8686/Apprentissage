package com.sdz.statiquesInterfaces.comportements;

import com.sdz.statiquesInterfaces.interfaces.Reproduction;

public class Ponte implements Reproduction 
{
	public void naissance()
	{
		System.out.println("Je ponds des oeufs!!!");
	}
}
