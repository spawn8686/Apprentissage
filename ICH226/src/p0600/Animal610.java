package p0600;

public abstract class Animal610 {
	private int age;
	private String nom;
	
	public Animal610() {
		this(1);
	}
	public Animal610(String nom) {
		this(nom, 1);
	}
	public Animal610(int age) {
		this("Anonyme", age);
	}
	
	public Animal610(String nom , int age) {
		this.age = age;
		this.nom = nom;
	}
	
	public int getAge() {
		return age;
	}
	public String getNom() {
		return nom;
	}
	
	public abstract void crie() ;
	
	public void dors() {
		age = age + 1; //age++
		System.out.println("zzz");
	}
	
	public Animal610 attaque(Animal610 ennemi) {
		System.out.printf("(%s attaque %s)\n", this.nom, ennemi.nom);
		this.crie();
		ennemi.crie();
		
		Animal610 gagnant;
		if(this.age >= ennemi.age){
			gagnant = this;
		} else {
			gagnant = ennemi;
		}
		System.out.printf("(%s a gagné)\n", gagnant.nom);
		gagnant.crie();
		
		return gagnant;
	}
	
	
	/*
	 * Test de fonctionnement
	 */
	public static void main(String[] args) {
//		Animal medor;
//		Animal rex;
//		medor = new Animal("Médor", 5);
//		
//		rex = new Animal("Rex", 10);
//		medor.attaque(rex);
		
//		medor.crie();
//		medor.dors();
//		medor.dors();
//		medor.crie();
//		rex.crie();
	}
	
}
