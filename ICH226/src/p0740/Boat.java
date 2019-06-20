package p0740;

import java.util.ArrayList;
import java.util.Collection;

public class Boat
{
	private ArrayList<String> positions = new ArrayList<>();
	private String name;
	
	public Boat(){};
	
	public Boat(String name, String start, int size, boolean isHorizontal)
	{
		positions = new ArrayList<>();
		char row;
		int col;
		row = start.charAt(0);
		col = Integer.valueOf(start.substring(1));
		String coordinate;
		System.out.printf("%c%d\n", row, col);
		
		for (int i = 0; i < size; i++)
		{
			if(isHorizontal)
			{
				coordinate = ""+row + (col + 1);
			}
			else
			{
				coordinate = String.format("%c%d", row+i, col);
			}
			positions.add(coordinate);
		}
	}
	
	public boolean checkYourself(String position)
	{
		return positions.remove(position);
	}
	
	public boolean isAlive()
	{
		return !positions.isEmpty();
	}
	
	public Collection<String> getPosition()
	{
		return positions;
	}
}
