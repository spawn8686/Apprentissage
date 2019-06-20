package p0600;

import java.util.ArrayList;
import java.util.Random;

public class P0620 {

	public static void main(String[] args) {
		ArrayList<Animal> combattants = new ArrayList<>();
		Random r = new Random();
		Animal animal;
		String nomAnimal;
		int age;

		//Ajout des animaux
		for (int i = 1; i <= 20; i++) {
			age = r.nextInt(5) + 8;
			if(r.nextBoolean()){
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
