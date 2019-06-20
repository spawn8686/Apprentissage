package p0400;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class P0405CP extends JPanel
{
	private boolean filled;
	private boolean symetric;
	private boolean rounded;
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		int x=0, y=0, w, h, min;
		w = getWidth()-1;
		h = getHeight()-1;
		min = Math.min(w, h);
		
		if(symetric)
		{
			x = (w - min)/2;
			y = (h - min)/2;
			w = min;
			h = min;
		}
		g.setColor(Color.GREEN);
		if(filled)
		{
			if(rounded)
			{
				g.fillOval(x, y, w, h);
			} else 
			{
				g.fillRect(x, y, w, h);				
			}
		} else 
		{
			if(rounded)
			{
				g.drawOval(x, y, w, h);
			} else 
			{
				g.drawRect(x, y, w, h);				
			}
		}
	}
	
	

	public void changeShape(boolean filled, boolean symetric, boolean rounded) 
	{
		this.filled = filled;
		this.symetric = symetric;
		this.rounded = rounded;
		
		repaint();
	}

}
