package ch.rapazp.java.formation.practice.employe;

/* -----------------------------------------------------------------------------
 * (c) 2002, 2003 by Rodrigue Vaudan
 * -----------------------------------------------------------------------------
 *
 * EmployeNonValideException.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 21.02.2003     1.0       Creation
 * -----------------------------------------------------------------------------
 */

/**
 * Exercice 5
 * 
 * Erreur survenant lorsqu'un employe n'est pas valide
 * 
 * @author Rodrigue Vaudan
 * @version 1.0
 */
public class EmployeNonValideException extends Exception {

  public EmployeNonValideException(String str) {
    super(str);
  }// endConst
}// /:~