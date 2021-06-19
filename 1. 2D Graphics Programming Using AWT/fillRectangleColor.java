// Filling Colour in Rectangle
import java.awt.*;
import java.awt.event.*;

class fillRectangleColor extends Frame
{
	fillRectangleColor() // constructor
	{
		setVisible(true);
		setSize(600,400);
		setLocation(400,250);
		setBackground(Color.blue);  // Change Background Color
		setForeground(Color.yellow);  // Change Text Color
		
		Font f1 = new Font("Chiller",Font.BOLD,50); // Defining Font Properties
		setFont(f1);	// Applying it on current Object.
				
		addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ System.exit(0); }} );
	}
	
	public void paint(Graphics g)  
	{
		g.fillRect(50,50,250,220);		
		g.setColor(Color.red);	
		g.fillRect(70,70,210,180);	
		g.setColor(Color.green);	
		g.fillRect(90,90,170,140);	
		
//		g.setColor(Color.white);	
		g.fillRect(320,50,150,100);	
//		g.setColor(Color.white);		
		g.fillRect(320,170,150,100);	
	}
	
	public static void main(String args[])
	{
		fillRectangleColor f = new fillRectangleColor();
	}
}
