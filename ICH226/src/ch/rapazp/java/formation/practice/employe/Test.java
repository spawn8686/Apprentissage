package ch.rapazp.java.formation.practice.employe;

/* -----------------------------------------------------------------------------
 * (c) 2002, 2003 by Rodrigue Vaudan
 * -----------------------------------------------------------------------------
 *
 * Test.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 21.02.2003     1.0       Creation
 * -----------------------------------------------------------------------------
 */

/**
 * Exercice 5
 * 
 * Classe de test
 * 
 * @author Rodrigue Vaudan
 * @version 1.0
 */
public class Test {

  public static void main(String[] args) {
    ListeEmployes listeEmployes = new ListeEmployes();

    Employe rodrigue = new Employe("Vaudan", "Rodrigue", "2182");
    listeEmployes.ajouter(rodrigue);
    
    listeEmployes.ajouter(new Employe("Rapaz", "Pascal", "2189"));

    try {
      System.out.println(listeEmployes.rechercheParNom("rapaz"));
      System.out.println(listeEmployes.rechercheParTel("2172"));
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }// endTry

    listeEmployes.print();
  }// endMain
}// /:~