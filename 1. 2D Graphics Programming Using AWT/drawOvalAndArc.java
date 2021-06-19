// Drawing Oval & Arc
import java.awt.*;
import java.awt.event.*;

class drawOvalAndArc extends Frame
{
	drawOvalAndArc() // constructor
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
		//-- drawing an ellipse :: X,Y,Width,Height
		// g.drawOval(100,100,400,200);
		
		//-- drawing egg shaped oval
		// g.drawOval(100,100,200,300);
		
		// drawing an Arc :: X,Y,Width,Height,Starting-Angle, Moving-Angle 
		 g.drawArc(50,50,200,200,180,180);
		 
		// SAD FACE
		 g.drawArc(300,50,200,200,0,-180); // Negative angle for ClockWise
		
		
	}
	
	public static void main(String args[])
	{
		drawOvalAndArc f = new drawOvalAndArc();
	}
}
