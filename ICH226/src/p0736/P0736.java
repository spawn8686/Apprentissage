package p0736;

import java.util.Random;
import java.util.Scanner;

public class P0736 {
	static Fleet f = new Fleet();
	static final int GRID_SIZE = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		addBoat(3);
		addBoat(2);
		System.out.println(f.getPositions());
		
		Scanner in = new Scanner(System.in);
		int nbTirs = 0;
		Integer coordonnee;
		
		while (f.isAlive()) {
			System.out.println("Indiquer la coordonn�e du tir :");
			coordonnee = in.nextInt();
			if(f.play(coordonnee)) {
				System.out.println("Touch�");
			} else {
				System.out.println("A l'eau");
			}
			nbTirs++;
		}
		System.out.printf("La flotte a �t� d�truite en %d tirs\n", nbTirs);
		in.close();
	}
	
	private static void addBoat(int size) {
		Random r = new Random();
		Boat boat;
		do {
			//tire al�atoirement la case de d�part
			int start = r.nextInt(GRID_SIZE-size+1);
			boat = new Boat(start, size);			
		} while (! f.isFree(boat)); //recommence si pas libre
		f.add(boat);
	}

}
