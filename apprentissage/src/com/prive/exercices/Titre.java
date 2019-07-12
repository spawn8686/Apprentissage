package com.prive.exercices;

public class Titre 
{
	public Titre() {}
	
	public void titre(String text)
	{
	    System.out.println("\n\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	    System.out.println("\t"+text);
	    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
	}
	public void titre(String text, boolean bool)
	{
		if (bool) {
		    System.out.println("\n\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		    System.out.println("\t"+text);
		    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
		}else
		{
		    System.out.println("\n\t"+text);
		}
	}
}
