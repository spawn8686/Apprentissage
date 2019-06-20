package appui;

import java.util.ArrayList;
import java.util.Scanner;

public class DecToBin
{
	
	public static void main(String[] args)
	{
		int nbr = 0;
		int result = 0;
		ArrayList<Integer> binaire = new ArrayList<>();
		
		System.out.printf("Veuillez entré un nombre entier! = ");
		Scanner input = new Scanner(System.in);		
		nbr = input.nextInt();
		System.out.printf("Vous avez taper %d\n", nbr);
		input.close();
		
		while(nbr > 0)
		{
			result = nbr % 2;
			nbr = nbr / 2;
			
			binaire.add(0, result);
		}
		
		for(int i = 0; i < binaire.size(); i++)
		{
			System.out.print(binaire.get(i));
		}
		
	}

}
