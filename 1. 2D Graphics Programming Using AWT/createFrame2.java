// 2nd Method to create a Frame.

import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;

class createFrame2 extends Frame
{
	createFrame2() // constructor
	{
		setVisible(true);
		setSize(500,300);
		setLocation(500,250);
		setBackground(Color.yellow);
		addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0); }} );
	}
	
	public static void main(String args[])
	{
		createFrame2 f = new createFrame2();
	}
}
