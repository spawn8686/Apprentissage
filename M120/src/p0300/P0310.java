package p0300;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class P0310 extends JFrame implements ActionListener
{
	private JLabel lbl;
	private JButton btnN;
	private JButton btnS;
	private JButton btnE;
	private JButton btnW;
	
	public P0310()
	{
		super("P0310");
		initGUI();
	}	

	public static void main(String[] args)
	{
		P0310 frmain = new P0310();
		frmain.setVisible(true);
	}
	
	private void initGUI()
	{
		setSize(500, 400);
		lbl = new JLabel("0");
		btnN = new JButton("0");
		btnS = new JButton("0");
		btnE = new JButton("0");
		btnW = new JButton("0");
		getContentPane().add(lbl, BorderLayout.CENTER);
		getContentPane().add(BorderLayout.NORTH, btnN);
		getContentPane().add(BorderLayout.SOUTH, btnS);
		getContentPane().add(BorderLayout.EAST, btnE);
		getContentPane().add(BorderLayout.WEST, btnW);
		btnN.addActionListener(this);
		btnS.addActionListener(this);
		btnE.addActionListener(this);
		btnW.addActionListener(this);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton btnTemp = (JButton) e.getSource();
		Integer nbr = Integer.parseInt(btnTemp.getText());
		nbr++;
		btnTemp.setText(nbr.toString());
		
		nbr = Integer.parseInt(lbl.getText());
		nbr++;
		lbl.setText(nbr.toString());
	}
}
