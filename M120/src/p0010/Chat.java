package p0010;

public class Chat extends Animal
{
	public Chat(String nom)
	{
		super(nom);
	}
	
	public void ronronner()
	{
		System.out.printf("rrrr %s rrrr\n", getNom());
	}
	
}
