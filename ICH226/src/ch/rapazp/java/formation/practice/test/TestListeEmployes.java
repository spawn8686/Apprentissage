package ch.rapazp.java.formation.practice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import ch.rapazp.java.formation.practice.employe.*;

public class TestListeEmployes
{		
	private Employe fabrice, martin, stephane, henri;
	private ListeEmployes l1, l2;
	Employe tmpe = null;
	String tmps = null;	
	
	@Before
	public void init() throws Exception
	{	
		fabrice = new Employe("Duchamp","Fabrice","0123");
		martin = new Employe("Ducommun","Martin","1123");
		stephane = new Employe("Croset","Stephane","2123");
		henri = new Employe("Pralong","Henri","3123");
		
		l1 = new ListeEmployes();
		l2 = new ListeEmployes();
	}

	@Test
	public void testNewEmployes()
	{
		assertEquals("Fabrice", fabrice.getPrenom());
		fabrice.setNom("Machin");
		assertEquals("Machin", fabrice.getNom());
		fabrice.setNom("Duchamp");
		assertNotEquals("Machin", fabrice.getNom());
		
		assertEquals("1123", martin.getTel());
		assertEquals("Croset", stephane.getNom());
		assertEquals("Pralong Henri (3123)", henri.toString());
	}
	
	@Test
	public void testAjouterEmployes() throws EmployeNonTrouveException, TelNonTrouveException
	{
		System.out.println(l1.toString());
		l1.ajouter(henri);
		assertNotNull(l1.rechercheParNom("Pralong"));
		System.out.println(l1.toString());
		l1.ajouter(martin);
		assertNotNull(l1.rechercheParNom("Ducommun"));
		System.out.println(l1.toString());
		
		l2.ajouter(fabrice);
		l2.ajouter(stephane);
		
		
	}
	
	@Test (expected = EmployeNonTrouveException.class)
	public void testExceptionAjouterEmployes() throws EmployeNonTrouveException, TelNonTrouveException
	{
		tmpe = l1.rechercheParNom("Pralong");
		assertNull(tmpe);
		
		tmps = l2.toString();
		assertNull(tmps);		
	}


}
