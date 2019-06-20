package p0740;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P0740
{
	private Boat boat1, boat2;
	private Fleet fleet;
	
	@Before
	public void init() throws Exception
	{
		boat1 =new Boat("boat 1", "B3", 3, false);
		boat2 =new Boat("boat 2", "C4", 2, true);
		fleet = new Fleet();
		fleet.add(boat1);
		fleet.add(boat2);
	}	
	
	@Test
	public void testBoatCheckYourself()
	{
		assertEquals(false, boat1.checkYourself("B3"));
		assertEquals(false, boat1.checkYourself("B4"));
		assertEquals(false, boat1.checkYourself("B2"));
		assertEquals(false, boat1.checkYourself("A3"));
		
		assertEquals(true, boat1.checkYourself("B3"));
		assertEquals(true, boat1.checkYourself("C3"));
		assertEquals(true, boat1.checkYourself("D3"));
	}
	
	@Test
	public void testBoatIsAlive() throws Exception
	{
		// vérifie, qu'avant chaque tir en (B3, C3, D3) boat1 est toujours opérationnel
		// vérifie qu'après le dernier tir (en D3), boat1 n'est plus opérationnel
		assertEquals(true, boat1.isAlive());
		boat1.checkYourself("B3");
		assertEquals(true, boat1.isAlive());
		boat1.checkYourself("C3");
		assertEquals(true, boat1.isAlive());
		boat1.checkYourself("D3");
		assertEquals(false, boat1.isAlive());
	}
	
	@Test
	public void testFleetPlay() throws Exception
	{
		assertEquals(false, fleet.play("A3"));
		assertEquals(true, fleet.play("C3"));
		assertEquals(true, fleet.play("C5"));
	}
	
	@Test
	public void testFleetIsAlive() throws Exception
	{
		assertEquals(true, fleet.isAlive());
		fleet.play("B3");
		assertEquals(true, fleet.isAlive());
		fleet.play("C3");
		assertEquals(true, fleet.isAlive());
		fleet.play("D3");
		assertEquals(true, fleet.isAlive());
		fleet.play("C4");
		assertEquals(true, fleet.isAlive());
		fleet.play("C5");
		assertEquals(false, fleet.isAlive());
	}	
}
