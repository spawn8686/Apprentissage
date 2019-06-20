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

public class P0520 extends JFrame 
{
	private Mandel6 pnlFractal;
	private JButton btnZoomIn, btnZoomOut;
	private JTextField jtfA = new JTextField(20);
	private JTextField jtfB = new JTextField(20);
	private JTextField jtfZoom = new JTextField(200);
	private JPanel pnlControle;
	
	public P0520() 
	{
		super("P0512");
		initGUI();
	}
	public static void main(String[] args) 
	{
		P0520 f = new P0520();
		f.setVisible(true);
	}
	
	private void initGUI() 
	{		
		// Création des objets
		pnlControle = new JPanel();
		HueRenderer hr = new HueRenderer();
		pnlFractal = new Mandel6(0.001643721971153, 0.822467633298876, 4, true, hr);
		btnZoomIn = new JButton("Zoom IN");
		btnZoomOut = new JButton("Zoom OUT");
				
		// Mise en forme
		getContentPane().add(pnlFractal);
		getContentPane().add(pnlControle, BorderLayout.SOUTH);
		pnlControle.add(btnZoomIn);
		pnlControle.add(btnZoomOut);
		btnZoomIn.addActionListener(new ZoomIn());
		btnZoomOut.addActionListener(new ZoomOut());
		hr.setSens(true);
		setSize(500, 400);		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class ZoomIn implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event)
		{
			pnlFractal.zoomIn();
		}
		
	}
	
	private class ZoomOut implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event)
		{
			pnlFractal.zoomOut();
		}
		
	}
	
	private class ChangeBGColor implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event) 
		{
			System.out.println("clic");
			Color background = JColorChooser.showDialog(P0520.this, "Choisir une couleur de fond", pnlFractal.getBackground());
			if(background != null)
			{
				pnlFractal.setBackground(background);
			}
		}
		
	}
}
