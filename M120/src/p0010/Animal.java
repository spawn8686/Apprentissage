package p0010;

public class Animal
{
	private String nom;

	public String getNom()
	{
		return nom;
	}
	
	public Animal(String nom)
	{
		this.nom = nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	
	public void dormir ()
	{
		System.out.println("zzz zzz");
	}
}
