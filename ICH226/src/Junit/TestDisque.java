package Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ch.rapazp.java.formation.practice.testdisque.Disque;

public class TestDisque
{
	Disque d1 = new Disque("Titi", "A la maison", "blibli", 12, 250000000);
	Disque d2 = new Disque("Tata", "A la mer", "blabla", 15, 350000000);
	Disque d3 = new Disque("Tutu", "A la montagne", "blublu", 19, 450000000);
	
	@Before
	public void init() throws Exception
	{		
	}
	
	@Test
	public void testNewDisque()
	{
		assertEquals("Titi", d1.getArtist());
		assertEquals(12, d1.getNbrTrack());
		assertEquals("A la montagne", d3.getTitle());
		assertEquals(450000000, d3.getTime());
		assertEquals("blabla", d2.getStyle());
		assertEquals(15, d2.getNbrTrack());
	}


	@Test
	public void testCalculTime()
	{
		assertEquals(1000, d1.calculTime(0,0,1));
		assertEquals(60000, d1.calculTime(0,1,0));
		assertEquals(3600000, d1.calculTime(1,0,0));
	}

	@Ignore
	public void testFormatTime()
	{
		fail("Not yet implemented");
	}

}
