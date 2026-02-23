package Week16;
import java.util.*;


/**
 * Write a description of class Task5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String s1 = input.next();
        
        StringBuilder sb = new StringBuilder(s1);
        
        sb.append("hello").append(69).append("$");

        
        System.out.println(sb);
    }
    
}