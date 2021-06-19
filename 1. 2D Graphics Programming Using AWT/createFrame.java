
// 1st method to create a Frame.
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*; 

class createFrame
{
	public static void main(String args[])
	{
		Frame f = new Frame();		  // Creating new object of Frame (Screen)
		f.setVisible(true);    		  // By default it is not visisble
		f.setSize(500,300);    		  // setSize(width, height) : By default frame size=0
		f.setLocation(200,100);		  // Setting location of Frame when it will be opened
		f.setBackground(Color.red);  // Changing Background Color
		
		// To Close The Window on EXit Button CLick we have to used event Listener.
		f.addWindowListener(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
}
