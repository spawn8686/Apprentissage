package p0400;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import p0200.P0215CP;

import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class P0465Bis extends JFrame
{
	private JPanel pnlEpines;
	private JPanel pnlTronc;
	private JPanel pnlDessin;
	private void initGUI() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Création des objets
		pnlDessin = new JPanel();
		JPanel pnlControl = new JPanel();		
		pnlEpines = new JPanel();
		pnlTronc = new JPanel();
		JLabel lblCouleur = new JLabel("Couleurs");
		JLabel lblEpines = new JLabel("Epines");
		JLabel lblTronc = new JLabel("Tronc");
		
		// Création des groupes
		
		pnlControl.add(lblCouleur);
		pnlControl.add(Box.createVerticalStrut(10));
		pnlControl.add(lblEpines);
		pnlControl.add(pnlEpines);
		pnlControl.add(Box.createVerticalStrut(10));
		pnlControl.add(lblTronc);
		pnlControl.add(pnlTronc);
		pnlControl.add(Box.createVerticalStrut(10));
		pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.Y_AXIS));

		// mise en forme
		getContentPane().add(pnlDessin);
		getContentPane().add(pnlControl, BorderLayout.WEST);
		pnlControl.setBackground(Color.WHITE);
		
		pnlEpines.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlEpines.setBackground(new Color(0, 120, 0));
		
		pnlTronc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlTronc.setBackground(new Color(80, 80, 0));

		pnlDessin.setLayout(null);
		
		
		setSize(550, 400);
		
		// ajout d'action
		pnlEpines.addMouseListener(new SetBackGroundColor());
		pnlTronc.addMouseListener(new SetBackGroundColor());
		pnlDessin.addMouseListener(new DrawPineTree());
	}

	public P0465Bis() 
	{
		super("P0465Bis");
		initGUI();
	}

	public static void main(String[] args) 
	{
		P0465Bis frame = new P0465Bis();
		frame.setVisible(true);
	}
	
	/**
	 * Calcule les dimensions et positions du panel en fonction des coordonnées du clic
	 * @param x coordonnée en x du clic
	 * @param y coordonnée en y du clic
	 * @param ref hauteur totale du conteneur
	 * @return
	 */
	private Rectangle getBounds(int x, int y, int ref) 
	{
		final int h1 = 35;
		final int h2 = 150;
		final int delta = h2 - h1;
		final int h = h1 + delta * y / ref;
		final int w = h * 4 / 5;
		Rectangle r = new Rectangle(x - w / 2, y - h / 2, w, h);
		return r;
	}
	
	class SetBackGroundColor extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			super.mouseClicked(e);
			
			JPanel pnlTmp = (JPanel) e.getSource();
			Color color = JColorChooser.showDialog(P0465Bis.this, "Choisir une couleur", pnlTmp.getBackground());
			if(color != null)
			{
				pnlTmp.setBackground(color);
			}
		}
	}
	
	class DrawPineTree extends MouseAdapter
	{

		@Override
		public void mouseClicked(MouseEvent e)
		{
			//Crée un sapin
			P0215CP pnlSapin = new P0215CP(pnlEpines.getBackground(),pnlTronc.getBackground());
			pnlSapin.setBounds(getBounds(e.getX(), e.getY(), pnlDessin.getHeight()));
			pnlDessin.add(pnlSapin);
			pnlSapin.setOpaque(false);
			pnlDessin.repaint();			
		}
	}
}
