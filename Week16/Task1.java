package Week16;
import java.util.Scanner;


/**
 * Write a description of class Task1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task1
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String s1 = input.next();
        
        System.out.println("Enter 2nd string");
        String s2 = input.next();
        
        System.out.println("Concatination:"+s1.concat(s2));
        
        System.out.println("Enter 3rd string");
        String s3 = input.next();
        
        System.out.println("equals:"+s1.concat(s2).equals(s3));
        
  
    }
    
}