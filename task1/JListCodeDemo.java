package task1;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPanel;
import javax.swing.AbstractListModel;



public class JListCodeDemo {

    public static void main(String args[]){
        JFrame listFrame = new JFrame();
        JPanel contentPane = (JPanel) listFrame.getContentPane();
        JList list = new JList<String>(new AbstractListModel<String>() {

            String[] companies = {"Stock trading", "Futures trading", "Options trading"};
            @Override
            public int getSize() {
                return companies.length;
            }

            @Override
            public String getElementAt(int index) {
                return companies[index];
            }
        });
        contentPane.add(list);
        listFrame.pack();
        listFrame.setVisible(true);
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
