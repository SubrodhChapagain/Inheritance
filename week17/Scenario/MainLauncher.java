package week17.Scenario;
import javax.swing.SwingUtilities;

/**
 * Write a description of class MainLauncher here.
 * Swing utilites to open two window of the objects..s1 and s2
 * @author Subrodh Chapagain
 * @version 1.0
 */
public class MainLauncher 
{
    public static void main(String[]args)
    {
        SwingUtilities.invokeLater(() ->
        {
            Student s1 = new Student("Subrodh Chapagain",01,"Computing");
            new IDCradWindow(s1);
            
            Student s2 = new Student("Madan Shrestha",9,"AI");
            new IDCradWindow(s2);
            
        });
    }
}