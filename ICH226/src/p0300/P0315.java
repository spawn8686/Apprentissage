package p0300;

import robocode.Robot;

import java.awt.Color;


public class P0315 extends Robot
{
	@Override
	
	
	public void run()
	{
		out.println("C'est parti !");
		
		setBodyColor(Color.CYAN);
		setGunColor(Color.DARK_GRAY);
		setRadarColor(Color.CYAN);
	}
	
	public void onScannedRobot()
	{
		turnRadarLeft(360);
	}
	
}
