package com.prive.exercices.dijkstra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Arc implements Comparable<Arc>, Graphique {
	private Sommet origine, extremite;
	private int longueur;
	private boolean appartientArbo;
	
	public void setAppartientArbo(boolean appartientArbo) {
		this.appartientArbo = appartientArbo;
	}

	public Arc(Sommet origine, Sommet extremite, int longueur) {
		this.origine = origine;
		this.extremite = extremite;
		this.longueur = longueur;
	}

	public Sommet getOrigine() {
		return origine;
	}

	public Sommet getExtremite() {
		return extremite;
	}
	
	public int compareTo(Arc autre) {
		if (longueur < autre.longueur) return -1;
		if (longueur  > autre.longueur) return 1;
		return 0;
	}

	public void dessiner(Graphics g) {
		int x1 = origine.getAbs(), y1 = origine.getOrd();
		int x2 = extremite.getAbs(), y2 = extremite.getOrd();
		int epsilon = 5;
		int xInter = (x1 + + 4 * x2) / 5,  yInter = (y1 + 4 * y2) / 5;

		if (appartientArbo) ((Graphics2D)g).setStroke(new BasicStroke(3));
		
		g.drawLine(x1, y1, xInter, yInter);
		g.setColor(Color.RED);
		g.drawLine(xInter, yInter, x2 , y2);
		g.setColor(Color.BLACK);
		if ((x2 - x1) * (y2 - y1) < 0) epsilon = 10;
		g.drawString(Integer.toString(longueur), (x1 + x2)/2 + epsilon, (y1 + y2)/2 - 2);
		if (appartientArbo) ((Graphics2D)g).setStroke(new BasicStroke());
	}
	public String toString() {
		return "Arc (" + origine.getNom() + ", " + extremite.getNom() +")";
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLongueur() {
		return longueur;
	}
}
