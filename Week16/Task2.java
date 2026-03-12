package Week16;
import javax.swing.Box;


/**
 * Write a description of class Task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2
{
    public void check(String whiteSpace)
    {
        String tri = whiteSpace.trim();
        System.out.println(tri);
        
        String sub = tri.substring(0,10);
        System.out.println(sub);
        
        String[] spli = tri.split("\\s+");
        for(String x:spli)
        {
            System.out.println(x);
        }
        
    }
    
    public static void main (String []args)
    {
        Task2 obj = new Task2();
        
        obj.check("Hello world");
    }
}