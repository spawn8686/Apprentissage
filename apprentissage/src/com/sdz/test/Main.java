package com.sdz.test;

public class Main 
{
	public static void main(String[] args) 
	{
		/*
		Dans le cas présent, vu que les class A & B sont dans le même package,
		leur déclarations ne posent aucun problème (même si la class B est )
		de portée default)
		*/
		A a = new A();
		B b = new B();
	}
}























