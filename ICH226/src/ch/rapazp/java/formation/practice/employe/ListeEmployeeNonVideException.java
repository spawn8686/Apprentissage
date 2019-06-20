package ch.rapazp.java.formation.practice.employe;

/* -----------------------------------------------------------------------------
 * (c) 2002, 2003 by Rodrigue Vaudan
 * -----------------------------------------------------------------------------
 *
 * ListeEmployeeNonVideException.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 21.02.2003     1.0       Creation
 * -----------------------------------------------------------------------------
 */

/**
 * Exercice 5
 * 
 * Erreur survenant lorsqu'une liste d'employée n'est pas vide
 * 
 * @author Rodrigue Vaudan
 * @version 1.0
 */
public class ListeEmployeeNonVideException extends Exception {

  public ListeEmployeeNonVideException(String str) {
    super(str);
  }// endConst
}// /:~