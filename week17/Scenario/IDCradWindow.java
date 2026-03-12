package week17.Scenario;
import javax.swing.*;
/**
 * Write a description of class IDCradWindow here.
 *  class IDCardWindow that extends JFrame
 *  
 * @author Subrodh Chapagain
 * @version 1.0
 */
public class IDCradWindow extends JFrame
{
    public IDCradWindow(Student student)
    {
        setTitle("Student ID Card");
        setSize(450,300);
        
        
        JPanel panel = new JPanel(); //panel is a container that contains button, textfield abd label
        
        JLabel label = new JLabel(student.formatted());
        label.setHorizontalAlignment(SwingConstants.CENTER);
    
        
        panel.add(label);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}