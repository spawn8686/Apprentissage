package appui;
/* -----------------------------------------------------------------------------
 * (c) 2014 by Pascal Rapaz
 * -----------------------------------------------------------------------------
 *
 * Coordinate.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 15.01.2014     1.0       Creation
 * -----------------------------------------------------------------------------
 */

/**
 * Representation cartesienne d'une coordonnee (x, y, z)
 * 
 * @author Pascal Rapaz
 * @version 1.0
 */
public class Coordinate implements Cloneable 
{

  private double x = 0.0;
  private double y = 0.0;
  private double z = 0.0;

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Constructeurs
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public Coordinate(){}// endConst

  /**
   * Constructeur qui initialise les champs x et y
   * 
   * @param x
   *          Coordonnees du point x
   * @param y
   *          Coordonnees du point y
   */
  public Coordinate(double x, double y) 
  {

    this.x = x;
    this.y = y;
  }// endConst

  /**
   * Constructeur qui initialise les champs x, y et z
   * 
   * @param x
   *          Coordonnees du point x
   * @param y
   *          Coordonnees du point y
   * @param z
   *          Coordonnees du point z
   */
  public Coordinate(double x, double y, double z) 
  {

    this(x, y); // appel du construteur (x, y)
    this.z = z;
  }// endConst

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Methodes
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
   * Methode agissant sur les champs
   */
  public double distanceFromOrigin() 
  {
    return Math.sqrt(x * x + y * y + z * z);
  }// endFct

  /**
   * Retourne une chaine contenant les coordonnees du point
   */
  public String toString() 
  {
    return x + " " + y + " " + z;
  }// endFct

  /**
   * Surdefinition de la methode permettant de cloner un objet
   */
  public Object clone() 
  {
    try 
    {
      return (Coordinate) super.clone();
    } catch (CloneNotSupportedException cnse) 
    {
      return null; // retourne null en cas de probleme
                   // l'objet etant cloneable, cela ne devrait pas se produire!
    }// endTry
  }// endFct
}// /:~
