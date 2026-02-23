package Week16;
import java.util.Scanner;


/**
 * Write a description of class Task6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task6
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String s1 = input.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = s1.length() - 1; i >= 0; i--)
        {
            sb.append(s1.charAt(i));
        }
        System.out.println(sb.toString());
        
        if(s1.equalsIgnoreCase(sb.toString()))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is NOT palindrome");
        }
    }
}