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
public class SampleCircle 
{

  public static void main(String[] args) 
  {    
    //Création d'objets de la classe Circle
    
    Circle c1 = new Circle(4.7);
    Circle c2 = new Circle(13.8);
    Circle c3 = new Circle(9);
    
    System.out.printf("\nLes valeurs pour le cercle 1 sont :\n"
    		+ "la surface vaut : %1.2f\n"
    		+ "La circonference vaut : %1.2f\n"
    		+ "la conversion vaut : %1.2f\n",c1.area(), c1.circumference(), c1.radiusToDegrees());
    System.out.printf("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
    System.out.printf("\nLes valeurs pour le cercle 2 sont :\n"
			+ "la surface vaut : %1.2f\n"
			+ "La circonference vaut : %1.2f\n"
			+ "la conversion vaut : %1.2f\n",c2.area(), c2.circumference(), c2.radiusToDegrees());
    System.out.printf("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");
    System.out.printf("\nLes valeurs pour le cercle 3 sont :\n"
    		+ "la surface vaut : %1.2f\n"
    		+ "La circonference vaut : %1.2f\n"
    		+ "la conversion vaut : %1.2f\n",c3.area(), c3.circumference(), c3.radiusToDegrees());
  }// end main
}// /:~
