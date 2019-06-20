package p0200;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class P0210CP extends JPanel
{		
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		final int W = getWidth();
		final int w = W / 10;
		final int H = getHeight();
		final int h = H / 10;
		
		// Tête
		g.setColor(Color.YELLOW);
		g.fillOval(0, 0, W, H);
		
		
		// Yeux
		g.setColor(Color.BLACK);
		g.fillOval(3*w, 3*h, w, h);
		g.fillOval(6*w, 3*h, w, h);
		
		// Bouche
		g.setColor(Color.BLACK);
		g.fillOval(3*w, 6*h, 4*w, 3*h);
		g.setColor(Color.YELLOW);
		g.fillOval(3*w, 5*h, 4*w, 3*h);
	}
}
