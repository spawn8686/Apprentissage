package appui;
/* -----------------------------------------------------------------------------
 * (c) 2014 by Pascal Rapaz
 * -----------------------------------------------------------------------------
 *
 * Sample2DCoordinate.java
 *
 * -----------------------------------------------------------------------------
 * WHEN           VERSION   DESCRIPTION
 * 15.01.2014     1.0       Creation
 * -----------------------------------------------------------------------------
 */

/**
 * Exemple de passage d'objets en arguments de methodes
 * 
 * @author Pascal Rapaz
 * @version 1.0
 */
public class Sample2DCoordinate 
{

  public static void main(String[] args) 
  {
    Coordinate p1 = new Coordinate(2, 3.5);
    Coordinate p2 = new Coordinate(4, 1.5);

    System.out.println("\nAvant modifications");
    System.out.println("~~~~~~~~~~~~~~~~~~~");
    System.out.println("Coordonnees du Coordinate 1: " + p1);
    System.out.println("Coordonnees du Coordinate 2: " + p2);

    badSwapCoordinates(p1, p2);

    System.out.println("\nApres modifications");
    System.out.println("~~~~~~~~~~~~~~~~~~~");
    System.out.println("Coordonnees du Coordinate 1: " + p1);
    System.out.println("Coordonnees du Coordinate 2: " + p2);

    // Copie d'un objet Coordinate
    Coordinate q = (Coordinate) p1.clone();
    System.out.println("Coordonnees de la copie: " + q);
  }// end main

  /**
   * Permute 2 Coordinates
   * 
   * <p>
   * <b> !!! Cette methode n'a aucun effet car les objets sont passes par copie
   * !!! </b>
   * </p>
   * 
   * @param a
   *          Le premier point
   * @param b
   *          Le second point
   */
  public static void badSwapCoordinates(Coordinate a, Coordinate b) 
  {
    Coordinate tmp = a;
    a = b;
    b = tmp;
  }// endFct
}// /:~
