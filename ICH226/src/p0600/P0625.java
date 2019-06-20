package p0600;

import java.util.ArrayList;
import java.util.Random;

public class P0625 
{

	public static void main(String[] args) 
	{
		ArrayList<Animal> combattants = new ArrayList<>();
		Random r = new Random();
		Animal animal;
		String nomAnimal;
		int age = 0;

		//Ajout des animaux
		for (int i = 1; i <= 20; i++) 
		{			
			switch (r.nextInt(3)) 
			{
			case 1:
				//Chien
				nomAnimal = String.format("Chien %d", i);
				age = r.nextInt(5) + 8;
				animal = new Chien(nomAnimal, age);
				
				break;

			case 2:
				//Chat
				nomAnimal = String.format("Chat %d", i);
				age = r.nextInt(13) + 8;
				animal = new Chat(nomAnimal, age);
				
				break;
			case 3:
				//Canari
				nomAnimal = String.format("Canari %d", i);
				age = r.nextInt(20) + 1;
				animal = new Canari(nomAnimal, age);
				
				break;
			default:
				break;
			}
			
			
			if(r.nextBoolean())
			{
				//Chien
				nomAnimal = String.format("Chien %d", i);
				animal = new Chien(nomAnimal, age);
			} else {
				//Chat
				nomAnimal = String.format("Chat %d", i);
				animal = new Chat(nomAnimal, age);
			}
			combattants.add(animal);
		}
		
		//Tournoi
//		while (combattants.size() > 1) {
//			
//		}
		int id;
		Animal animal1, animal2, gagnant;
		for (int i = 1; i < 20; i++) {
			System.out.printf("-----%d-----\n", i);
			//Retirer 2 animaux
			id = r.nextInt(combattants.size());
			animal1 = combattants.remove(id);
			id = r.nextInt(combattants.size());
			animal2 = combattants.remove(id);
			//Les faire combattre
			gagnant = animal1.attaque(animal2);
			//Ajouter le gagnant au tableau des gagnants
			combattants.add(gagnant);
		}
		System.out.println("Le GRAND gagnant");
		System.out.println(combattants.get(0).getNom());
	}

}
