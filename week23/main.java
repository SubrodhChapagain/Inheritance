package week23;
import java.util.*;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[]args)
    {
        ArrayList<Person> persons = new ArrayList<>();
        Person p1 = new Student("Subrodh",23,"Computing");
        Person p2 = new Teacher("Sub",30,"Programming");
        
 
        if(p1 instanceof Student)
        {
            Student s1 = (Student)p1;
            String classAttended = s1.attendClass();
            System.out.println(classAttended);
            persons.add(s1);
        }
        
        
        if(p2 instanceof Teacher ) //
        { 
            Teacher t1 =(Teacher)p2;
            t1.takeLecture();
            persons.add(t1);
            
        }
        
        /*
        if(p2 instanceof Teacher t) 
        { 
            Teacher t1 =(Teacher)p2; //yo part chaidaina
            
            t.takeLecture();
            persons.add(t1);
        }
        */
        
        
        for(Person pp: persons)
        {
            if(pp instanceof Teacher)
            {
                pp.showBasicInfo();
            }
        }
        
        //p1.showBasicInfo();
        //p2.showBasicInfo();
    }
}