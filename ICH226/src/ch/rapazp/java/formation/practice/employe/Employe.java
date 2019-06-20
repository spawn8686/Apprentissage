package ch.rapazp.java.formation.practice.employe;

/* -----------------------------------------------------------------------------
 * (c) 2002, 2003 by Rodrigue Vaudan
 * -----------------------------------------------------------------------------
 *
 * Employe.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 20.02.2003     1.0       Creation
 * -----------------------------------------------------------------------------
 */

/**
 * Exercice 5
 * 
 * Representation d'un employe
 * 
 * @author Rodrigue Vaudan
 * @version 1.0
 */
public class Employe {

  private String nom = null;
  private String prenom = null;
  private String tel = null;

  public Employe(String nom, String prenom, String tel) {
    this.nom = nom;
    this.prenom = prenom;
    this.tel = tel;
  }// endConst

  public String toString() {
    return nom + " " + prenom + " (" + tel + ")";
  }// endFct

  /**
   * @return String
   */
  public String getNom() {
    return nom;
  }

  /**
   * @return String
   */
  public String getPrenom() {
    return prenom;
  }

  /**
   * @return String
   */
  public String getTel() {
    return tel;
  }

  /**
   * Sets the nom.
   * 
   * @param nom
   *          The nom to set
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * Sets the prenom.
   * 
   * @param prenom
   *          The prenom to set
   */
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  /**
   * Sets the tel.
   * 
   * @param tel
   *          The tel to set
   */
  public void setTel(String tel) {
    this.tel = tel;
  }

}// /:~