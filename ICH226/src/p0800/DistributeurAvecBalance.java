package p0800;

public class DistributeurAvecBalance
{
	private double prixBoisson;
	private double argentActuel;
	private double balance = 0;
	
	public DistributeurAvecBalance(){};
	
	public DistributeurAvecBalance(double prixBoisson)
	{
		this.prixBoisson = prixBoisson;
		this.argentActuel = 0;
		this.balance = 0;
	}
	
	public DistributeurAvecBalance(double prixBoisson, double argent)
	{
		this.prixBoisson = prixBoisson;
		this.argentActuel = argent;
		this.balance = 0;
	}
	
	public DistributeurAvecBalance(double prixBoisson, double argent, double balance)
	{
		this.prixBoisson = prixBoisson;
		this.argentActuel = argent;
		this.balance = balance;
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
			balance += prixBoisson;
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
	
	public double afficherBalance()
	{
		System.out.print("La balance vaut "+ balance +" CHF\n");
		return balance;
	}
}
