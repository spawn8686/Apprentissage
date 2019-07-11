package com.sdz.exercices.dijkstra;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arborescence implements Graphique {
	public static final int INFINI = Integer.MAX_VALUE;
	private ArrayList<Sommet> sommets = new ArrayList<Sommet>();
	private Sommet depart;

	public ArrayList<Sommet> getSommets() {
		return sommets;
	}

	public Arborescence(String nom) throws IOException {
		lireFichier(nom);
		dijkstra();
	}

	@SuppressWarnings("resource")
	public void lireFichier(String nom) throws IOException {
		File fichier = new File(nom);
		Scanner lecteur = new Scanner(fichier);
		int longueur;
		int n = lecteur.nextInt(), i;
		Sommet origine, extremite;

		for (i = 0; i < n; i++) 
			sommets.add(new Sommet(lecteur.next(), lecteur.nextInt(), lecteur.nextInt()));
		depart = chercher(lecteur.next());
		while(lecteur.hasNext()) {
			origine = chercher(lecteur.next());
			extremite  = chercher(lecteur.next());
			longueur =  lecteur.nextInt();
			origine.ajouterFils(new Arc(origine, extremite, longueur)) ;
		}
	}

	public Sommet chercher(String nom) {
		for (Sommet s : sommets) 
			if (s.getNom().equals(nom)) return s;
		return null;
	}

	public void dessiner(Graphics g) {
		for (Sommet s : sommets) {
			for (Arc a : s.getArcFils()) a.dessiner(g);
			s.dessiner(g);
		}
	}

	@SuppressWarnings("unchecked")
	public void dijkstra() {
		Sommet extremite, sommetChoisi;
		boolean fini = false;
		ArrayList<Sommet> S = (ArrayList<Sommet>)sommets.clone(); 

		depart.setDistance(0);
		S.remove(depart);
		for (Arc a : depart.getArcFils()) {
			extremite = a.getExtremite();
			extremite.setArcProche(a);
		}
		while((!fini) && (S.size() > 1))	{
			sommetChoisi =Collections.min(S);
			if (sommetChoisi.getDistance() == INFINI) {
				fini = true;
				break;
			}
			S.remove(sommetChoisi);
			for (Arc a : sommetChoisi.getArcFils()) {
				extremite = a.getExtremite();
				int oldDistance, newDistance;

				if (S.contains(extremite)) {
				    oldDistance = extremite.getDistance();
				    newDistance = sommetChoisi.getDistance() + a.getLongueur();
				    
				    if (newDistance < oldDistance){ 
					extremite.setArcProche(a);
				    }
				}
			}
		}
	}
    
	public void marquerArbo() {
		for (Sommet s : sommets) 
			if ((s != depart) && (s.getDistance() != INFINI))  s.getArcProche().setAppartientArbo(true);
	}

	public String calculerChemin(Sommet s)  {
		ArrayList<Sommet> chemin = new ArrayList<Sommet>();
		String chaine = "";
		Sommet r, pre;
		if (s.getDistance() != INFINI) {
			chemin.add(s);
			r = s;
			while (r != depart){
				pre = r.getArcProche().getOrigine();
				chemin.add(pre);
				r = pre;
			} 
			while (chemin.size() > 0) {
				r = chemin.get(chemin.size() - 1);
				chaine = chaine.concat(" " + r.getNom());
				chemin.remove(r);
			}
			chaine = chaine.concat(", distance " + s.getDistance());
		}
		else chaine = "  " + s.getNom() + " : inaccessible";
		return chaine;
	}
	public void afficher() {
		System.out.println("Les chemins et les distance depuis " + depart.getNom() + "  sont :");
		for (Sommet s : sommets) {
			System.out.println("Pour " + s  + " : "+ calculerChemin(s));
		}
	}
}
