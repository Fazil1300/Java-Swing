import javax.swing.ImageIcon;
import javax.swing.JFrame;

class frame{
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("computer.png");//create icon

        JFrame frame=new JFrame();//creates frame
        frame.setVisible(true);//set frame visible
        frame.setSize(500,500);//sets frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set default close operation
        frame.setTitle("First Frame");//set title for frame
        frame.setResizable(false);//prevent frame being resizeable
        frame.setIconImage(icon.getImage());//set icon for frame
    }
}