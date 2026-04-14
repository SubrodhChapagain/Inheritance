package week21;


import javax.swing.*;
import java.awt.*;

public class Form extends JFrame
{
    public Form()
    {
        setTitle("Layout Demo");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel titlePanel= new JPanel();
        JLabel titleLabel= new JLabel("Welcome to Admin Dashboard!");
        
        titlePanel.add(titleLabel);
        
        JPanel sidePanel= new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        String[] buttons= {"Add", "Edit", "Delete", "View"};
        
        sidePanel.add(Box.createVerticalGlue());
        
        for(String btn: buttons)
        {
            JButton button= new JButton(btn);
            button.setMaximumSize(new Dimension(100,30));
            sidePanel.add(button);
            sidePanel.add(Box.createVerticalStrut(10));
        }
        
        sidePanel.add(Box.createVerticalGlue());
        
        
        
        add(sidePanel, BorderLayout.WEST);
        add(titlePanel, BorderLayout.NORTH);
    
        pack();
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
           new Form().setVisible(true); 
        });
    }
    
    
}