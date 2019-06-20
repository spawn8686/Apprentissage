package p0300;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;

public class P0315 extends JFrame implements ActionListener
{
	private P0315CP pnlN, pnlE, pnlW, pnlC;
	private JButton btn;
	
	public P0315()
	{
		super("P0315");
		initGUI();
	}	

	public static void main(String[] args)
	{
		P0315 frmain = new P0315();
		frmain.setVisible(true);
	}
	
	private void initGUI()
	{
		setSize(500, 400);
		pnlN = new P0315CP();
		pnlE = new P0315CP();
		pnlW = new P0315CP();
		pnlC = new P0315CP();
		btn = new JButton("Change Color");

		getContentPane().add(pnlC, BorderLayout.CENTER);
		getContentPane().add(pnlN, BorderLayout.NORTH);
		getContentPane().add(pnlE, BorderLayout.EAST);
		getContentPane().add(pnlW, BorderLayout.WEST);		
		getContentPane().add(BorderLayout.SOUTH, btn);
				
		btn.addActionListener(this);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		pnlN.changeColor();
		pnlE.changeColor();
		pnlW.changeColor();
		pnlC.changeColor();
	}
}
