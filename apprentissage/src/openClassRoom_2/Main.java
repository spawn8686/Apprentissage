package openClassRoom_2;

public class Main 
{

	public static void main(String[] args) 
	{
		//Instanciation de la class Ville avec constructeur par defaut
		Ville ville = new Ville();
		//Instance de la class Ville avec constructeur paramétré
		Ville ville2 = new Ville("Monthey", "Suisse", 17000);
		
		//Instance de la class Ville avec modification des variable d'instance à la volée, sans accesseur ni mutateur
		/*
		Ville ville3 = new Ville();
		System.out.println(ville3.nomVille);
		ville3.nomVille = "La tête à toto!";
		System.out.println(ville3.nomVille);
		*/
		
		//Instance de la class Ville avec modification des variable d'instance grâce au accesseur et mutateur
		Ville ville4 = new Ville();
		System.out.println(ville4.getNomVille());
		ville4.setNomVille("Sion");
		System.out.println(ville4.getNomVille());
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									EXERCICES GETTERS SETTERS
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		Ville v = new Ville();
		Ville v1 = new Ville("Monthey", "Suisse", 17000);
		Ville v2 = new Ville("Martigny", "Suisse", 16000);
		
		System.out.println("\n v = Ville de "+v.getNomVille()+", composé de "+v.getNbrHabitants()+" habitants, localisé en "+v.getNomPays());
		System.out.println("v1 = Ville de "+v1.getNomVille()+", composé de "+v1.getNbrHabitants()+" habitants, localisé en "+v1.getNomPays());
		System.out.println("v2 = Ville de "+v2.getNomVille()+", composé de "+v2.getNbrHabitants()+" habitants, localisé en "+v2.getNomPays()+"\n\n");
		
		//Inversion des valeurs v1 et v2 grâce à un objet Ville vTemps
		Ville vTemps = new Ville();
		vTemps = v1;
		v1 = v2;
		v2 = vTemps;
		System.out.println("v1 = Ville de "+v1.getNomVille()+", composé de "+v1.getNbrHabitants()+" habitants, localisé en "+v1.getNomPays());
		System.out.println("v2 = Ville de "+v2.getNomVille()+", composé de "+v2.getNbrHabitants()+" habitants, localisé en "+v2.getNomPays()+"\n\n");
		
		//Inversion des valeurs v1 et v2 grâce aux getters setters
		v1.setNomVille("Monthey");
		v1.setNbrHabitants(17000);
		v2.setNomVille("Martigny");
		v2.setNbrHabitants(16000);
		System.out.println("v1 = Ville de "+v1.getNomVille()+", composé de "+v1.getNbrHabitants()+" habitants, localisé en "+v1.getNomPays());
		System.out.println("v2 = Ville de "+v2.getNomVille()+", composé de "+v2.getNbrHabitants()+" habitants, localisé en "+v2.getNomPays()+"\n\n");
				
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									EXERCICES METHODES
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//Inversion des valeurs v1 et v2 grâce à la méthode d'inversion de la class Ville
		v1.inversion(v2);
		System.out.println("v1 = "+v1.description());
		System.out.println("v2 = "+v2.description());	
		
		//Modification d'une ville existante
		Ville v3 = new Ville();		
		System.out.println(v3.changementVille("Marseille", "France", 860000));
		
		//Affiche la description d'une ville
		System.out.println(ville2.description());
		System.out.println(v3.description());
		
		//Compare le nbr d'habitants de 2 villes
		System.out.println(v3.comparaison(ville2));
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									VARIABLES DE CLASSE
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//Test les variables de class nbrInstances et nbrInstancesBis
		Ville v4 = new Ville();                
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis());
			                        
		Ville v5 = new Ville("Marseille", "France", 860000);        
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis());
		                
		Ville v6 = new Ville("Rio", "Brésil", 6320000);        
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis()+"\n");
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									CLASSE CAPITALE
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//test d'héritage de la classe Capitale avec une méthode de la classe Ville
		Capitale cap = new Capitale();
		System.out.println(cap.description());
		
		System.out.println("Le nombre d'instances de la classe Capitale est : " + Capitale.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Capitale est : " + Capitale.getNbrInstancesBis()+"\n");
		
		Capitale cap1 = new Capitale("Berne", "Suisse", 133000, "La Place du Palais fédéral");
		System.out.println(cap1.description());
		
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbrInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNbrInstancesBis()+"\n");
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									POLYMORPHISME
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		        
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		String[] tab3 = {"La Fontaine Bartholdi", "La Tour Eiffel", "La Basilic de Saint Nicolas"};
		         
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++)
		{
		  if (i <3)
		  {
		    Ville V = new Ville(tab[i], "France", tab2[i]);
		    tableau[i] = V;
		  }else
		  {
		    Capitale C = new Capitale(tab[i], "France", tab2[i], tab3[i-3]);
		    tableau[i] = C;
		  }
		}		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau)
		{
			//Les 2 System.out.println ci dessous produiront le même résultat.
		  System.out.println(obj.toString());
		}
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									TABLEAU DE VILLES SUISSE
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//Exercice créé pour le cours OpenClassRooms sur GitHub
		Ville[] tVilles = new Ville[6];
	        
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab4 = {"Monthey", "Martigny", "Sion", "Bern", "Zurich", "Bâle"};
		int[] tab5 = {16302, 15635, 29304, 133115, 1488000, 171017};
		String[] tab6 = {"Le Grauholz", "Le Fraumünster", "l'Helvetia auf Reisen"};
		         
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++)
		{
		  if (i <3)
		  {
		    Ville V = new Ville(tab4[i], "Suisse", tab5[i]);
		    tVilles[i] = V;
		  }else
		  {
		    Capitale C = new Capitale(tab4[i], "Suisse", tab5[i], tab6[i-3]);
		    tVilles[i] = C;
		  }
		}		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj2 : tVilles)
		{
			//Les 2 System.out.println ci dessous produiront le même résultat.
		  System.out.println(obj2.toString());
		}
	}
}

































