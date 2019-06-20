package p0200;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class P0230 extends JFrame implements MouseListener
{	
	public P0230()
	{
		super("P0230");
		initGui();
	}
	
	public static void main(String[] args)
	{
		P0230 frm = new P0230();
		frm.setVisible(true);
	}
	
	private void initGui()
	{
		setSize(400, 300);
		getContentPane().addMouseListener(this);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private Rectangle getBounds(int x, int y, int maxHeight)
	{
		final int MIN_HEIGHT = 35;
		final int MAX_HEIGHT = 150;
		
		int height;
		int width;
		int posX;
		int posY;
		
		height = MIN_HEIGHT + (int)((1.0*y / maxHeight) * (MAX_HEIGHT - MIN_HEIGHT));
		width = height * 4 / 5;
		posX = x - width / 2;
		posY = y - height / 2;
		System.out.printf("y = %d, height = %d \n", y, height);
		
		return new Rectangle(posX, posY, width, height);
		
//		final int DELTAH = 115;
//		final int RAPPORTHL = 50/40;
//		final int POURCENT = (getHeight()*pnlSapin.getY()/100);
//		final int HAUTEUR = DELTAH * POURCENT / 100;
//		final int LARGEUR = HAUTEUR / RAPPORTHL;
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		P0230CP pnlSapin = new P0230CP();
		pnlSapin.setBounds(getBounds(e.getX(), e.getY(), getContentPane().getHeight()));
		pnlSapin.setOpaque(false);
		getContentPane().add(pnlSapin);		
		getContentPane().repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
