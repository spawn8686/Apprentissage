package com.sdz.army;

class Sniper extends Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Sniper() 
	{
		// TODO Auto-generated constructor stub
	}

	public Sniper(int attaque, int defense) 
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
		if (this.getArmes().equals("pompe")) 
		{
			System.out.println("Je me sers du pompe!");
		}else
		{
			System.out.println("Je me sers du fusil à lunette!");
		}
	}

}
