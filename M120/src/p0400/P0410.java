package p0400;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

public class P0410 extends JFrame implements ActionListener
{
	private P0410CP pnlShape;
	private JCheckBox cbxFilled, cbxSymetric, cbxRounded;
	private JRadioButton jrbColored, jrbBlackWhite;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		P0410 frm = new P0410();
		frm.setVisible(true);		
	}
	
	public P0410() 
	{
		super("P0410");
		initGUI();
	}

	private void initGUI() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnlShape = new P0410CP();
		pnlShape.setBackground(Color.DARK_GRAY);

		cbxFilled = new JCheckBox("filled");
		cbxSymetric = new JCheckBox("symetric");
		cbxRounded = new JCheckBox("rounded");
		
		jrbColored = new JRadioButton("en couleur");
		jrbColored.setSelected(true);
		jrbBlackWhite = new JRadioButton("en noir et blanc");
		
		ButtonGroup btg1 = new ButtonGroup();
		btg1.add(jrbColored);
		btg1.add(jrbBlackWhite);
		
		JPanel pnlCbx1 = new JPanel();
		JPanel pnlCbx2 = new JPanel();
		JPanel pnlCbx3 = new JPanel();
		
		pnlCbx1.add(cbxFilled);
		pnlCbx1.add(cbxSymetric);
		pnlCbx1.add(cbxRounded);
		
		pnlCbx2.add(jrbColored);
		pnlCbx2.add(jrbBlackWhite);
		
		BoxLayout bxl = new BoxLayout(pnlCbx3, BoxLayout.Y_AXIS);
		pnlCbx3.setLayout(bxl);
		
		pnlCbx3.add(pnlCbx1);
		pnlCbx3.add(pnlCbx2);		
		
		getContentPane().add(pnlCbx3, BorderLayout.SOUTH);
		getContentPane().add(pnlShape);
		
		setSize(600, 400);
		
		cbxFilled.addActionListener(this);
		cbxSymetric.addActionListener(this);
		cbxRounded.addActionListener(this);
		jrbColored.addActionListener(this);
		jrbBlackWhite.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		pnlShape.changeShape(cbxFilled.isSelected(), cbxSymetric.isSelected(), 
							cbxRounded.isSelected(), jrbColored.isSelected(), 
							jrbBlackWhite.isSelected());
	}

}