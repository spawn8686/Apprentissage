package appui;

public class SommePrenom {

	public static void main(String[] args) 
	{
		String prenom = args[0].toLowerCase();
		
		int somme = 0;
		int valeur = 0;
		
		for(int i = 0; i < prenom.length(); i++)
		{			
			valeur = prenom.charAt(i) -97 + 1;
			somme += prenom.charAt(i) -97 + 1; 
			System.out.println("La lettre "+i+" vaut "+valeur+" pour un total de "+somme);
		}
	}
}
