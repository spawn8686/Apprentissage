package com.prive.exercices.dijkstra;

import java.awt.Graphics;
import java.util.ArrayList;

public class Sommet  implements Graphique, Comparable<Sommet > {
	private int abs, ord;
	private String nom;
	private Arc arcProche;
	private ArrayList<Arc> arcFils = new ArrayList<Arc>();
	private int distance = Arborescence.INFINI;

	public Sommet(String nom, int abs, int ord) {
		this.nom = nom;
		this.abs = abs;
		this.ord = ord;
	}
		
	public ArrayList<Arc> getArcFils() {
		return arcFils;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getNom() {
		return nom;
	}

	public Arc getArcProche() {
		return arcProche;
	}

	public void setArcProche(Arc arcProche) {
		distance = arcProche.getOrigine().getDistance() + arcProche.getLongueur();
		this.arcProche = arcProche;
	}

	public void ajouterFils(Arc a) {
		arcFils.add(a);
	}
	
	public void dessiner(Graphics g) {
		if(distance != Arborescence.INFINI)
			g.drawString(nom + " "  + distance, abs + 5, ord-10);
		else
			g.drawString(nom, abs + 5, ord-10);
		g.fillOval(abs - 5, ord - 5, 10, 10);
	}

	public int getAbs() {
		return abs;
	}

	public int getOrd() {
		return ord;
	}
	
	public int compareTo(Sommet autre) {
		if ((autre.getArcProche() == null) && (arcProche == null)) return 0;
		if ((autre.getArcProche() == null) && (arcProche != null)) return -1;
		if ((autre.getArcProche() != null) && (arcProche == null)) return 1;
		return arcProche.compareTo(autre.getArcProche()) ;
	}
	public String toString() {
		return nom;
	}
}
