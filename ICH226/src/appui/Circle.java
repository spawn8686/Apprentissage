package appui;

//*************************************
// Cr�ation des variable de classe
//*************************************
public class Circle
{
	private double r = 0;
	private double PI = 3.14159;
	
	//*************************************
	// Cr�ation des constructeurs de classe
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
	// Cr�ation des m�thodes de classe
	//*************************************
	/**
	 * 
	 * @return 
	 * 			La conversion de radius en degr�s du cercle
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
	 * 			Le p�rim�tre du cercle
	 */
	public double circumference()
	{
		return 2*PI*r;
	}//end methode
}//end classe
