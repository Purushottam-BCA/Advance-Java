import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

class drawLineChangeText extends Frame
{
	drawLineChangeText() // constructor
	{
		setVisible(true);
		setSize(600,400);
		setLocation(400,250);
		setBackground(Color.blue);  // Change Background Color
		setForeground(Color.red);  // Change Text Color
		
		Font f1 = new Font("Chiller",Font.BOLD,50); // Defining Font Properties
		setFont(f1);	// Applying it on current Object.
				
		addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0); }} );
	}
	
	public void paint(Graphics g)  
	{
	// Displaying Text on Screen. 
		g.drawString("Hello World",200,300);  // drawString("MSG", X-Coordinate, Y-Coordinate)
		
	// Drawing A Line  :: x1,y1,x2,y2
		g.drawLine(150,100,500,100);
		g.drawLine(150,100,500,200);
	}
	
	public static void main(String args[])
	{
		drawLineChangeText f = new drawLineChangeText();
	}
}
