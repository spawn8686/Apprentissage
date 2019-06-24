package com.sdz.test2;

import com.sdz.test.A;
import com.sdz.test.B;

public class Main 
{
	public static void main(String[] args) 
	{
		/*
		 *Dans le cas présent, vu que les class A & B ne sont pas dans le même package,
		 *seul la class A peut être déclaré ici, étant donné que celle-ci est de portée
		 *public, la class B elle, ne sera pas accessible depuis un autre package.
		*/
		A a = new A();
		B b = new B();
		a.b.str = "toto";
		/*
		 *Il en va de même pour toute variable ou méthode de portée default, même si  
		 *ceux-ci ce trouve dans une class de porté public, elles ne pourront être  
		 *accessible que de l'intérieur du package.
		*/
	}
}

