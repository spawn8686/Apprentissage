package com.sdz.army;

abstract class Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										VARIABLES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	private int attaque = 0, defense = 0, chance = 0;
	private String armes = "", chaussures = "", sac = "";
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	protected Personnage()
	{
		System.out.println("!?!?!?!? Bizzar, j'ai du rêver, j'ai cru voir qqun !?!?!?");
	}
	protected Personnage(int attaque, int defense)
	{
		this.attaque = attaque;
		this.defense = defense;	
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										GETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	protected int getAttaque()
	{
		return this.attaque;
	}
	protected int getDefense()
	{
		return this.defense;
	}
	protected int getChance()
	{
		return this.chance;
	}
	protected String getArmes()
	{
		return this.armes;
	}
	protected String getChaussures()
	{
		return this.chaussures;
	}
	protected String getSac()
	{
		return this.sac;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										SETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	protected void setAttaque(int att)
	{
		this.attaque = att;
	}
	protected void setDefense(int def)
	{
		this.defense = def;
	}
	protected void setChance(int cha)
	{
		this.chance = cha;
	}
	protected void setArmes(String arme)
	{
		this.armes = arme;
	}
	protected void setChaussures(String chaussure)
	{
		this.chaussures = chaussure;
	}
	protected void setSac(String sac)
	{
		this.sac = sac;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										METHODES ABSTRAITES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									METHODES POUR POLYMORPHISME
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
	protected void seDeplacer()
	{
		System.out.println("Je me déplace à pied !");
	}
	protected void combattre()
	{
		System.out.println("Je ne combat PAS !");
	}
	protected void soigner()
	{
		System.out.println("Je ne soigne PAS !");
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										METHODES INTERNES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public String toString()
	{
		String str = "Je suis un "+this.getClass().getSimpleName()+
				" avec une attaque de base de '"+this.getAttaque()+
				"' et une défense de base de '"+this.getDefense()+"'";
		
		return str;
	}
}
