package p0800;

public class DistributeurSimple
{
	private double prixBoisson;
	private double argentActuel;
	
	public DistributeurSimple(){};
	
	public DistributeurSimple(double prixBoisson)
	{
		this.prixBoisson = prixBoisson;
		this.argentActuel = 0;
	}
	
	public DistributeurSimple(double prixBoisson, double argent)
	{
		this.prixBoisson = prixBoisson;
		this.argentActuel = argent;
	}
	
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
	
	public boolean prendreBoisson()
	{
		if(argentActuel >= prixBoisson)
		{
			argentActuel -= prixBoisson;
			System.out.print("Voici une excellente boisson\n");
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
}
