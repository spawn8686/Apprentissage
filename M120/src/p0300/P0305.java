package p0300;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class P0305 extends JFrame implements ActionListener
{
	private P0305CP pnl;
	
	public P0305()
	{
		super("P0305");
		initGUI();
	}	

	public static void main(String[] args)
	{
		P0305 frmain = new P0305();
		frmain.setVisible(true);
	}
	
	private void initGUI()
	{
		setSize(500, 400);
		pnl = new P0305CP();
		JButton button1 = new JButton("Change Color");
		getContentPane().add(pnl, BorderLayout.CENTER);
		getContentPane().add(BorderLayout.SOUTH, button1);
		button1.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		pnl.changeColor();
		
	}
}
