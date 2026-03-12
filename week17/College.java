package week17;
import javax.swing.*;
import java.awt.*;


public class College extends JFrame
{
    public College()
    {
     setTitle("College event management");
     setSize(500,500);
     
     JPanel panel = new JPanel();
     panel.setBackground(Color.BLUE);
     panel.setBounds(20,30,400,400);
     
     JLabel label = new JLabel("Welcome to orientation Day");
     label.setBounds(50,50,100,30);
     
     panel.add(label);
     add(panel);
     
     setLayout(null);
     setResizable(false);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
    }
    
    public static void main (String[]args)
    {
        College obj = new College();
        obj.setVisible(true);
        
    }
}