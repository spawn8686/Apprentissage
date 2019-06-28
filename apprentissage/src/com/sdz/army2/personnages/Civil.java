package com.sdz.army2.personnages;

import com.sdz.army2.interfaces.*;

public class Civil extends Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Civil() 
	{
		
	}
	public Civil(EspritCombatif esprit, Deplacement deplacement, Soin soin) 
	{
		super(esprit, deplacement, soin);
	}
}
