import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class frame{
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("computer.png");//create icon

        //JFrame-a GUI window to add components
        JFrame frame=new JFrame();//creates frame
        frame.setVisible(true);//set frame visible
        frame.setSize(500,500);//sets frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set default close operation
        frame.setTitle("First Frame");//set title for frame
        frame.setResizable(false);//prevent frame being resizeable
        frame.setIconImage(icon.getImage());//set icon for frame
        frame.getContentPane().setBackground(new Color(124,50,250));//change background color of frame
    }
}
/*From this I learnt What is JFrame? and How to Implement?
 I created a basic window and set some properties like visible,size,DefaultCloseOperation,Title,Resizeability,Icon and finally set background color for the frame 
 */