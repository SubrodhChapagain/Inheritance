package week17;
import javax.swing.*;

public class Student extends JFrame
{
    public Student()
    {
        setSize(500,500);
        setTitle("Student Profile");
        
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    }
    
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            Student obj = new Student();
            obj.setVisible(true);
        });
    }
}