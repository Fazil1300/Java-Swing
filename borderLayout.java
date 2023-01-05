/*Layout Manager -> Defines the natural layout for components within a container
  3 Common Managers
    BorderLayout -> A BorderLayout place components in five areas
                        (i.e)North,East,South,West,Center
                    All extra spaces is placed in the center area
 */
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class borderLayout{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("BorderLayout");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.GREEN);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.MAGENTA);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
    }
}
//From this I learnt how to learn add panel(s) to frame ny five area by using new BorderLayout() manager
//We can also add sub panels to one of the panel(s) by setting new BorderLayout() to the panel that we want to add.