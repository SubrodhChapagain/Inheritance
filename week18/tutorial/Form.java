package week18.tutorial;
import javax.swing.*;
import java.awt.*;

public class Form extends JFrame
{
    
    String[] buttons ={"Add", "Edit", "Delete","View"};
    
    public Form()
    {
        setTitle("Layout Demo");
        setSize(500,500);
        
        setLayout(new BorderLayout());
        JPanel titlePanel = new JPanel();
        
        JLabel titleLabel = new JLabel(" Welcome ");
        titlePanel.add(titleLabel);
        
        JPanel sideBar = new JPanel();
        
        
        sideBar.add(Box.createVerticalGlue());
        for(String btn:buttons)
        {
            JButton button = new JButton(btn);
            button.setMaximumSize(new Dimension(120,30));
            sideBar.add(button);
            sideBar.add(Box.createVerticalStrut(10));
        }
        
        sideBar.add(Box.createVerticalGlue());
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        
        JPanel row1 = new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setAlignmentX(Component.LEFT_ALIGNMENT);
        row1.add(Box.createHorizontalStrut(10));
        
        JLabel name = new JLabel("Name");
        JTextField txtName = new JTextField(15);
        txtName.setMaximumSize(new Dimension(110,25));
        
        JPanel row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT);
        row2.add(Box.createHorizontalStrut(10));
        
        JLabel gender = new JLabel("Gender");
        

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        
        row2.add(gender);
        row2.add(male);
        row2.add(female);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(male); 
        bg.add(female);
        
        JPanel row3 = new JPanel();
        
        String dept[] = {
         "HR",
         "Finance",
         "IT",
         "Marketing",
         "Sales",
         "Administration",
         "Customer Support",
         "Logistics",
         "Research",
         "Development",
         "Legal",
        "Operations"
         };
         
         JComboBox deptBox = new JComboBox(dept);
         formPanel.add(deptBox);
        deptBox.setMaximumSize(new Dimension(100,30));
        
         
        add(formPanel, BorderLayout.CENTER);
        row1.add(name);
        row1.add(txtName);
        formPanel.add(row1);
        formPanel.add(row2);
        row1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        add(sideBar,BorderLayout.WEST);
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
        sideBar.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(titlePanel, BorderLayout.NORTH);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }
    
    public static void main (String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            new Form().setVisible(true);
        });
    }
}