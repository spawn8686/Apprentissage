package exceptions;

class Main 
{

	public static void main(String[] args) 
	{
		int i = 10;
		int j = 0;
		
		try {
			System.out.println(i/j);			
		} catch (Exception e) {
			System.out.println("Division par 0!!!");
		}		
		System.out.println("Il va pas aimer!!!");
	}

}
