package p0600;

public abstract class Animal620 {
	private int age;
	private String nom;

	public Animal620() {
		this(1);
	}

	public Animal620(String nom) {
		this(nom, 1);
	}

	public Animal620(int age) {
		this("Anonyme", age);
	}

	public Animal620(String nom, int age) {
		this.age = age;
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public String getNom() {
		return nom;
	}

	public abstract void crie();

	public void dors() {
		age = age + 1; // age++
		System.out.println("zzz");
	}

	public Animal620 attaque(Animal620 ennemi) {
		System.out.printf("(%s attaque %s)\n", this.nom, ennemi.nom);
		this.crie();
		ennemi.crie();

		Animal620 gagnant;
		if (this.getClass() == ennemi.getClass()) {
			if (this.age >= ennemi.age) {
				gagnant = this;
			} else {
				gagnant = ennemi;
			}
		} else {
			//Comparer les races
			String nomClasseThis = this.getClass().getSimpleName();
			String nomClasseEnnemi = ennemi.getClass().getSimpleName();
			if(nomClasseThis.compareTo(nomClasseEnnemi) > 0) {
				gagnant = this;				
			} else {
				gagnant = ennemi;
			}
		}
		System.out.printf("(%s a gagné)\n", gagnant.nom);
		gagnant.crie();

		return gagnant;
	}

	/*
	 * Test de fonctionnement
	 */
	public static void main(String[] args) {
		// Animal medor;
		// Animal rex;
		// medor = new Animal("Médor", 5);
		//
		// rex = new Animal("Rex", 10);
		// medor.attaque(rex);

		// medor.crie();
		// medor.dors();
		// medor.dors();
		// medor.crie();
		// rex.crie();
	}

}
