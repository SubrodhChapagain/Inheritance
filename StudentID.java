 
import java.util.*;


/**
 * Write a description of class StudentID here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentID
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> ids = new HashMap<>();
        ids.put(101, 86);
        ids.put(102, 92);
        ids.put(103, 78);
        ids.put(102, 95);
        ids.remove(101);
        if(ids.containsKey(103))
        {
          System.out.println(ids.get(103));  
        }
        for(Integer key: ids.keySet())
        {
            System.out.println("Key : "+ key + ", Value : "+ ids.get(key));
        }
    }
}
