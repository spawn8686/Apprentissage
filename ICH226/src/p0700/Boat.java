package p0700;

import java.util.ArrayList;

public class Boat
{
	private ArrayList<Integer> positions = new ArrayList<Integer>();

	public Boat(int start, int size)
	{		
		for (int i = 0; i < size; i++)
		{
			positions.add(start + i);
		}
	}
	
	public boolean checkYourself(Integer position)
	{
		return positions.remove(position);
	}
	
	public boolean isAlive()
	{
		return !positions.isEmpty();
//		return !positions.isEmpty();
	}
}
