import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {
    public static void main(String[] args) {
        //JLabel-a GUI display area for String of text/an image/both
        ImageIcon lableIcon=new ImageIcon("dude.png");

        Border border=BorderFactory.createLineBorder(Color.green, 3, false);//creates border

        JLabel label=new JLabel();//creates label
        label.setText("How's day dude?");//set text for label
        label.setIcon(lableIcon);//set icon to label
        label.setHorizontalTextPosition(JLabel.CENTER);//set text for Left,Center,Right of image
        label.setVerticalTextPosition(JLabel.TOP);//set text for Top,Center,Bottom of image
        label.setForeground(Color.YELLOW);//Change font color
        label.setFont(new Font("MV BOli",Font.PLAIN,20));//Change font style,format,size
        label.setIconTextGap(0);//Sets gap between text and image
        label.setBackground(Color.black);//change background of label
        label.setOpaque(true);//make background color visible
        label.setBorder(border);//set border for layout
        label.setVerticalAlignment(JLabel.CENTER);//set vertical positon text+image within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal text+image within label
        label.setBounds(100, 100, 250, 250);//set label whereever you want within frame->make layoutManager to null 

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setTitle("Lable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(124,50,250));
        frame.setResizable(false);
        frame.setLayout(null);
        //frame.pack();
        
        frame.add(label);//adds label to frame
    }
}
/*From this I learnt What is JLabel? and How to implemnet ?
*I created a label with some properties
*By default label is borderLayout,It makes a label to full frame->for that frame layout to null
*frame.pack()->It will accomate a frame with the components we have for that avoid the frame.setSize->  
*/
