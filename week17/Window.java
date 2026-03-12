package week17;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class Window extends JFrame
{
    public Window()
    {
        setTitle("CS4001NI Programming");
        setSize(400,500);//width, height
        
        JPanel panel = new JPanel(); //panel is a container that contains button, textfield abd label
        panel.setBorder(BorderFactory.createTitledBorder("User Info"));
        //panel.setBackground(Color.CYAN);
        
        JLabel label = new JLabel("Username: "); 
        label.setBounds(50, 50, 100, 30);
        
        JButton btn = new JButton("Submit");
        btn.setBounds(50,90,100,30);
        btn.setBackground(new Color(255,200,0));
        
        JTextField textField = new JTextField();
        textField.setBounds(155, 50, 100, 30);
        
        panel.add(btn);
        panel.add(textField);
        panel.setLayout(null);
        panel.add(label);
        
        add(panel); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate code after clicking X(CLOSE)
        setLocationRelativeTo(null); //center the window in the screen
    }
    public static void main(String[]args)
    {
        Window wd = new Window();
        wd.setVisible(true);//to make the interface visible true...
        
    }
}