package appui;

//*************************************
// Création des variable de classe
//*************************************
public class Circle
{
	private double r = 0;
	private double PI = 3.14159;
	
	//*************************************
	// Création des constructeurs de classe
	//*************************************
	public Circle(){};//end constr.
	/**
	 * 	
	 * @param r =
	 * 			initialise la grandeur du rayon du cercle
	 */
	public Circle(double r)
	{
		this.r = r;
	}//end constr.
	
	//*************************************
	// Création des méthodes de classe
	//*************************************
	/**
	 * 
	 * @return 
	 * 			La conversion de radius en degrés du cercle
	 */
	public double radiusToDegrees()
	{
		return r*180/PI;		
	}//end methode
	
	/**
	 * 
	 * @return 
	 * 			La surface du cercle
	 */
	public double area()
	{		
		return PI*r*r;
	}//end methode
	
	/**
	 * 
	 * @return 
	 * 			Le périmètre du cercle
	 */
	public double circumference()
	{
		return 2*PI*r;
	}//end methode
}//end classe
