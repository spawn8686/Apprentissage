package p0500;

public class Chien 
{
	private int age;
	private String nom;
	
	public Chien() 
	{
		this(1);
	}
	public Chien(String nom) 
	{
		this(nom, 1);
	}
	public Chien(int age) 
	{
		this("Anonyme", age);
	}
	
	public Chien(String nom , int age) 
	{
		this.age = age;
		this.nom = nom;
	}
	
	public int getAge() 
	{
		return age;
	}
	public String getNom() 
	{
		return nom;
	}
	
	public void crie() 
	{
		String cri;
		if(age < 10) 
		{
			cri = "wiif wiif";
		} else if (age <= 20) 
		{
			cri = "Wouff Wouff";
		} else {
			cri = "Ruff Ruff";
		}
		System.out.printf("%s >> %s (j'ai %d jours)!!\n", nom, cri, age);
	}
	public void dors() 
	{
		age = age + 1; //age++
		System.out.println("zzz");
	}
	
	public Chien attaque(Chien ennemi) {
		System.out.printf("(%s attaque %s)\n", this.nom, ennemi.nom);
		this.crie();
		ennemi.crie();
		
		Chien gagnant;
		if(this.age >= ennemi.age)
		{
			gagnant = this;
		} else {
			gagnant = ennemi;
		}
		System.out.printf("(%s a gagné)\n", gagnant.nom);
		gagnant.crie();
		
		return gagnant;
	}
	
	
	/*
	 * Test de fonctionnement
	 */
	public static void main(String[] args) 
	{
		Chien medor;
		Chien rex;
		medor = new Chien("Médor", 5);
		
		rex = new Chien("Rex", 10);
		medor.attaque(rex);
		
//		medor.crie();
//		medor.dors();
//		medor.dors();
//		medor.crie();
//		rex.crie();
	}
	
}
