package week18.tutorial;
import javax.swing.*;
import java.awt.*;

public class StudentDashboardUI 
{
    // for buttons
    String[] buttons ={"Add", "View", "Update","Delete"};
    
    public StudentDashboardUI (){
    
    JFrame frame = new JFrame("Admin Dashboard ");
    frame.setSize(900,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    
    
    frame.setLayout(new BorderLayout());
    
    JPanel headerPanel = new JPanel();
    frame.add(headerPanel,BorderLayout.NORTH);
    
    //flowlayout
    headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    headerPanel.setBackground(Color.LIGHT_GRAY);
    
    // logo image
    ImageIcon logo = new ImageIcon("logo.png");
    
    Image img = logo.getImage(); // transform to Image
    Image scaledImg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH); // scale
    ImageIcon scaledLogo = new ImageIcon(scaledImg);

    JLabel logoLabel = new JLabel(scaledLogo);
    headerPanel.add(logoLabel);
    
    //title lable
    JLabel titleLabel = new JLabel("<html><h1>Student Admin Panel</h1></html>");
    headerPanel.add(titleLabel);
    
    //adding space between logo and title
    headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
    
    
    //FOOTERS
    JPanel footerPanel = new JPanel();
    frame.add(footerPanel,BorderLayout.SOUTH);
    
    footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    footerPanel.setBackground(Color.LIGHT_GRAY);
    
    JLabel footer = new JLabel("© 2025 Student Management System");
    footerPanel.add(footer);
    
    
    //SIDEBAR
    JPanel sidebar = new JPanel();
    frame.add(sidebar, BorderLayout.WEST);
    sidebar.setBackground(new Color (220, 220,220));
    sidebar.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    sidebar.setPreferredSize(new Dimension(180,0));
    
    // box layout use garda : sidebar.add(Box.createVerticalGlue());
    for(String btn: buttons)
    {
        JButton button = new JButton(btn);
        button.setMaximumSize(new Dimension(150,30));
        sidebar.add(button);
        // sidebar.add(Box.createVerticalStrut(10));
    }
    // box layout use garda : sidebar.add(Box.createVerticalGlue());
    
    
    
    //STUDENT REGISTRATION FORM
    JPanel regForm = new JPanel();
    frame.add(regForm, BorderLayout.CENTER);
    regForm.setLayout(new BoxLayout(regForm,BoxLayout.Y_AXIS));
    
    JPanel row1 = new JPanel();
    row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
    row1.setAlignmentX(Component.LEFT_ALIGNMENT);
    row1.add(Box.createHorizontalStrut(10));
    
    JLabel gender = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    
    
    row1.add(gender);
    row1.add(Box.createHorizontalStrut(10));
    
    row1.add(male);
    row1.add(Box.createHorizontalStrut(10));
    
    row1.add(female);
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(male);
    bg.add(female);
    regForm.add(row1);
    
    
    JPanel row2 = new JPanel();
    row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
    row2.setAlignmentX(Component.LEFT_ALIGNMENT);
    row2.add(Box.createHorizontalStrut(10));
    
    
    JLabel label = new JLabel("Skills:");
    
    JCheckBox java = new JCheckBox("Java");
    JCheckBox python = new JCheckBox("Python");
    JCheckBox c = new JCheckBox("C++");
    
    row2.add(label);
    row2.add(Box.createHorizontalStrut(10));
    
    row2.add(java);
    row2.add(Box.createHorizontalStrut(10));
    
    row2.add(python);
    row2.add(Box.createHorizontalStrut(10));
    
    row2.add(c);
    row2.add(Box.createHorizontalStrut(10));
    
    regForm.add(row2);
    
    
    JPanel row3 = new JPanel();
    row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
    row3.setAlignmentX(Component.LEFT_ALIGNMENT);
    row3.add(Box.createHorizontalStrut(10)); //left padding
    
    JLabel courseLabel = new JLabel("Course:");
    
    String[]courses = {"B.Tech","M.Tech","B.Sc","M.Sc"};
    JComboBox course = new JComboBox(courses);
    course.setMaximumSize(new Dimension(100,30));
    row3.add(courseLabel);
    row3.add(Box.createHorizontalStrut(10));
    row3.add(course);
    regForm.add(row3);
    
    
    frame.pack();
  } 
  
  public static void main (String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            new StudentDashboardUI();
        });
    }
}