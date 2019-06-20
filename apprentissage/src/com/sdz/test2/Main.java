package com.sdz.test2;

import com.sdz.test.A;
import com.sdz.test.B;

public class Main 
{
	public static void main(String[] args) 
	{
		/*
		 *Dans le cas pr�sent, vu que les class A & B ne sont pas dans le m�me package,
		 *seul la class A peut �tre d�clar� ici, �tant donn� que celle-ci est de port�e
		 *public, la class B elle, ne sera pas accessible depuis un autre package.
		*/
		A a = new A();
		B b = new B();
		a.b.str = "toto";
		/*
		 *Il en va de m�me pour toute variable ou m�thode de port�e default, m�me si  
		 *ceux-ci ce trouve dans une class de port� public, elles ne pourront �tre  
		 *accessible que de l'int�rieur du package.
		*/
	}
}

