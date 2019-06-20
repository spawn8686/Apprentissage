package p0200;

import javax.swing.JFrame;

public class P0210 extends JFrame
{	
	private P0210CP pnlPrincipal = new P0210CP();
	
	public P0210()
	{
		super("P0210");
		initGUI();		
	}

	public static void main(String[] args)
	{
		P0210 newFrame = new P0210();
		//newFrame.setVisible(true);		
	}	
	
	private void initGUI()
	{			
		setVisible(true);
		setSize(400, 400);	
		getContentPane().add(pnlPrincipal);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}

}
