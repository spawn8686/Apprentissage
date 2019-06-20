package p0400;

public class ChienDomestique extends Chien
{	
	private boolean vaccine;
	private String proprietaire;
	
	
	public ChienDomestique(String nom, int age, boolean vaccine, String proprietaire)
	{
		super(age, nom);
		this.vaccine = vaccine;
		this.proprietaire = proprietaire;
	}
	
	public ChienDomestique(String nom, int age, boolean vaccine)
	{
		this(nom, age, vaccine, "Anonyme");		
	}
	
	@Override
	public void crie() 
	{
		if(vaccine)
		{
			System.out.println("Je suis vacciné");
		}else
		{
			System.out.println("Je NE suis PAS vacciné");
		}
		
		super.crie();
		
		System.out.printf("Mon propriétaire s'appel %s\n", proprietaire);
	}
}
