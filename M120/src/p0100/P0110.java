package p0100;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class P0110 extends JFrame implements ActionListener
{
	private JButton btnPrincipal;
	
	public P0110()
	{
		super("P0110");
		initGUI();
	}
	
	private void initGUI()
	{		
		setSize(500, 300);
		btnPrincipal = new JButton("Click");
		btnPrincipal.addActionListener(this);
		getContentPane().add(btnPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args)
	{
		P0110 test = new P0110();
		test.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if (btnPrincipal.getText()=="Click")
		{
			btnPrincipal.setText("click click");
		}
		else 
		{
			btnPrincipal.setText("Click");
		}		
	}
	
	

}
