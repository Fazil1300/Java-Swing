import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class myframe extends JFrame{
 
    myframe(){
        ImageIcon icon=new ImageIcon("Minecraft.png");

        Border border=BorderFactory.createLineBorder(Color.black, 3);

        JButton button=new JButton();
        button.setBounds(100,150,250,100);//set bounds for  button
        button.setText("I'm button");//set text for button
        button.setHorizontalTextPosition(JLabel.RIGHT);
        button.setVerticalTextPosition(JLabel.CENTER);
        button.setVerticalAlignment(JLabel.CENTER);
        button.setHorizontalAlignment(JLabel.LEFT);
        button.setIconTextGap(25);
        button.setFocusable(false);//removes border kinda thing from button text
        button.addActionListener(e -> System.out.println("Click"));//prints in console
        button.setIcon(icon);//add ImageIcon to button
        button.setBorder(border);//set border for button
        button.setBackground(Color.ORANGE);//change background color of button
        button.setForeground(Color.white);//set font color for button text
        button.setFont(new Font("MV BOli",Font.PLAIN,20));//set font for text of a button
        //button.setEnabled(false);//set button disable

        this.setSize(500,500);
        this.setTitle("Button");
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(124,50,250));

        this.add(button);
}
   
}
public class button {
    public static void main(String[] args) {
        new myframe();
    }
}
/*From this we learnt how to add button in a frame from different proposal
we can do whatever implemented in JLabel
we can alse get button clicked by implemeting ActionListener interface
*/