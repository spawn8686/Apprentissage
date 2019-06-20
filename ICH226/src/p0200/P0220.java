package p0200;

public class P0220 
{
	private int age;
	private String nom;
	
	public P0220() {
		this(1);
	}
	public P0220(String nom) {
		this(1, nom);
	}
	public P0220(int age) {
		this(age, "Anonyme");
	}
	
	public P0220(int age, String nom) 
	{		
		this.age = age;
		this.nom = nom;
	}
	
	public void crie() 
	{
		System.out.printf("Wouaf Wouaf (Je m'appel %s et j'ai %d jours) !!\n",nom,age);
	}
	public void dors()
	{
		age = age + 1; // age++	
		System.out.printf("ZZzzz, %s ce repose\n",nom);
	}
	
	public static void main(String[] args) 
	{
		P0220 chien1;
		P0220 chien2;
		P0220 chien3;
		P0220 chien4;
		
		chien1 = new P0220(5, "Medor");
		chien2 = new P0220(10, "Rex");
		chien3 = new P0220(3, "Tiki");
		chien4 = new P0220();
		chien1.crie();
		chien1.dors();
		chien1.dors();
		chien1.crie();
		chien2.crie();
		chien3.dors();
		chien3.dors();
		chien3.crie();
		chien4.crie();
		chien4.dors();
		chien4.dors();
		chien4.crie();		
	}
}
