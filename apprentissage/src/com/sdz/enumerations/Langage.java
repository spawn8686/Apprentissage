package com.sdz.enumerations;

enum Langage 
{
	JAVA("Langage JAVA"),
	Pascal("Langage Pascal"),
	Python("Langage Python"),
	HTML("Langage HTML"),
	CSS("Langage CSS"),
	PHP("Langage PHP"),
	JavaScript("Langage JavaScript"),
	C("Langage C"),
	CPlus("Langage CPlus"),
	CSharp("Langage CSharp");
	
	private String name = "";
	
	Langage(String name) 
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}
