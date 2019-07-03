package com.sdz.statiquesInterfaces;

import com.sdz.statiquesInterfaces.abstraites.*;
import com.sdz.statiquesInterfaces.animal.*;
import com.sdz.statiquesInterfaces.interfaces.*;
import com.sdz.statiquesInterfaces.comportements.*;

class Main 
{

	public static void main(String[] args) 
	{
		Especes ani0 = new Animal();
		Especes ani1 = new Animal("Papillon", new Larves());
		ani0.naissance();

	}

}
