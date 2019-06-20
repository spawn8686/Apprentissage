package p0200;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class P0200CP extends JPanel
{
	private int large = 200;
	private int haut = 100;
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);			
		g.setColor(Color.ORANGE);
		g.fillRect((getWidth()/2)-(large/2), (getHeight()/2)-(haut/2), large, haut);
	}
}
