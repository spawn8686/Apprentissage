package p0300;

import robocode.Robot;

import java.awt.Color;

public class P0310 extends Robot
{
	@Override
	public void run()
	{
		out.println("Let's go !");
		//setColors(Color.GREEN, Color.GREEN, Color.YELLOW);
		
		// ou
		
		setBodyColor(Color.GREEN);
		setGunColor(Color.GREEN);
		setRadarColor(Color.YELLOW);
		
		for(int i = 0; i < 4; i++)
		{
			ahead(100);
			turnRight(90);
		}
		//Salve d'Honneur
		out.println("Salve d'honneur");
		setBodyColor(Color.BLACK);
		setRadarColor(Color.BLACK);
		setGunColor(Color.RED);
		setBulletColor(Color.RED);
		
		for(int i = 0; i < 9; i++)
		{
			while(getGunHeat()>0)
			{
				doNothing();
			}
			fire(1);
			turnGunLeft(45);
		}
		
		out.println("En observation");
		setBodyColor(Color.DARK_GRAY);
		setGunColor(Color.DARK_GRAY);
		setBulletColor(Color.DARK_GRAY);
		setRadarColor(Color.RED);
		setScanColor(Color.RED);
		
		while(true)
		{
			turnRadarRight(90);
		}
	}
}
