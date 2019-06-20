package p0200;

public class P0215 
{
	private int iAge;
	private String sNom;
	
	public P0215(int age, String Nom) 
	{
		
		this.iAge = age;
		this.sNom = Nom;
	}
	
	public void crie() 
	{
		System.out.printf("Wouaf Wouaf (Je m'appel %s et j'ai %d jours) !!\n",sNom,iAge);
	}
	public void dors()
	{
		iAge = iAge + 1; // age++	
		System.out.printf("ZZzzz, %s ce repose\n",sNom);
	}
	
	public static void main(String[] args) 
	{
		P0215 chien1;
		P0215 chien2;
		P0215 chien3;
		
		chien1 = new P0215(5, "Medor");
		chien2 = new P0215(10, "Rex");
		chien3 = new P0215(2, "Ziki");
		chien1.crie();
		chien1.dors();
		chien1.dors();
		chien1.crie();
		chien2.crie();
		chien3.dors();
		chien3.dors();
		chien3.crie();
	}
}
