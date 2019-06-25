package com.sdz.army;

class Guerrier extends Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Guerrier() 
	{
		// TODO Auto-generated constructor stub
	}

	public Guerrier(int attaque, int defense) 
	{
		super(attaque, defense);
		// TODO Auto-generated constructor stub
	}

	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										METHODES ABSTRAITES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	@Override
	protected void combattre() 
	{
		if (this.getArmes().equals("pistolet")) 
		{
			System.out.println("Attaque au Pistolet!");
		}else if (this.getArmes().equals("Fusil")) 
		{
			System.out.println("Attaque au fusil!");
		}else
		{
			System.out.println("Attaque au couteau!");
		}
	}
	@Override
	protected void soigner()
	{
		System.out.println("Je pose les pansements avant l'arrivé du toubib !");
	}

}
