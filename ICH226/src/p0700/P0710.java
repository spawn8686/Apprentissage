package p0700;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P0710
{
	private Chien chien;
	private Chat chatAge, chatJeune;
	private Canari canariAge, canariJeune;

	@Before
	public void setUp() throws Exception
	{
		chien = new Chien("chien", 10);
		chatJeune = new Chat("chatJeune", 10);
		canariJeune = new Canari("canariJeune", 10);
		chatAge = new Chat("chatAge", 18);
		canariAge = new Canari("canariAge", 17);
	}

	@Test
	public void testChienAttaque()
	{
		assertEquals(chien, chien.attaque(chatJeune));
		assertEquals(chien, chien.attaque(chatAge));
		assertEquals(chien, chien.attaque(canariJeune));
		assertEquals(chien, chien.attaque(canariAge));
	}
	
	@Test
	public void testChatAgeAttaque()throws Exception
	{
		assertEquals(chatAge, chatAge.attaque(chien));
		assertEquals(chatAge, chatAge.attaque(chatJeune));
		assertEquals(chatAge, chatAge.attaque(canariJeune));
		assertEquals(chatAge, chatAge.attaque(canariAge));
	}
	
	@Test
	public void testCanariAgeAttaque()throws Exception
	{
		assertEquals(canariAge, canariAge.attaque(chien));
		assertEquals(canariAge, canariAge.attaque(chatJeune));
		assertEquals(canariAge, canariAge.attaque(canariJeune));
		assertEquals(chatAge, canariAge.attaque(chatAge));
	}

}
