package p0200;

public class P0225 
{
	private int age;
	private String nom;
	
	public P0225() {
		this(1);
	}
	public P0225(String nom) {
		this(1, nom);
	}
	public P0225(int age) {
		this(age, "Anonyme");
	}
	
	public P0225(int age, String nom) 
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
	
	public static void main(String[] args) 
	{
		P0225 chien1;
		P0225 chien2;
		P0225 chien3;
		P0225 chien4;
		
		chien1 = new P0225(5, "Medor");
		chien2 = new P0225(9, "Rex");
		chien3 = new P0225(19, "Tiki");
		chien4 = new P0225();
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
	}
}
