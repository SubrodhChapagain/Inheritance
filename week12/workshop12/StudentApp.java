package week12.workshop12;
import java.util.ArrayList;
import java.util.*;


/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String[]args)
    {
        ArrayList <Student> stu = new ArrayList();
        stu.add(new Student("Ayush","L1N1",9876543210L));
        stu.add(new Student("Rahul","L1M1",9876542311L));
        stu.add(new Student("Gaurav","L1N2", 9876543212L));
        
        for(Student std: stu)
        {
            System.out.println(std);
        }
        
        for(int i=0; i<stu.size(); i++)
        {
            if(stu.get(i).getName().equals("Gaurav"))
            {
                stu.remove(i);
            }
        }
        
        Iterator<Student> iterator = stu.iterator();
        while (iterator.hasNext()) {
         Student s = iterator.next();
         if (s.getName().equals("Gaurav")) {
            iterator.remove();  // Safe removal
            s.setGroup("L1N2");
            }
        }
        
        
        
        stu.set(0,new Student("Aavaya","L1C1",9876543213L));
        
        for(int i=0; i<stu.size(); i++)
        {
            if(stu.get(i).getName().equals("Rahul"))
            {
                stu.get(i).setGroup("L1N2");
            }
        }
        
        for(Student std: stu)
        {
            System.out.println(std);
        }
        
        for(int i=0; i<stu.size(); i++)
        {
            if(stu.get(i).getName().equals("Ayush"))
            {
                stu.get(i).setName("Aayush");
            }
        }
        
        for(Student std: stu)
        {
            System.out.println(std);
        }
        
        
    }
}
