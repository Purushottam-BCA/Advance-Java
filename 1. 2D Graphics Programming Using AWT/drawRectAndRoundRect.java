import java.awt.*;
import java.awt.event.*;

class drawRectAndRoundRect extends Frame
{
	drawRectAndRoundRect() // constructor
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
		// drawing a normal rectangle :: X,Y,Width,Height
		g.drawRect(100,100,400,200);
		
		// drawing a Rounded rectangle :: X,Y,Width,Height,X-radius,Y-radius 
		g.drawRoundRect(120,120,360,160,100,100);
	}
	
	public static void main(String args[])
	{
		drawRectAndRoundRect f = new drawRectAndRoundRect();
	}
}
