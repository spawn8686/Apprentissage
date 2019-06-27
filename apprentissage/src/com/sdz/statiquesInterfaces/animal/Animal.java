package com.sdz.statiquesInterfaces.animal;

import com.sdz.statiquesInterfaces.abstraites.*;
import com.sdz.statiquesInterfaces.comportements.*;
import com.sdz.statiquesInterfaces.interfaces.Reproduction;

public class Animal extends Especes 
{
	public Animal() 
	{
		super();
	}
	public Animal(String esp, Reproduction rep)
	{
		super(esp, rep);
	}
}
