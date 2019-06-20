package p0010;

public class Chien extends Animal
{
	public Chien(String nom)
	{
		super(nom);
	}
	
	public void faireLeBeau()
	{
		System.out.printf("%s se met sur les pattes arrières et fait le beau, arf\n", getNom());
	}
	
}
