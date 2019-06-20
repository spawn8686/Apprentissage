package appui;

public class Tableau2 {

	public static void main(String[] args) 
	{
		char[] tab1 = new char[2];
		tab1[0] = 'v';
		tab1[1] = 'i';
		
		System.out.println(String.valueOf(tab1));
		
		System.out.println(tab1[0] +""+ tab1[1]);
		
		for(int i = 0; i < tab1.length; i++)
		{
			System.out.println(tab1[i]);
		}
	}
}
