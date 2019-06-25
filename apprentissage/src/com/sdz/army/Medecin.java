package com.sdz.army;

class Medecin extends Personnage 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Medecin() 
	{
		// TODO Auto-generated constructor stub
	}

	public Medecin(int attaque, int defense)
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
			System.out.println("Je me sers du pistolet !");
		}else
		{
			super.combattre();
		}
		
	}
	@Override
	public void soigner() 
	{
		if (this.getSac().equals("petit sac")) 
		{
			System.out.println("Je peux recoudre!");
		}else
		{
			System.out.println("J'apporte les premiers soins pour l'évac!");
		}
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										METHODES INTERNES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	
}
