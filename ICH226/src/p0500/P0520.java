package p0500;

import java.util.ArrayList;
import java.util.Random;

public class P0520 {

/*
1.    Objectifs
     Créer un tournoi de de Chien en utilisant un ArrayList
2.    Procédure
     Remplir un ArrayList de Chien avec 20 Chien de caractéristiques aléatoires 
o   Le nom sera du type Chien1
o   L’age sera un nombre aléatoire entre 8 et 12
     A chaque tour du tournoi
o   Indiquer le No du tour
o   Tirer 2 chiens de la liste des chiens restants au hasard
o   Faire combattre les 2 chiens
o   Ne conserver que le gagnant dans la liste
     A la fin du tournoi afficher le nom du vainqueur
3.    Commentaires
     Il faut modifier la classe Chien pour que sa méthode attaque retourne le gagnant
     Pour créer des nombres aléatoires
o   Créer une instance de la classe Random
-   utiliser la méthode nextInt(int n)
 */
	
	public static void main(String[] args) {
		ArrayList<Chien> combattants = new ArrayList<>();
		Random r = new Random();
		Chien chien;
		String nomChien;
		int age;

		//Ajout des chiens
		for (int i = 1; i <= 20; i++) {
//			nomChien = "Chien" + i;
			nomChien = String.format("Chien %d", i);
			age = r.nextInt(5) + 8;
			chien = new Chien(nomChien, age);
			combattants.add(chien);
		}
		
		//Tournoi
//		while (combattants.size() > 1) {
//			
//		}
		int id;
		Chien chien1, chien2, gagnant;
		for (int i = 1; i < combattants.size(); i++) {
			System.out.printf("-----%d-----\n", i);
			//Retirer 2 chiens
			id = r.nextInt(combattants.size());
			chien1 = combattants.remove(id);
			//Ou
//			chien1 = combattants.remove(r.nextInt(combattants.size()));
			id = r.nextInt(combattants.size());
			chien2 = combattants.remove(id);
			//Les faire combattre
			gagnant = chien1.attaque(chien2);
			//Ajouter le gagnant au tableau des gagnants
			combattants.add(gagnant);
			//Ou
//			combattants.add(chien1.attaque(chien2));
		}
		
	}

}

