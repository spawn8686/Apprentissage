package p0800;

public class Produit
{
	/**
	 * Variable de classe
	 */
	private String descriptif;
	private double prix;
	
	/**
	 * Constructeur sans param�tre
	 */
	public Produit(){}
	
	/**
	 * Constructeur avec 1 param�tre
	 * @param descriptif
	 * 			variable String de description du produit
	 */
	public Produit(String descriptif)
	{
		this.descriptif = descriptif;
		this.prix = 0;
	}
	
	/**
	 * Constructeur avec 2 param�tres
	 * @param descriptif
	 * 			variable String de description du produit
	 * 
	 * @param prix
	 * 			variable double de prix du produit
	 */
	public Produit(String descriptif, double prix)
	{
		this.descriptif = descriptif;
		this.prix = prix;
	}

	public String getDescriptif()
	{
		return descriptif;
	}

	public double getPrix()
	{
		return prix;
	}
	
	
}
