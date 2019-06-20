package p0700;

import java.util.ArrayList;

public class Fleet
{
	private ArrayList<Boat> boats = new ArrayList<Boat>();
	
	public void add(Boat boat)
	{
		boats.add(boat);
	}
	
	public boolean play(Integer position)
	{
		for (Boat boat : boats)
		{
			if(boat.checkYourself(position))
			{					
				return true;
			}
		}
		return false;
	}
	
	public boolean isAlive()
	{
		for (Boat boat : boats)
		{
			if (boat.isAlive())
			{
				return true;
			}
		}
		return false;
	}
}
