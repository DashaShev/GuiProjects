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
	    g.drawLine (-33,0,500,500);
	    g.drawLine (0,500,533,0);
	  }
	
	
	public Main(){
	   
	    setBounds(100, 100, 200, 200);  
	                                    
	                                   
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	                                                    
	                                                    
	  }

	  public static void main(String[] args) { 
	    Main app = new Main(); 
	    app.setBounds(0, 0, 500, 500);
	    app.setVisible(true); 
	  }

	
}
