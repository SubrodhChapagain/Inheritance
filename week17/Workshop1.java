package week17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class Workshop1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop1 extends JFrame
{
    public Workshop1()
    {
     setTitle("Library Notice");
     setSize(400,300);
     
     JPanel panel = new JPanel();
     panel.setBackground(Color.CYAN);
     panel.setBounds(20,30,400,400);
     
     JLabel label = new JLabel("Library Opens at 7:00 AM");
     label.setBounds(50,50,100,30);
     
     panel.add(label);
     add(panel);
     
     setLayout(null);
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
    }
    
    public static void main (String[]args)
    {
        Workshop1 obj = new Workshop1();
        obj.setVisible(true);
        
    }
}