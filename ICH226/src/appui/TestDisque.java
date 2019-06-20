package appui;

public class TestDisque
{

	public static void main(String[] args)
	{			
		Disque d1 = new Disque();
		d1.setNomArtiste("DJ Angerfist");
		d1.setTitreDisque("HardCore 2016");
		d1.setNbrMorceau(101);
		d1.setDureeDisqueMilli(260000);
		Disque d2 = new Disque();
		d2.setNomArtiste("Les bronzés font du ski");
		d2.setTitreDisque("Les bobos en vacances");
		d2.setNbrMorceau(24);
		d2.setDureeDisqueMilli(100000);
		Disque d3 = new Disque();	
		d3.setNomArtiste("Dubstep");
		d3.setTitreDisque("Agar.IO");
		d3.setNbrMorceau(7);
		d3.setDureeDisqueMilli(50000);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Le disque 1 est : "+ d1.getTitreDisque());
		System.out.println("Le disque 2 est : "+ d2.getTitreDisque());
		System.out.println("Le disque 3 est : "+ d3.getTitreDisque());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("La somme des morceaux est de "+ 
				(d1.getNbrMorceau()+
				d2.getNbrMorceau()+
				d3.getNbrMorceau())+" titres");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("La durée total des 3 disques est de "+ 
				(d1.getDureeDisqueMilli()+
				d2.getDureeDisqueMilli()+
				d3.getDureeDisqueMilli())+" Millisecondes");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
		System.out.println(d1);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(d2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(d3);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}

}
