package com.sdz.enumerations;

enum Langage 
{
	JAVA("Langage JAVA", "Eclipse"),
	Pascal("Langage Pascal", "Lazarus"),
	Python("Langage Python", "Atom"),
	HTML("Langage HTML", "SublimText"),
	CSS("Langage CSS", "SublimText"),
	PHP("Langage PHP", "SublimText"),
	JavaScript("Langage JavaScript", "SublimText"),
	C("Langage C", "Code::Blocks"),
	CPlus("Langage CPlus", "C++ Builder"),
	CSharp("Langage CSharp", "Visual Studio");
	
	private String name = "";
	private String editor = "";
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									CONSTRUCTEUR
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	Langage(String name, String editor) 
	{
		this.name = name;
		this.editor = editor;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									GETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public String getName()
	{
		return this.name;
	}
	public String getEditor()
	{
		return this.editor;
	}
	
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									SETTER
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEditor(String editor)
	{
		this.editor = editor;
	}
		
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	//									METHODES
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
	public String toString()
	{
		String str = "Pour le langage '"+this.name+"', on peut utiliser l'éditeur '"+this.editor+"'";
		return str;
	}
}
