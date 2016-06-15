/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


import java.awt.*;

import javax.swing.*;


public class Main extends JFrame { 
	
	public void paint(Graphics g) {
	    g.setColor (Color.blue); 
        Dimension d = this.getContentPane().getSize();
        System.out.println("d is " + d);
        if (false) {
            int h = (int)d.getHeight();
            int w = (int)d.getWidth();
            int delta = 500 - h;
	        g.drawLine (0,delta,500,500);
	        g.drawLine (0,500,500,delta);
        }
        else {
            Rectangle r = this.getContentPane().getBounds();
            System.out.println("r is " + r);
            g.drawLine (r.x, r.y, r.width, r.height);
            g.drawLine (r.x, r.height, r.width, r.y);
        }
	  }
	
	public Main()
    {
	    setBounds(100, 100, 200, 200);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    setBackground(Color.cyan);
	}

	public static void main(String[] args) { 
	  Main app = new Main(); 
	  app.setBounds(0, 0, 500, 500);
	  app.setVisible(true); 
	}
}
