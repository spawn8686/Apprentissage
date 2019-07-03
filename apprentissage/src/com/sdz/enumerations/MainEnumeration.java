package com.sdz.enumerations;

class MainEnumeration 
{
	public static void main(String[] args) 
	{
		for (Langage langue : Langage.values()) 
		{
			if (Langage.HTML.equals(langue)) 
				System.out.println("J'aime le : "+langue);
			else
				System.out.println(langue);
		}
	}

}
