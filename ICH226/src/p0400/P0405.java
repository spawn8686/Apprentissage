package p0400;

public class P0405 {

	public static void main(String[] args) 
	{
		Chien chien1 = new Chien(10, "Titi");
		ChienDomestique chienA = new ChienDomestique("Rex", 12, false, "J�r�my");
		
		chien1.attaque(chienA);
	}

}
