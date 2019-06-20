package p0100;
import javax.swing.*;

public class P0100
{		
	public static void main(String[] args)
	{
		JFrame frm = new JFrame("Ma première fenêtre");
		JButton btn1 = new JButton("Click");
		
		frm.getContentPane().add(btn1);
		
		frm.setSize(500, 300);
		frm.setVisible(true);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
