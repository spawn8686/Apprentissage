package com.sdz.army2.personnages;

import com.sdz.army2.interfaces.*;
import com.sdz.army2.comportements.*;

public class Sniper extends Personnage 
{

	public Sniper() 
	{
		this.espritCombatif = new CombatPompe();
	}

	public Sniper(EspritCombatif esprit, Deplacement deplacement, Soin soin) 
	{
		super(esprit, deplacement, soin);
	}

}
