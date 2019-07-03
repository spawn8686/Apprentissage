package com.sdz.enumerations;

class MainAvantEnumeration 
{
	public static final int PARAM1 = 1;
	public static final int PARAM2 = 2;
	public static final int PARAM3 = 3;
	
	public void fait(int param)
	{
		if (param == PARAM1)
			System.out.println("Fait grâce au PARAM1");
			
		else if (param == PARAM2)
			System.out.println("Fait grâce au PARAM2");	
		else if (param == PARAM3)
			System.out.println("Fait grâce au PARAM3");	
		else
			System.out.println("Hors paramètre");
	}
	
	public static void main(String[] args) 
	{
		MainAvantEnumeration ea = new MainAvantEnumeration();
		ea.fait(PARAM1);
		ea.fait(PARAM2);
		ea.fait(PARAM3);
		System.out.println("--------------------");
		ea.fait(MainAvantEnumeration.PARAM1);
		ea.fait(MainAvantEnumeration.PARAM2);
		ea.fait(MainAvantEnumeration.PARAM3);
		ea.fait(4);
	}

}
