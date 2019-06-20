package p0300;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

public class P0320 extends JFrame implements ActionListener
{
	private JPanel pnlColor = new JPanel();
	private JButton btnRed, btnGreen, btnBlue;
	private int red, green, blue;
	
	public P0320()
	{
		super("P0320");
		initGUI();
	}	

	public static void main(String[] args)
	{
		P0320 frmain = new P0320();
		frmain.setVisible(true);
	}
	
	private void initGUI()
	{
		setSize(600, 400);
		btnRed = new JButton("0");
		btnGreen = new JButton("0");
		btnBlue = new JButton("0");

		getContentPane().add(pnlColor, BorderLayout.CENTER);
		getContentPane().add(BorderLayout.WEST, btnRed);
		getContentPane().add(BorderLayout.SOUTH, btnGreen);
		getContentPane().add(BorderLayout.EAST, btnBlue);
				
		btnRed.addActionListener(this);
		btnGreen.addActionListener(this);
		btnBlue.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton btnTmp = (JButton) e.getSource();
		Integer nbr = Integer.parseInt(btnTmp.getText());
		nbr = (nbr +5) % 260;
		btnTmp.setText(nbr.toString());
		
		red = Integer.parseInt(btnRed.getText());
		green = Integer.parseInt(btnGreen.getText());
		blue = Integer.parseInt(btnBlue.getText());
		
		Color c = new Color(red,green,blue);
		pnlColor.setBackground(c);
	}
}
