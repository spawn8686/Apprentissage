package p0100;

import javax.swing.JFrame;
import javax.swing.JButton;

public class P0105 extends JFrame
{
	private JButton btnPrincipal;
	
	public P0105()
	{
		super();
		initGUI();
	}
	
	private void initGUI()
	{		
		setSize(500, 300);
		btnPrincipal = new JButton("Click");
		getContentPane().add(btnPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

	public static void main(String[] args)
	{
		P0105 test = new P0105();
		test.setVisible(true);
	}
	
	

}
