package p0500;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class P0512 extends JFrame 
{
	private Mandel6 pnlFractal;
	private JButton btnColor;
	
	public P0512() 
	{
		super("P0512");
		initGUI();
	}
	public static void main(String[] args) 
	{
		P0512 f = new P0512();
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
		btnColor = new JButton("Fond");
		getContentPane().add(btnColor, BorderLayout.SOUTH);
		btnColor.addActionListener(new ChangeBGColor());
		
		setSize(500, 400);
	}

	private class ChangeBGColor implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) 
		{
			System.out.println("clic");
			Color background = JColorChooser.showDialog(P0512.this, "Choisir une couleur de fond", pnlFractal.getBackground());
			if(background != null)
			{
				pnlFractal.setBackground(background);
			}
		}
		
	}
}
