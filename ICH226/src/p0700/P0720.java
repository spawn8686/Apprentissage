package p0700;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P0720
{
	private TriangleRectangle tr1, tr2, tr3, tr4;
	
	@Before
	public void init() throws Exception
	{
		tr1 = new TriangleRectangle(3, 4);
		tr2 = new TriangleRectangle(1, 1);
		tr3 = new TriangleRectangle(Math.sqrt(3), 1);
		tr4 = new TriangleRectangle(0.5, Math.sqrt(3)/2);
	}
	
	@Test
	public void testHypotenus() throws Exception
	{
		assertEquals(5, tr1.getHypotenuse(), 0.01);
		assertEquals(2, tr3.getHypotenuse(), 0.01);
		assertEquals(1, tr4.getHypotenuse(), 0.01);
		assertEquals(Math.sqrt(2), tr2.getHypotenuse(), 0.01);
	}

	@Test
	public void testAngle() throws Exception
	{
		assertEquals(45, tr2.getAngle(), 0.01);
		assertEquals(30, tr3.getAngle(), 0.01);
		assertEquals(60, tr4.getAngle(), 0.01);
		assertEquals(53.13, tr1.getAngle(), 0.01);
	}
}
