package p0100;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class P0120 extends JFrame implements ActionListener
{
	private JButton btnPrincipal;
	
	public P0120()
	{
		super("P0120");
		initGUI();
	}
	
	private void initGUI()
	{		
		setSize(250, 200);
		btnPrincipal = new JButton("Click");
		btnPrincipal.addActionListener(this);
		getContentPane().add(btnPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args)
	{
		P0120 test = new P0120();
		test.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		P0120 newFrame = new P0120();
		newFrame.setLocation(getX()+20, getY()+20);
		newFrame.setVisible(true);
	}
	
	

}
