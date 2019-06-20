package p0500;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class P0510 extends JFrame 
{
	private Mandel6 pnlFractal;
	private JToggleButton btgSens;
	
	public P0510() 
	{
		super("P0505");
		initGUI();
	}
	public static void main(String[] args) 
	{
		P0510 f = new P0510();
		f.setVisible(true);
	}
	
	private void initGUI() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Fractal
		HueRenderer hr = new HueRenderer();
		hr.setSens(true);
		pnlFractal = new Mandel6(hr);
		getContentPane().add(pnlFractal);
		
		//Bouton
		btgSens = new JToggleButton("Inverser");
		getContentPane().add(btgSens, BorderLayout.SOUTH);
		btgSens.addActionListener(new ChangeSens());
		
		setSize(500, 400);
	}

	private class ChangeSens implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) 
		{
			System.out.println("clic");

			pnlFractal.getPointRenderer().setSens(! btgSens.isSelected() );
			pnlFractal.repaint();
		}
		
	}
}
