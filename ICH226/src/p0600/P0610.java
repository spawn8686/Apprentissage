package p0600;

import java.util.ArrayList;
import java.util.Random;

public class P0610 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Déclarer l'ArrayList
		ArrayList<Animal> combattants = new ArrayList<Animal>();
		//Crée un random
		Random r = new Random();
		
		for (int i = 0; i < 20; i++) {
			Chien c = new Chien("Chien"+(i+1), 8 +r.nextInt(5));
			combattants.add(c);
		}
		
		for (int i = 0; i < combattants.size(); i++) {
			combattants.get(i).crie();
		}
		
		//Tournoi
		int tours = combattants.size()-1;
		for (int i = 0; i < tours; i++) {
			System.out.printf("-------%d-------\n", i+1);
			Animal a1, a2, gagnant;
			//Tirer deux animaux au hasard
			a1 = combattants.remove(r.nextInt(combattants.size()));
			a2 = combattants.remove(r.nextInt(combattants.size()));
			//Les faire combattre
			gagnant = a1.attaque(a2);
			//Replace le gagnant dans la liste
			combattants.add(gagnant);
		}
		//Le grand gagnant
		System.out.println("==========");
		System.out.printf("Le GRAND gagnant est : %s\n", combattants.get(0).getNom());
		combattants.get(0).crie();
	}

}
