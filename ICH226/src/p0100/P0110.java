package p0100;

public class P0110 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World !!");
		afficheMessage ("Bonjour");
		afficheMessage ("Hello");
	}
	
	public static void afficheMessage(String message) 
	{
		//System.out.println("Vous avez écrit'"+message+"'");
		System.out.printf("Vous avez écrit %s \n" , message);
	}
}
