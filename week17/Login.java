package week17;
import javax.swing.*;
import java.awt.*;


public class Login extends JFrame
{
    public Login()
    {
        setTitle("Login");
        setSize(500,500);
        
        
        JPanel panel=  new JPanel();
        panel.setBounds(20,30,400,400);
        
        JLabel username = new JLabel("Username");
        username.setBounds(50,50,100,30);
        
        JTextField txt = new JTextField();
        txt.setBounds(150,50,100,30);
        
        JButton btn = new JButton("Login");
        btn.setBounds(150,150,100,30);
        btn.setBackground(Color.red);
        
        panel.add(btn);
        panel.add(txt);
        panel.setLayout(null);
        panel.add(username);
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panel);
    }
    
    public static void main (String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            Login obj = new Login();
            obj.setVisible(true);
        });

    }
}