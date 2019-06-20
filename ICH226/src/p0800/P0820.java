package p0800;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P0820
{
	private Distributeur d1;

	@Before
	public void init() throws Exception
	{
		d1 = new Distributeur();
		d1.ajouterProduit(new Produit("chocolat", 1));
		d1.ajouterProduit(new Produit("compote", 0.7));
		d1.ajouterProduit(new Produit("biscuit", 1.8));
	}

	@Test
	public void testsStandards()
	{
		d1.ajouterArgent(3);
		assertEquals(0.0, d1.afficherBalance(), 0.01);
		assertEquals(true, d1.prendreProduit(1));
		assertEquals(1, d1.afficherBalance(), 0.01);
		assertEquals(true, d1.prendreProduit(3));
		assertEquals(2.8, d1.afficherBalance(), 0.01);
		assertEquals(false, d1.prendreProduit(2));
		assertEquals(0.2, d1.rendreArgent(), 0.01);
		assertEquals(2.8, d1.afficherBalance(), 0.01);
		
	}

	@Test
	public void testsSpeciaux()
	{
		d1.ajouterArgent(-10);
		assertEquals(0, d1.rendreArgent(), 0.01);
		assertEquals(0.0, d1.afficherBalance(), 0.01);
		d1.ajouterArgent(3);
		assertEquals(false, d1.prendreProduit(4));
		assertEquals(0.0, d1.afficherBalance(), 0.01);
		d1.ajouterProduit(new Produit("banane", 1.2));
		assertEquals(0.0, d1.afficherBalance(), 0.01);
	}
}
