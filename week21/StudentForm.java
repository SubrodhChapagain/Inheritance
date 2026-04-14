package week21;

import javax.swing.*;
import java.awt.*;


public class StudentForm extends JFrame
{
    private String[] btnList= {"Add", "Edit", "Delete", "View"};
    
    public StudentForm()
    {
        setTitle("Layout Demo");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JPanel titlePanel= new JPanel();
        JLabel label= new JLabel("Student Registration Details");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.RED);
        titlePanel.add(label);
        
        add(titlePanel, BorderLayout.NORTH);
        
        JPanel sidebarPanel= new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sidebarPanel.add(Box.createVerticalGlue());
        
        for(String btn: btnList)
        {
            JButton button= new JButton(btn);
            button.setMaximumSize(new Dimension(100,40));
            sidebarPanel.add(button);
            sidebarPanel.add(Box.createVerticalStrut(10));
        }
        
        sidebarPanel.add(Box.createVerticalGlue());
        add(sidebarPanel, BorderLayout.WEST);
        
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        
        JPanel row1= new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel nameLbl= new JLabel("Name: ");
        JTextField txtField= new JTextField(15);
        row1.add(nameLbl);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(txtField);
        row1.add(Box.createHorizontalGlue());
        
        
        JPanel row2= new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel courseLabel= new JLabel("Course:");
        
        String[] courses={"Computing", "Networking", "AI", "Multimedia"};
        JComboBox<String> courseBox= new JComboBox<>(courses);
        
        row2.add(courseLabel);
        row2.add(Box.createHorizontalStrut(10));
        row2.add(courseBox);
        
        
        JPanel row3= new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
        row3.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        
        JLabel genderLabel= new JLabel("Gender:");
        
        row3.add(genderLabel);
        row3.add(Box.createHorizontalStrut(10));
        
        String[] genders= {"Male", "Female", "Others"};
        ButtonGroup genderGrp= new ButtonGroup();
        
        for(String gender: genders)
        {
            JRadioButton btn= new JRadioButton(gender);
            genderGrp.add(btn);
            row3.add(btn);
            row3.add(Box.createHorizontalStrut(10));
        }
        
        
        JPanel row4= new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
        row4.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        String[] hobbies={"Reading", "Travelling","Sports"};
        
        JLabel hobbiesLabel= new JLabel("Hobbies:");
        row4.add(hobbiesLabel);
        row4.add(Box.createHorizontalStrut(10));
        
        for(String hobby: hobbies)
        {
            JCheckBox checkHobbies= new JCheckBox(hobby);
            row4.add(checkHobbies);
            row4.add(Box.createHorizontalStrut(10));
        }
        
        JPanel row5= new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
        row5.setAlignmentX(Component.LEFT_ALIGNMENT);
        row5.add(Box.createHorizontalGlue());
        
        JButton submitBtn= new JButton("Submit");
        
        row5.add(submitBtn);
        
        formPanel.add(row1);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(row2);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(row3);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(row4);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(row5);
        
        
        add(formPanel, BorderLayout.CENTER);
        
        pack();
        
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            new StudentForm().setVisible(true);
        });
    }
    
    
}
