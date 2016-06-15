package task1;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;



public class JListTempConv {

    public static void main(String args[]){
        JFrame listFrame = new JFrame();
        JPanel contentPane = (JPanel) listFrame.getContentPane();

        JList list = new JList<String>(new AbstractListModel<String>() {
            Integer min_c_degree = -70;
            Integer max_c_degree = +60;
            @Override
            public int getSize() {
                return max_c_degree - min_c_degree;
            }

            @Override
            public String getElementAt(int index) {
                Integer c_degree = index-70;
                float f_degree = c_degree * 1.8f + 32.0f;
                return String.format("%d degree C = %.1f degree F", c_degree, f_degree);
            }
        });
        // contentPane.add(list);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().setView(list);
        contentPane.add(scrollPane);
        listFrame.pack();
        listFrame.setVisible(true);
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
