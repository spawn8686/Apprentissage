package p0200;

import javax.swing.JFrame;

public class P0205 extends JFrame
{	
	private P0205CP pnlPrincipal = new P0205CP();
	
	public P0205()
	{
		super("P0205");
		initGUI();
	}

	public static void main(String[] args)
	{
		P0205 newFrame = new P0205();
		newFrame.setVisible(true);		
	}
	
	private void initGUI()
	{
		setSize(400, 300);	
		getContentPane().add(pnlPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
