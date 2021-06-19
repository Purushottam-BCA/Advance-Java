// Drawing Polygon
import java.awt.*;
import java.awt.event.*;

class DrawPolygon extends Frame
{
	DrawPolygon() // constructor
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
		int []x = {200,300,250,150,100};	// X-Coordinates of all points
		int []y = {100,200,350,350,200};	// Y-Coordinates of all points
		int n = 5;	// Total Lines
		
		g.drawPolygon(x,y,n); // Drawing PentaGon
	}
	
	public static void main(String args[])
	{
		DrawPolygon f = new DrawPolygon();
	}
}
