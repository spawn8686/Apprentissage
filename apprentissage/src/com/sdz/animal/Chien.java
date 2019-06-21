package com.sdz.animal;

public class Chien extends Canin implements Rintintin // class fille de Canin
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										CONSTRUCTEURS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public Chien()
	{
		super();
	}
	public Chien(String couleur, int poids)
	{
		super(couleur, poids);
	}	
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										METHODES ABSTRAITE
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	@Override
	public void crier() 
	{
		System.out.println("J'aboie sans raison !");
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//										METHODES INTERFACE
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	@Override
	public void faireLechouille() 
	{
		System.out.println("Je fais de GROSSE LECHOUILLE");
	}
	@Override
	public void faireCalin() 
	{
		System.out.println("Je fais un GROS CALIN");
	}
	@Override
	public void faireLeBeau() 
	{
		System.out.println("Je fais le beau");
	}
}
