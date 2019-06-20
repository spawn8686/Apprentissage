package p0500;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class P0515 extends JFrame 
{
	private Mandel6 pnlFractal;
	private JButton btnView;
	private JTextField jtfA, jtfB, jtfZoom;
	private JPanel pnlControle;
	
	public P0515() 
	{
		super("P0512");
		initGUI();
	}
	public static void main(String[] args) 
	{
		P0515 f = new P0515();
		f.setVisible(true);
	}
	
	private void initGUI() 
	{		
		// Création des objets
		pnlControle = new JPanel();
		jtfA = new JTextField(6);
		jtfB = new JTextField(6);
		jtfZoom = new JTextField(10);
		HueRenderer hr = new HueRenderer();
		pnlFractal = new Mandel6(hr);
		btnView = new JButton("Changer la vue");
		
		// Mise en forme
		getContentPane().add(pnlFractal);
		getContentPane().add(pnlControle, BorderLayout.SOUTH);
		btnView.addActionListener(new ChangeView());
		pnlControle.add(jtfA);
		pnlControle.add(jtfB);
		pnlControle.add(jtfZoom);
		pnlControle.add(btnView);
		hr.setSens(true);				
		setSize(500, 400);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class ChangeView implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event)
		{
			double a, b, range;
			a = Double.parseDouble(jtfA.getText());
			b = Double.parseDouble(jtfB.getText());
			range = Double.parseDouble(jtfZoom.getText());
			pnlFractal.changeView(a, b, range);
			getContentPane().repaint();
		}
		
	}
	
	private class ChangeBGColor implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) 
		{
			System.out.println("clic");
			Color background = JColorChooser.showDialog(P0515.this, "Choisir une couleur de fond", pnlFractal.getBackground());
			if(background != null)
			{
				pnlFractal.setBackground(background);
			}
		}
		
	}
}
