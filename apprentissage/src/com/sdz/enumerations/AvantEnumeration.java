package com.sdz.enumerations;

class AvantEnumeration 
{
	public static final int PARAM1 = 1;
	public static final int PARAM2 = 2;
	
	public void fait(int param)
	{
		if (param == PARAM1)
			System.out.println("Fait grâce au PARAM1");
			
		else if (param == PARAM2)
			System.out.println("Fait grâce au PARAM2");	
		else
			System.out.println("Hors paramètre");
	}
	
	public static void main(String[] args) 
	{
		AvantEnumeration ea = new AvantEnumeration();
		ea.fait(PARAM1);
		ea.fait(PARAM2);
		ea.fait(4);
		ea.fait(AvantEnumeration.PARAM1);
		ea.fait(AvantEnumeration.PARAM2);
	}

}
