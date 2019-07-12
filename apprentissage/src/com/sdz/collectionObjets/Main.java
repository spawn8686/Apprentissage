package com.sdz.collectionObjets;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main 
{

	public static void main(String[] args) 
	{
		List l = new LinkedList();
		l.add(12);
		l.add("toto ! !");
		l.add(12.20f);

		for(int i = 0; i < l.size(); i++)
		System.out.println("Élément à l'index " + i + " = " + l.get(i));
		
		
		List l1 = new LinkedList();
	    l1.add(12);
	    l1.add("toto ! !");
	    l1.add(12.20f);

	    for(int i = 0; i < l1.size(); i++)
	      System.out.println("Élément à l'index " + i + " = " + l1.get(i));

	      System.out.println("\n \tParcours avec un itérateur ");
	      System.out.println("-----------------------------------");
	      ListIterator li = l1.listIterator();

	      while(li.hasNext())
	        System.out.println(li.next());
	}

}
