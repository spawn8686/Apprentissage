package p0200;

import javax.swing.JFrame;

public class P0215 extends JFrame
{
	private P0215CP pnl = new P0215CP();
	
	public P0215()
	{
		super("P0215");
		initGui();
	}
	
	public static void main(String[] args)
	{
		P0215 frm = new P0215();		
	}
	
	private void initGui()
	{
		setVisible(true);
		setSize(400, 300);
		getContentPane().add(pnl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
