package week12;

 
import java.util.ArrayList;
import java.util.Iterator;

public class Tutorial
{
    public static void main(String[] args)
    {
        ArrayList <Integer> arrlist = new ArrayList();
        
        System.out.println(arrlist.isEmpty()); 
        
        arrlist.add(102);
        arrlist.add(101);
        arrlist.add(70);

        
        arrlist.add(0,85);
        System.out.println(arrlist);
        
        // find size
        System.out.println(arrlist.size());
        
        //Remove, access, update, exists
        arrlist.remove(0);
        System.out.println(arrlist.get(0));
        
        
        arrlist.set(0,100);
        System.out.println(arrlist);
         
        System.out.println(arrlist.contains(89));
        
        System.out.println(arrlist.indexOf(70));
        
       
        
        // for each 
        for(int arr:arrlist)
        {
            System.out.println(arr);
        }
        
        // Interator --> interate
        Iterator<Integer> itr= arrlist.iterator();
        
        while(itr.hasNext())
        {
            int marks= itr.next();
            System.out.println(marks);
        }
        
        
        
        
        
    
    }
}
