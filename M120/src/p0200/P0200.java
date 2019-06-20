package p0200;

import javax.swing.JFrame;

public class P0200 extends JFrame
{	
	private P0200CP pnlPrincipal = new P0200CP();
	
	public P0200()
	{
		super("P0200");
		initGUI();
	}
	
	private void initGUI()
	{
		setSize(400, 300);	
		getContentPane().add(pnlPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		P0200 newFrame = new P0200();
		newFrame.setVisible(true);		
	}

}
