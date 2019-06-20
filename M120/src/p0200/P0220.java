package p0200;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class P0220 extends JFrame implements MouseListener
{
	private P0220CP pnl = new P0220CP();
	
	public P0220()
	{
		super("P0220");
		initGui();
	}	

	public static void main(String[] args)
	{
		P0220 frm = new P0220();
	}
	
	private void initGui()
	{
		setVisible(true);
		setSize(400, 300);
		getContentPane().add(pnl);
		pnl.addMouseListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		System.out.printf("click (%d, %d)\n", e.getX(), e.getY());
		pnl.setLocation(e.getX(), e.getY());
		repaint();
		
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
