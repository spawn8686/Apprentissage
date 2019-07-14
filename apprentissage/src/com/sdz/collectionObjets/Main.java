package com.sdz.collectionObjets;

import java.util.*;

import com.prive.exercices.Titre;

public class Main 
{

	public static void main(String[] args) 
	{
		Titre ti = new Titre();
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									LinkedList
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ti.titre("Exemple de LinkedList");
		List l = new LinkedList();
		l.add(12);
		l.add("toto ! !");
		l.add(12.20f);

		for(int i = 0; i < l.size(); i++)
		System.out.println("Élément à l'index " + i + " = " + l.get(i));
	
	    ti.titre("Test avec un ListItérateur", false);
	    ListIterator li = l.listIterator();

	    while(li.hasNext())
	      System.out.println(li.next());
	      
	      
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									ArrayList
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
	    ti.titre("Exemple d'ArrayList");
	    ArrayList al = new ArrayList();
	    al.add(12);
	    al.add("Une chaîne de caractères !");
	    al.add(12.20f);
	    al.add('d');
	                  
	    for(int i = 0; i < al.size(); i++)
	      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
	    
	    // Test avec un itérateur
	    ti.titre("Test avec un ListItérateur", false);
	    li = al.listIterator();
	    
	    while (li.hasNext())
	    	System.out.println(li.next());
	    
	    
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									Hashtable
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
	    ti.titre("Exemple de Hashtable");
	    Hashtable ht = new Hashtable();
	    ht.put(1, "printemps");
	    ht.put(10, "été");
	    ht.put(12, "automne");
	    ht.put(45, "hiver");

	    Enumeration e = ht.elements();

	    while(e.hasMoreElements())
	      System.out.println(e.nextElement());	
	    
	    
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//									HashSet
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
	    ti.titre("Exemple de HashSet");
	    HashSet hs = new HashSet();
	    hs.add("toto");
	    hs.add(12);
	    hs.add('d');

	    ti.titre("Avec un Itérateur", false);
	    Iterator it = hs.iterator();
	    while(it.hasNext())
	      System.out.println(it.next());
	                
	    ti.titre("Parcouru grâce à un tableau d'objet", false);
	    Object[] obj = hs.toArray();
	    for(Object o : obj)
	      System.out.println(o);
	}

}
