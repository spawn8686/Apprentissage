package p0200;

public class P0210 
{
	private int age;
	
	public void crie() 
	{
		System.out.printf("Wouaf Wouaf (j'ai %d jours) !!\n",age);
	}
	public void dors()
	{
		age = age + 1; // age++	
		System.out.printf("ZZzzz\n");
	}
	
	public static void main(String[] args) 
	{
		P0210 medor;
		P0210 rex;
		
		medor = new P0210();
		rex = new P0210();
		medor.crie();
		medor.dors();
		medor.dors();
		medor.crie();
		rex.crie();
	}
}
