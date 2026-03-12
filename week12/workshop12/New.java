package week12.workshop12;
import java.util.*;


/**
 * Write a description of class New here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class New
{
    public static void main(String[]args)
    {
        ArrayList <String> name = new ArrayList<>();
        ArrayList <Integer> number = new ArrayList<>();
        
        number.add(101);
        number.add(80);
        number.add(90);
        number.add(60);
        
        
        Iterator<Integer> itr= number.iterator();
        while(itr.hasNext())
        {
            int num = itr.next();
            System.out.println(num);
        }        
         
    }
}