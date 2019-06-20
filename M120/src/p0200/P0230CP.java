package p0200;

import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

import javax.swing.JPanel;

public class P0230CP extends JPanel
{
	private int x;
	private int y;
	
	private Color colEpine, colTronc;
	public P0230CP()
	{	
		this(new Color(0, 120, 0), new Color(90, 50, 0));
	}
	public P0230CP(Color epine, Color tronc)
	{
		this.colEpine = epine;
		this.colTronc = tronc;
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		setOpaque(false);
		final int H = getHeight();
		final int h = H/8;
		final int W = getWidth();
		final int w = W/8;
		Polygon p;
		
		// ****** CORRECTION ******
		// Tronc
		p = new Polygon();
		p.addPoint(3*w, H);
		p.addPoint(4*w, 0);
		p.addPoint(5*w, H);
		g.setColor(colTronc);
		g.fillPolygon(p);
		
		//Triangle bas
		p = new Polygon();
		p.addPoint(0, 6*h);
		p.addPoint(4*w, 2*h);
		p.addPoint(W, 6*h);
		g.setColor(colEpine);
		g.fillPolygon(p);
		
		//Triangle milieu
		p = new Polygon();
		p.addPoint(1*w, 4*h);
		p.addPoint(4*w, 1*h);
		p.addPoint(7*w, 4*h);
		g.setColor(colEpine);
		g.fillPolygon(p);

		//Triangle haut
		p = new Polygon();
		p.addPoint(2*w, 2*h);
		p.addPoint(4*w, 0*h);
		p.addPoint(6*w, 2*h);
		g.setColor(colEpine);
		g.fillPolygon(p);	
	}
	
//	public void setLocation(int x, int y)
//	{
//		this.x = x;
//		this.y = y;
//		
//		repaint();
//	}
}