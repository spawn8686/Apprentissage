package com.sdz.army2.personnages;

import com.sdz.army2.interfaces.*;
import com.sdz.army2.comportements.*;

public class Medecin extends Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Medecin() 
	{
		this.soin = new PremierSoin();
		this.deplacement = new Courir();
	}
	public Medecin(EspritCombatif esprit, Deplacement deplacement, Soin soin) 
	{
		super(esprit, deplacement, soin);
	}
}
