package p0200;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class P0215CP extends JPanel 
{
	private Color colEpine;
	private Color colTronc;
	/**
	 * Constructeur sans paramètre, avec valeurs de base forcées
	 */
	public P0215CP() 
	{
		this(new Color(0, 120, 0));
	}
	/**
	 * Constructeur avec 1 paramètre "épine"
	 * @param epine
	 */
	public P0215CP(Color epine) 
	{
		this(epine, new Color(80, 30, 0));
	}
	/**
	 * Constructeur avec 2 paramètres "épine et tronc"
	 * @param epine
	 * @param tronc
	 */
	public P0215CP(Color epine, Color tronc) 
	{
		this.colEpine = epine;
		this.colTronc = tronc;
	}
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		final int W = getWidth();
		final int w = W / 8;
		final int H = getHeight();
		final int h = H / 8;
		
		//Tronc
		Polygon p = new Polygon();
		p.addPoint(3*w, H);
		p.addPoint(4*w, 0);
		p.addPoint(5*w, H);
		g.setColor(colTronc);
		g.fillPolygon(p);
		
		//Triangle Bas
		p = new Polygon();
		p.addPoint(0, 6*h);
		p.addPoint(4*w, 2*h);
		p.addPoint(8*w, 6*h);
		g.setColor(colEpine);
		g.fillPolygon(p);
		
		//Triangle Milieu
		p = new Polygon();
		p.addPoint(1*w, 4*h);
		p.addPoint(4*w, 1*h);
		p.addPoint(7*w, 4*h);
		g.setColor(colEpine);
		g.fillPolygon(p);

		//Triangle Milieu
		p = new Polygon();
		p.addPoint(2*w, 2*h);
		p.addPoint(4*w, 0);
		p.addPoint(6*w, 2*h);
		g.setColor(colEpine);
		g.fillPolygon(p);
	}
}
