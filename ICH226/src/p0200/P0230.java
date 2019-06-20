package p0200;

public class P0230 {
	private int age;
	private String nom;
	
	public P0230() {
		this(1);
	}
	public P0230(String nom) {
		this(nom, 1);
	}
	public P0230(int age) {
		this("Anonyme", age);
	}
	
	public P0230(String nom , int age) {
		this.age = age;
		this.nom = nom;
	}
	
	public int getAge() {
		return age;
	}
	public String getNom() {
		return nom;
	}
	
	public void crie() {
		String cri;
		if(age < 10) {
			cri = "wiif wiif";
		} else if (age <= 20) {
			cri = "Wouff Wouff";
		} else {
			cri = "Ruff Ruff";
		}
		System.out.printf("%s >> %s (j'ai %d jours)!!\n", nom, cri, age);
	}
	public void dors() {
		age = age + 1; //age++
		System.out.println("zzz");
	}
	
	public void attaque(P0230 ennemi) {
		System.out.printf("(%s attaque %s)\n", this.nom, ennemi.nom);
		this.crie();
		ennemi.crie();
		
		P0230 gagnant;
		if(this.age >= ennemi.age){
			gagnant = this;
		} else {
			gagnant = ennemi;
		}
		System.out.printf("(%s a gagné)\n", gagnant.nom);
		gagnant.crie();
	}
	
	
	/*
	 * Test de fonctionnement
	 */
	public static void main(String[] args) {
		P0230 medor;
		P0230 rex;
		medor = new P0230("Médor", 5);
		
		rex = new P0230("Rex", 10);
		medor.attaque(rex);
		
//		medor.crie();
//		medor.dors();
//		medor.dors();
//		medor.crie();
//		rex.crie();
	}
	
}

