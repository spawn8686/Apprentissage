package p0400;

public class Chien 
{
	private int age;
	private String nom;
	
	public Chien() {
		this(1);
	}
	public Chien(String nom) {
		this(1, nom);
	}
	public Chien(int age) {
		this(age, "Anonyme");
	}
	
	public Chien(int age, String nom) 
	{		
		this.age = age;
		this.nom = nom;
	}

	public void crie() 
	{
		String cri;
		
		if(age < 21)
		{
			if(age < 10)
			{
				cri = "Wiif Wiif";
			}
			else
			{
				cri = "Wouff Wouff";
			}
		}
		else
		{
			cri = "Ruff Ruff";
		}
		
		System.out.printf("%s (Je m'appel %s et j'ai %d jours) !!\n",cri,nom,age);
		
	}
	public void dors()
	{
		age++;
		System.out.printf("ZZzzz, %s ce repose\n",nom);
	}
	public void attaque(Chien ennemi)
	{
		System.out.printf("(%s attaque %s)\n",this.nom,ennemi.nom);
		this.crie();
		ennemi.crie();
		
		Chien gagnant;
		if(this.age >= ennemi.age)
		{
			gagnant = this;
		}
		else 
		{
			gagnant = ennemi;
		}
		System.out.printf("(%s a gagné)\n",gagnant.nom);
		gagnant.crie();
	}
	
	public static void main(String[] args) 
	{
		Chien chien1;
		Chien chien2;
		Chien chien3;
		Chien chien4;
		
		chien1 = new Chien(5, "Medor");
		chien2 = new Chien(9, "Rex");
		chien3 = new Chien(19, "Tiki");
		chien4 = new Chien();
		chien1.crie();
		chien1.dors();
		chien1.dors();
		chien1.crie();
		chien2.crie();
		chien2.dors();
		chien2.crie();
		chien3.dors();
		chien3.dors();
		chien3.crie();
		chien4.crie();
		chien4.dors();
		chien4.dors();
		chien4.crie();	
		chien2.attaque(chien1);
	}
}
