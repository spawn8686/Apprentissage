package com.sdz.army2.personnages;

import com.sdz.army2.interfaces.*;
import com.sdz.army2.comportements.*;

public abstract class Personnage // CLASS ABSTRAITE
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 							INSTANCES DE COMPORTEMENTS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	protected EspritCombatif espritCombatif = new Pacifiste();
	protected Deplacement deplacement = new Marcher();
	protected Soin soin = new AucunSoin();
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Personnage() 
	{}
	public Personnage(EspritCombatif esprit, Deplacement deplacement, Soin soin)
	{
		this.espritCombatif = esprit;
		this.deplacement = deplacement;
		this.soin = soin;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									GETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public EspritCombatif getEspritCombatif()
	{
		return this.espritCombatif;
	}
	public Deplacement getDeplacement()
	{
		return this.deplacement;
	}
	public Soin getSoin()
	{
		return this.soin;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									SETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public void setEspritCombatif(EspritCombatif esprit)
	{
		this.espritCombatif = esprit;
	}
	public void setDeplacement(Deplacement dep)
	{
		this.deplacement = dep;
	}
	public void setSoin(Soin soin)
	{
		this.soin = soin;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	// 									METHODES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public void combattre()
	{
		espritCombatif.combat();
	}
	public void seDeplacer()
	{
		deplacement.deplace();
	}
	public void soigner()
	{
		soin.soigne();
	}
}











































