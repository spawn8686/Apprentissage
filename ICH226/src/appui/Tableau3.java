package appui;

import java.util.Arrays;

public class Tableau3 {

	public static void main(String[] args) 
	{
		String initial = "12;ab;cd;AB;fx;ef;QA";
		
		String[] val = initial.split(";");
		
		Arrays.sort(val);
		
		for(int i = 0; i < val.length; i++)
		{
			System.out.println(val[i]);
		}
		
		for(String s : val)
		{
			System.out.println(s);
		}
	}
}
