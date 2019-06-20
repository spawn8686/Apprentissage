package p0200;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class P0225 extends JFrame implements MouseListener
{	
	public P0225()
	{
		super("P0225");
		initGui();
	}
	
	public static void main(String[] args)
	{
		P0225 frm = new P0225();
		frm.setVisible(true);
	}
	
	private void initGui()
	{
		setSize(400, 300);
		getContentPane().addMouseListener(this);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		P0225CP pnlSapin = new P0225CP();
		pnlSapin.setBounds(e.getX()-20, e.getY()-25, 40, 50);
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
