package p0300;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class P0315CP extends JPanel
{
	private Color foreColor;
		
	public P0315CP()
	{
		changeColor();
	}
	
	public void changeColor()
	{
		Random r = new Random();
		foreColor = new Color(r.nextInt());
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(foreColor);
		g.fillOval(0, 0, getWidth(), getHeight());
	}
}
