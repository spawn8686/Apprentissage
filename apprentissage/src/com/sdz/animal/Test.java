package com.sdz.animal;

public class Test 
{
	public static void main(String[] args) 
	{
		//cr�ation d'un loup
	    Animal lo = new Loup("Gris bleut�", 20);
	    lo.boire();
	    lo.manger();
	    lo.deplacement();
	    lo.crier();
	    System.out.println(lo.toString()+"\n\n");
	    
	    //cr�ation d'un tigre
	    Animal ti = new Tigre();
	    ti.crier();
	    System.out.println(ti.toString()+"\n\n");
	    
	    //cr�ation d'un chat
	    Animal ch = new Chat();
	}
}
// premier text d'exemple





































