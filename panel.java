import java.awt.Color;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class panel {
    public static void main(String[] args) {
        //Jpanel-a GUI component that functions as a container to hold other components
        ImageIcon image=new ImageIcon("thumbsUp.png");
        JLabel label=new JLabel();
        label.setText("Hi");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIcon(image);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(50,100,150, 150);


        JPanel redPanel=new JPanel();//creates panel
        redPanel.setBounds(0, 0, 250, 250);//set x,y,width,height of panel
        redPanel.setBackground(Color.red);//sets background color for panel
        //redPanel.setLayout(null);
        redPanel.setLayout(new BorderLayout());
        redPanel.add(label);

        JPanel bluePanel=new JPanel();
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setBackground(Color.blue);
        /*bluePanel.setLayout(null);
        bluePanel.setLayout(new BorderLayout());
        bluePanel.add(label);*/

        JPanel greenPanel=new JPanel();
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setBackground(Color.GREEN);
        /*greenPanel.setLayout(null);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(label);*/

        JFrame frame=new JFrame();
        frame.setTitle("Panel");
        frame.setVisible(true);
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
}
}
/*From this I learned what is JPanel? and how to implment that?
then add the component(label) to the  panel.
and learnt how to set layout in panel wherever I want
STEPS TO MOVE LABEL IN A CONTAINNER
    1)set layout -> null then move the label within the panel by setHorizontalTextPosition,setVerticalAlignment
    2)make panel layout -> new BorderLayout() then set the bounds of the label,this will help to move the label wherever you want :)
 */
