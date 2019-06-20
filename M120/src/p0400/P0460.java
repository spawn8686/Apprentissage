package p0400;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class P0460 extends JFrame implements ActionListener, MouseListener 
{
	JButton btnEpines;
	JButton btnTronc;
	private JPanel pnlDessin;
	private void initGUI() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Cr�ation des objets
		pnlDessin = new JPanel();
		JPanel pnlControl = new JPanel();
		JLabel lblCouleur = new JLabel("Couleurs");
		btnEpines = new JButton("Epines");
		btnTronc = new JButton("Tronc");
		
		// Cr�ation des groupes
		getContentPane().add(pnlDessin);
		getContentPane().add(pnlControl, BorderLayout.WEST);
		pnlControl.add(lblCouleur);
		pnlControl.add(Box.createVerticalStrut(10));
		pnlControl.add(btnEpines);
		pnlControl.add(Box.createVerticalStrut(10));
		pnlControl.add(btnTronc);
		pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.Y_AXIS));

		// mise en forme
		pnlControl.setBackground(Color.WHITE);
		
		btnEpines.setBackground(new Color(0, 120, 0));
		btnEpines.addActionListener(this);
		btnTronc.setBackground(new Color(80, 80, 0));
		btnTronc.addActionListener(this);

		pnlDessin.setLayout(null);
		pnlDessin.addMouseListener(this);
		
		
		setSize(550, 400);
	}

	public P0460() 
	{
		super("P0450");
		initGUI();
	}

	public static void main(String[] args) 
	{
		P0460 frame = new P0460();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton btnTmp = (JButton) e.getSource();
		Color color = JColorChooser.showDialog(this, "Choisir une couleur", btnTmp.getBackground());
		if(color != null)
		{
			btnTmp.setBackground(color);
		}
	}

	/**
	 * Calcule les dimensions et positions du panel en fonction des coordonn�es du clic
	 * @param x coordonn�e en x du clic
	 * @param y coordonn�e en y du clic
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

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		//Cr�e un sapin
		P0215CP pnlSapin = new P0215CP(btnEpines.getBackground(),btnTronc.getBackground());
		pnlSapin.setBounds(getBounds(e.getX(), e.getY(), pnlDessin.getHeight()));
		pnlDessin.add(pnlSapin);
		pnlSapin.setOpaque(false);
		pnlDessin.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}
}
