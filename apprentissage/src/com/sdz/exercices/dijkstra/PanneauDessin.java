package com.sdz.exercices.dijkstra;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanneauDessin extends JPanel{
	public static final long serialVersionUID = 1;
	Arborescence dijkstra;
	private int decalageX, decalageY;
	
	public PanneauDessin(Arborescence dijkstra) {
		int minX, maxX, minY , maxY ;
		this.dijkstra = dijkstra;
		minX = minX();
		maxX = maxX();
		minY = minY();
		maxY = maxY();
		decalageX = -minX + 50;
		decalageY = -minY + 50;
		setPreferredSize(new Dimension(maxX - minX + 150, maxY - minY + 100));
	}
	
	private int minX() {
		int min = Integer.MAX_VALUE;
		ArrayList<Sommet> liste = dijkstra.getSommets();
		for (Sommet s : liste) if (s.getAbs() < min) min = s.getAbs();
		return min;
	}
	
	private int minY() {
		int min = Integer.MAX_VALUE;
		ArrayList<Sommet> liste = dijkstra.getSommets();
		for (Sommet s : liste) if (s.getOrd() < min) min = s.getOrd();
		return min;
	}

	private int maxX() {
		int max = Integer.MIN_VALUE;
		ArrayList<Sommet> liste = dijkstra.getSommets();
		for (Sommet s : liste) if (s.getAbs() > max) max = s.getAbs();
		return max;
	}
	
	private int maxY() {
		int max = Integer.MIN_VALUE;
		ArrayList<Sommet> liste = dijkstra.getSommets();
		for (Sommet s : liste) if (s.getOrd() > max) max = s.getOrd();
		return max;
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.translate(decalageX, decalageY);
		dijkstra.dessiner(g);
		g.translate(-decalageX, -decalageY);
	}
}
