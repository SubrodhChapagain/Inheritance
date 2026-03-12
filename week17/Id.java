package week17;
import javax.swing.*;
import java.awt.*;


public class Id extends JFrame
{
    public Id()
    {
     setSize(500,500);
     setTitle("ID card viewer");
     JPanel panel= new JPanel();
     panel.setBounds(20,30,400,400);
       
     String htmlText = "<html><body><div><p>Name: Subrodh chapagain </p><p> Module: Programming </p><p> college: Islington</p><</div></body></html>";

     JLabel name = new JLabel(htmlText, SwingConstants.CENTER);
     name.setBounds(50,50,300,300);
     panel.add(name);
     name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
     
     //name.setVerticalAlignment(_alignment_);
     panel.setLayout(null);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
     add(panel);
    }
    
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            Id obj = new Id();
            obj.setVisible(true);
        });
    }
}
