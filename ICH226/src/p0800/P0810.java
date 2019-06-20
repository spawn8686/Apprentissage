package p0800;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P0810
{
	/*
	 Réaliser un Test unitaire utilisant le distributeur en réalisant les étapes suivantes
	 o   Instancier un distributeur 
	 -   le prix de la boisson est de 1.50 CHF
	 o   Ajouter 1 CHF
	 o   Prendre une boisson
	 -   Le montant introduit est insuffisant
	 o   Ajouter 1 CHF
	 o   Prendre une boisson
	 -   La boisson est servie
	 o   Prendre l'argent restant
	 -   il devrait rester 0.50 CHF
	 */
	
	private DistributeurSimple d1;

	@Before
	public void init() throws Exception
	{
		d1 = new DistributeurSimple(1.5);
	}

	@Test
	public void testDistributeur()
	{
		//Ajouter -1 CHF
		d1.ajouterArgent(-1);
		//tester le montant présent
		assertEquals(0.0, d1.rendreArgent(), 0.01);
		
		
		//Ajout argent
		d1.ajouterArgent(1);
		//Vérifier que l'on ne peut pas prendre de boisson
		assertFalse(d1.prendreBoisson());
		//Ajout argent
		d1.ajouterArgent(1);
		//Vérifier que l'on peut prendre la boisson
		assertTrue(d1.prendreBoisson());
		//Vérifier que le distributeur rende 0.5 CHF
		assertEquals(0.5, d1.rendreArgent(), 0.01);
	}	
}
