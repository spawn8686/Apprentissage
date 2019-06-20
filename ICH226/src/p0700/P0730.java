package p0700;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P0730
{
	private Boat b1, b2;
	private Fleet f1;

	@Before
	public void setUp() throws Exception
	{
		b1 = new Boat(4, 3);
		b2 = new Boat(8, 2);
		f1 = new Fleet();
		
		f1.add(b1);
		f1.add(b2);
	}

	@Test
	public void testCheckYourself() throws Exception
	{
		assertEquals(false, b1.checkYourself(2));
		assertEquals(true, b1.checkYourself(5));
	}
	
	@Test
	public void testBoatIsAlive() throws Exception
	{
		assertEquals(true, b1.isAlive());
		assertEquals(true, b2.isAlive());
		
		b1.checkYourself(4);
		assertEquals(true, b1.isAlive());
		
		b1.checkYourself(5);
		assertEquals(true, b1.isAlive());
		
		b1.checkYourself(6);
		assertEquals(false, b1.isAlive());
	}
	
	@Test
	public void testPlay() throws Exception
	{
		assertEquals(false, f1.play(2));
		assertEquals(true, f1.play(6));
		assertEquals(true, f1.play(8));
	}
	
	@Test
	public void testFleetIsAlive() throws Exception
	{
		assertEquals(true, f1.isAlive());
		
		f1.play(4);
		assertEquals(true, f1.isAlive());
		
		f1.play(5);
		assertEquals(true, f1.isAlive());

		f1.play(6);
		assertEquals(true, f1.isAlive());
		
		f1.play(8);
		assertEquals(true, f1.isAlive());
		
		f1.play(9);
		assertEquals(false, f1.isAlive());
	}

}
