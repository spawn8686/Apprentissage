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
	public String  getEspritCombatif()
	{
		String str = this.espritCombatif.getClass().getSimpleName();
		return str;
	}
	public String getDeplacement()
	{
		String str = this.deplacement.getClass().getSimpleName();
		return str;
	}
	public String getSoin()
	{
		String str = this.soin.getClass().getSimpleName();
		return str;
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
	public String toString()
	{
		String str = "\nJe suis un "+this.getClass().getSimpleName()+
				"\n***************************************************"+
				"\nCombat = "+this.getEspritCombatif()+
				"\nDeplacement = "+this.getDeplacement()+
				"\nSoin = "+this.getSoin();
		return str;
	}
}











































