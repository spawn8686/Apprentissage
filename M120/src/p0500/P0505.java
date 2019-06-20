package p0500;

import javax.swing.JFrame;

public class P0505 extends JFrame 
{
	public P0505() 
	{
		super("P0505");
		initGUI();
	}
	public static void main(String[] args) 
	{
		P0505 f = new P0505();
		f.setVisible(true);
	}
	
	private void initGUI() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		HueRenderer hr = new HueRenderer();
		hr.setSens(true);
		Mandel6 pnlFractal = new Mandel6(hr);
		getContentPane().add(pnlFractal);
		
		setSize(500, 400);
	}

}
