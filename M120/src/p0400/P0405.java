package p0400;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class P0405 extends JFrame implements ActionListener
{
	private P0405CP pnlShape;
	private JCheckBox cbxFilled;
	private JCheckBox cbxSymetric;
	private JCheckBox cbxRounded;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		P0405 f = new P0405();
		f.setVisible(true);
	}
	
	public P0405() 
	{
		super("P0405");
		initGUI();
	}

	private void initGUI() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnlShape = new P0405CP();

		cbxFilled = new JCheckBox("filled");
		cbxSymetric = new JCheckBox("symetric");
		cbxRounded = new JCheckBox("rounded");
		
		JPanel pnlCheckboxes = new JPanel();
		pnlCheckboxes.add(cbxFilled);
		pnlCheckboxes.add(cbxSymetric);
		pnlCheckboxes.add(cbxRounded);
		
		cbxFilled.addActionListener(this);
		cbxSymetric.addActionListener(this);
		cbxRounded.addActionListener(this);
		
		getContentPane().add(pnlCheckboxes, BorderLayout.SOUTH);
		getContentPane().add(pnlShape);
		
		setSize(600, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		pnlShape.changeShape(cbxFilled.isSelected(), cbxSymetric.isSelected(), cbxRounded.isSelected());
	}

}