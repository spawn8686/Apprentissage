package p0800;

import java.util.ArrayList;

public class Distributeur
{
	private ArrayList<Produit> produits = new ArrayList<>();
	private double argentActuel;
	private double balance;
	
	public void ajouterArgent(double montant)
	{
		if(montant < 0)
		{
			System.out.print("On ne peut pas ajouter de montant négatif!\n");
			montant = 0;
		}
		
		this.argentActuel = argentActuel + montant;
		System.out.print("Vous avez ajouter "+ montant +" CHF\n");
		//this.argentActuel += montant;
	}
	
	public boolean prendreProduit(int position)
	{
		if(position < 1 || position > produits.size())
		{
			System.out.print("N° d'article non valide\n");
			return false;
		}
		
		Produit produitDemande = produits.get(position - 1);
		
		if(argentActuel >= produitDemande.getPrix())
		{
			argentActuel -= produitDemande.getPrix();
			balance += produitDemande.getPrix();
			System.out.print("Voici votre article\n");
			return true;
		}
		System.out.print("Vous n'avez pas assez d'argent\n");
		return false;
	}
	
	public double rendreArgent()
	{
		System.out.print("Voici le retour de monnaie "+ argentActuel + " CHF\n");
		double argentTmp = argentActuel;
		argentActuel -= argentActuel;
		return argentTmp;
	}
	
	public double afficherBalance()
	{
		System.out.print("La balance vaut "+ balance +" CHF\n");
		return balance;
	}
	
	public void ajouterProduit(Produit produit)
	{
		if()
		{
			
		}
	}
}
