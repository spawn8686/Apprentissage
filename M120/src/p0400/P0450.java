package p0400;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import p0200.P0215CP;

import java.awt.Color;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class P0450 extends JFrame implements ActionListener, MouseListener {
	private JButton btnEpines;
	private JPanel pnlDrawing;
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnlControl = new JPanel();
		pnlControl.setBackground(Color.WHITE);
		getContentPane().add(pnlControl, BorderLayout.WEST);
		pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.Y_AXIS));

		JLabel lblEpines = new JLabel("Epines");
		pnlControl.add(lblEpines);

		btnEpines = new JButton("Epines");
		btnEpines.setBackground(new Color(0, 120, 0));
		btnEpines.addActionListener(this);
		pnlControl.add(btnEpines);
		
		pnlDrawing = new JPanel();
		pnlDrawing.setLayout(null);
		pnlDrawing.addMouseListener(this);
		getContentPane().add(pnlDrawing);
		
		setSize(550, 400);
	}

	public P0450() {
		super("P0450");
		initGUI();
	}

	public static void main(String[] args) {
		P0450 frame = new P0450();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnTmp = (JButton) e.getSource();
		Color color = JColorChooser.showDialog(this, "Choisir la couleur des épines", btnTmp.getBackground());
		if(color != null){
			btnTmp.setBackground(color);
		}
	}

	/**
	 * Calcule les dimensions et positions du panel en fonction des coordonnées du clic
	 * @param x coordonnée en x du clic
	 * @param y coordonnée en y du clic
	 * @param ref hauteur totale du conteneur
	 * @return
	 */
	private Rectangle getBounds(int x, int y, int ref) {
		final int h1 = 35;
		final int h2 = 150;
		final int delta = h2 - h1;
		final int h = h1 + delta * y / ref;
		final int w = h * 4 / 5;
		Rectangle r = new Rectangle(x - w / 2, y - h / 2, w, h);
		return r;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Crée un sapin
		P0215CP pnlSapin = new P0215CP(btnEpines.getBackground());
		pnlSapin.setBounds(getBounds(e.getX(), e.getY(), pnlDrawing.getHeight()));
		pnlDrawing.add(pnlSapin);
		pnlSapin.setOpaque(false);
		pnlDrawing.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
