package com.sdz.army2.personnages;

import com.sdz.army2.comportements.*;
import com.sdz.army2.interfaces.*;

public class Chirurgien extends Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Chirurgien() 
	{
		this.soin = new Operation();
	}
	public Chirurgien(EspritCombatif esprit, Deplacement deplacement, Soin soin) 
	{
		super(esprit, deplacement, soin);
	}
}
