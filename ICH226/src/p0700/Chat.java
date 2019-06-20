package p0700;

import java.util.Random;

public class Chat extends Animal {

	public Chat() {
	}

	public Chat(String nom) {
		super(nom);
	}

	public Chat(int age) {
		super(age);
	}

	public Chat(String nom, int age) {
		super(nom, age);
	}

	@Override
	public void crie() {
		Random r = new Random();
		String cri;
		if( r.nextBoolean() ){
			cri = "Miaou Miaou";
		} else {
			cri = "Maaouh";
		}
		System.out.printf("%s >> %s (j'ai %d jours)\n", getNom(), cri, getAge());
	}
}
