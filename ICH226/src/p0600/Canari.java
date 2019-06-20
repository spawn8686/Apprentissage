package p0600;


public class Canari extends Animal {

	public Canari() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Canari(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public Canari(String nom, int age) {
		super(nom, age);
		// TODO Auto-generated constructor stub
	}

	public Canari(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crie() 
	{
		String cri = "tui tui";		
		System.out.printf("%s >> %s (j'ai %d jours)!!\n", getNom(), cri, getAge());
	}	
}
