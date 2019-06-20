package p0200;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class P0205CP extends JPanel
{	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);			
		g.setColor(Color.ORANGE);
		g.fillRect(getX()+10, getY()+10, getWidth()-20, getHeight()-20);
	}
}
