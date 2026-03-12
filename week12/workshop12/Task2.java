package week12.workshop12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class Task2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task2
{
    public static void main(String[]args)
    {
        ArrayList <String> name = new ArrayList();
        ArrayList <Integer> number = new ArrayList();
        
        number.add(101);
        number.add(80);
        number.add(90);
        number.add(60);
        
        
        name.add("subrodh");
        name.add("hari");
        name.add("madan");
        name.add("Shyam");
        
        for(int arr: number)
        {
            System.out.println(arr);
        }
        
        Iterator<Integer> itr= number.iterator();
        while(itr.hasNext())
        {
            int num= itr.next();
            System.out.println(num);
        }        
         
        
        for(String arra:name)
        {
            System.out.println(arra);
        }
        
        Iterator<String> ite = name.iterator();
        while(ite.hasNext())
        {
            String nam = ite.next();
            System.out.println(nam);
        }
        
        name.remove(2);
        
        System.out.println(number.size());
        System.out.println(name.size());
        
        number.clear();
        System.out.println(number);
        
        System.out.println(name.get(2));
        
        
        
    }
}