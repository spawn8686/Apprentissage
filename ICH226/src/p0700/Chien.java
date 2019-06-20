package p0700;


public class Chien extends Animal {

	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public Chien(String nom, int age) {
		super(nom, age);
		// TODO Auto-generated constructor stub
	}

	public Chien(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crie() {
		String cri;
		if(getAge() < 10) {
			cri = "wiif wiif";
		} else if (getAge() <= 20) {
			cri = "Wouff Wouff";
		} else {
			cri = "Ruff Ruff";
		}
		System.out.printf("%s >> %s (j'ai %d jours)!!\n", getNom(), cri, getAge());
	}
	
//	public static void main(String[] args) {
//		Animal medor;
//		Chien rex;
//		medor = new Chien("Médor", 5);
//		
//		rex = new Chien("Rex", 10);
//		medor.attaque(rex);
//		
//		medor.crie();
//		medor.dors();
//		medor.dors();
//		medor.crie();
//		rex.crie();
//	}
	
}
