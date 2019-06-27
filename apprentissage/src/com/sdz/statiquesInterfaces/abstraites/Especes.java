package com.sdz.statiquesInterfaces.abstraites;

import com.sdz.statiquesInterfaces.comportements.*;
import com.sdz.statiquesInterfaces.interfaces.Reproduction;

public abstract class Especes
{	
	Reproduction reproduction = new MiseBas();
	
	// Constructeur
	public Especes()
	{
		System.out.println("\nPar defaut, je suis un humain"+
				"\nnaissance = "+reproduction.getClass().getSimpleName()+
				"\n----------------------------------------");
	}
	public Especes(String espece, Reproduction rep)
	{
		this.reproduction = rep;
		System.out.println("Je suis un(e) = "+espece+
				"\nnaissance = "+reproduction.getClass().getSimpleName());
	}
	
	//Méthodes
	public void setNaissance(Reproduction rep)
	{
		this.reproduction = rep;
	}
	public void naissance()
	{
		reproduction.naissance();
	}
	
}
