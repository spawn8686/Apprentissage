package p0700;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P0705
{
	private Calculation calculation;
	
	@Before
	public void setUp() throws Exception
	{
		calculation = new Calculation(3, 2);
	}

	@Test
	public void testSum() throws Exception
	{
		assertEquals(5, calculation.sum());;
	}
	
	@Test
	public void testDiff()
	{
		assertEquals(1, calculation.diff());
	}

}
