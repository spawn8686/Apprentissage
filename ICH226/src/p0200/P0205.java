package p0200;

public class P0205 
{
	public void crie() 
	{
		System.out.printf("Wouaf Wouaf !!\n");
	}
	
	public static void main(String[] args) 
	{
		P0205 medor;
		P0205 rex;
		
		medor = new P0205();
		rex = new P0205();
		medor.crie();
		rex.crie();
	}
}
