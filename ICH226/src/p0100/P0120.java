package p0100;

import java.util.Scanner;

public class P0120 {
	
	public static void main(String[] args) 
	{
		System.out.printf("Veuillez entr� un nombre entier! = ");
		Scanner input = new Scanner(System.in);		
		int x = input.nextInt();
		System.out.printf("Vous avez taper %d comme nombre et son carr�e vaut %d\n", x, x*x);
		input.close();
	}

}
