package p0200;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class P0220CP extends JPanel
{	
	private final int RADIUS = 10;
	private int x = -RADIUS;
	private int y = -RADIUS;
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval(x-RADIUS, y-RADIUS, 2*RADIUS, 2*RADIUS);
	}
	
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		repaint();
	}
}
