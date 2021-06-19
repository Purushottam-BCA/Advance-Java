// Writing Some text on Screen
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;


class helloWorld extends Frame
{
	helloWorld() // constructor
	{
		setVisible(true);
		setSize(500,300);
		setLocation(400,250);
		setBackground(Color.black);  // Change Background Color
		setForeground(Color.yellow);  // Change Text Color
		addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0); }} );
	}
	
	public void paint(Graphics g)  // Displaying Text on Screen. 
	{
		g.drawString("Hello World",200,200);  // drawString("MSG", X-Coordinate, Y-Coordinate)
	}
	
	public static void main(String args[])
	{
		helloWorld f = new helloWorld();
	}
}
