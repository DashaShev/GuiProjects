



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;

    public class Main extends JFrame {

     private DefaultListModel philosophers;
     private JList list;
     private JTextField inputField;

     public Main()
         {
         super( "Favorite Philosophers" );

         // create a DefaultListModel to store philosophers
         philosophers = new DefaultListModel();
         
         

         // create a JList for philosophers DefaultListModel
         list = new JList( philosophers );
         
         inputField = new JTextField();
         inputField.addKeyListener(
                 new KeyListener(){

                     public void keyPressed(KeyEvent e){

                         if(e.getKeyChar() == KeyEvent.VK_ENTER){

                         	final String name=inputField.getText();
                             
                             philosophers.addElement( name );
                             
                         }       
                     }

         			@Override
         			public void keyReleased(KeyEvent arg0) {
         				// TODO Auto-generated method stub
         				
         			}

         			@Override
         			public void keyTyped(KeyEvent e) {
         				// TODO Auto-generated method stub
         				
         			}
                 }
             );


         
         list.setSelectionMode(
         ListSelectionModel.SINGLE_SELECTION );
                

         // lay out GUI components
         JPanel inputPanel = new JPanel();
         
         inputPanel.setLayout(new BoxLayout(inputPanel,BoxLayout.Y_AXIS));

         inputField.setLayout(new FlowLayout());
         inputField.setBounds(5, 5, 100, 100);
         inputField.setPreferredSize(new Dimension(120,20));
         JScrollPane scrollPane=new JScrollPane(list);
         scrollPane.setPreferredSize(new Dimension(200,200));

         Container container = getContentPane();
         add(scrollPane);
         container.add( inputPanel);
         add( inputField);
         container.setLayout(new FlowLayout());

         setDefaultCloseOperation( EXIT_ON_CLOSE );
         setSize( 500, 250 );
         setVisible( true );

     } // end PhilosophersJList constructor

     // execute application
       public static void main( String args[] )
             {
             new Main();
         }
    }
