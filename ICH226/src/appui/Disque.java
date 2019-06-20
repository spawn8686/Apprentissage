package appui;

public class Disque
{
	private String nomArtiste = "Defaut";
	private String titreDisque = "Aucun";
	private int nbrMorceau = 15;
	private double dureeDisqueMilli = 50000;
	private String styleMusique = "année 10";
	
	public Disque(){}
	
	public Disque(String nomArtiste, String titreDisque)
	{
		this.nomArtiste = nomArtiste;
		this.titreDisque = titreDisque;		
	}
	
	public Disque(String nomArtiste, 
			String titreDisque, 
			String styleMusique, 
			int nbrMorceau, 
			double dureeDisque)
	{
		this.nomArtiste = nomArtiste;
		this.titreDisque = titreDisque;
		this.styleMusique = styleMusique;
		this.nbrMorceau = nbrMorceau;
		this.dureeDisqueMilli = dureeDisque;
	}
	
	public String getNomArtiste()
	{
		return nomArtiste;
	}

	public void setNomArtiste(String nomArtiste)
	{
		this.nomArtiste = nomArtiste;
	}

	public String getTitreDisque()
	{
		return titreDisque;
	}

	public void setTitreDisque(String titreDisque)
	{
		this.titreDisque = titreDisque;
	}

	public int getNbrMorceau()
	{
		return nbrMorceau;
	}

	public void setNbrMorceau(int nbrMorceau)
	{
		this.nbrMorceau = nbrMorceau;
	}

	public double getDureeDisqueMilli()
	{
		return dureeDisqueMilli;
	}

	public void setDureeDisqueMilli(double dureeDisqueMilli)
	{
		this.dureeDisqueMilli = dureeDisqueMilli;
	}

	public String getStyleMusique()
	{
		return styleMusique;
	}

	public void setStyleMusique(String styleMusique)
	{
		this.styleMusique = styleMusique;
	}

	public void formatHeur()
	{
		
	}
	
	public String toString()
	{
		String detail = "L'artiste est : "+ getNomArtiste() +
				"\nLe titre du disque est : "+ getTitreDisque() +
				"\nPour une durée total de : "+ getDureeDisqueMilli();
		
		return detail;
	}

}
