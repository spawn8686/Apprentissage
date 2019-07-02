package com.sdz.ville;

public class Ville 
{
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									VARIABLES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	protected String nomVille;	//Variable de nom de ville
	protected String nomPays;		//Variable de nom du pays
	protected int nbreHabitants;	//Variable du nombre d'habitants
	protected char categorie;		//Variable de catégorie de la ville en fonction de son nbr d'habitants  ( <1000 -> A, <10 000 -> B, <100 000 -> C…)
	public static int nbrInstances = 0;
	protected static int nbrInstancesBis = 0;
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									CONSTRUCTEUR
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
	// Constructeur par defaut de la class Ville
	public Ville()
	{
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		nbrInstances++;
		nbrInstancesBis++;
		
		this.setCategorie();
		System.out.println("Création d'une ville fantome\n");
	}	
	// Surcharge de constructeur de la class Ville avec paramètre
	public Ville(String pVille, String pPays, int pNbr) 
	throws NbrHabitantsExceptions
	{
		nomVille = pVille;
		nomPays = pPays;
		nbreHabitants = pNbr;
		nbrInstances++;
		nbrInstancesBis++;
		
		if (nbreHabitants < 0) 
		{
			throw new NbrHabitantsExceptions();
		}else
		{		
			this.setCategorie();
			System.out.println("\nCréation de "+pVille+"!");
			System.out.println(pVille+" ce trouve en "+pPays+" et est composé d'environ "+pNbr+" habitants, ce qui la place dans la catégorie => "
								+this.categorie+"\n");
		}
	}	
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									GETTERS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public String getNomVille()
	{
		return nomVille;
	}
	public String getNomPays()
	{
		return nomPays;
	}
	public int getNbrHabitants()
	{
		return nbreHabitants;
	}
	public char categorie()
	{
		return categorie;
	}
	public static int getNbrInstancesBis()
	{
		return nbrInstancesBis;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									SETTERS
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public void setNomVille(String mNomVille)
	{
		nomVille = mNomVille;
	}
	public void setNomPays(String mNomPays)
	{
		nomPays = mNomPays;
	}	
	public void setNbrHabitants(int mNbrHabitants)
	{
		nbreHabitants = mNbrHabitants;
	}
	protected void setCategorie()
	{
		int bornesSuperieur[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		while (i < bornesSuperieur.length && this.nbreHabitants > bornesSuperieur[i]) 
		i++;
		
		this.categorie = categories[i];
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									METHODES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//Inverse les valeurs des 2 villes passé en paramètres
	public void inversion(Ville v1)
	{
		Ville vTemps = new Ville();						//Ville de temporaire
		
		vTemps.setNbrHabitants(v1.getNbrHabitants());	//Mise en mémoire des données de v1
		vTemps.setNomPays(v1.getNomPays());
		vTemps.setNomVille(v1.getNomVille());
		
		v1.setNbrHabitants(this.nbreHabitants);		//Récupération des données de v2 dans v1
		v1.setNomPays(this.nomPays);
		v1.setNomVille(this.nomVille);
		v1.setCategorie();
		
		this.nbreHabitants = vTemps.getNbrHabitants();	//Récupération des données de v1 mise en mémoire dans la ville temporaire dans v2
		this.nomPays = vTemps.getNomPays();
		this.nomVille = vTemps.getNomVille();
		this.setCategorie();
		
	}
	//Modifie les données de la ville avec les informations passés en paramètres
	public String changementVille(String nomVille, String nomPays, int habitants)
	{
		String str1 = "La ville de "+this.nomVille+" en "+this.nomPays+" avec "+this.nbreHabitants+" habitants et de catégorie "+this.categorie+
				"\nA été changé par\n";
		
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbreHabitants = habitants;
		this.setCategorie();
		
		String str2 = "La ville de "+this.nomVille+" en "+this.nomPays+" avec "+this.nbreHabitants+" habitants et de catégorie "+this.categorie+"!";
		
		return str1 + str2+"\n\n";
	}
	public String description()
	{
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+" et comporte "+this.nbreHabitants+
				" habitants, elle est donc de catégorie \""+this.categorie+"\"\n";
	}
	public String toString()
	{
		return "\n"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte "+this.nbreHabitants+
				" habitants, elle est donc de catégorie \'"+this.categorie+"\'";
	}
	public String comparaison(Ville v)
	{
		String str = new String();
		int diff = 0;
		
		if (v.getNbrHabitants() > this.nbreHabitants) 
		{
			diff = v.getNbrHabitants() - this.nbreHabitants;
			str = v.getNomVille()+" est une plus grande ville que "+this.nomVille+" avec "+diff+" habitants supplémentaire";
		}else
		{
			diff = this.nbreHabitants - v.getNbrHabitants();
			str = this.nomVille+" est une plus grande ville que "+v.getNomVille()+" avec "+diff+" habitants supplémentaire";
		}
		
		return str+"\n\n";
	}
}



































