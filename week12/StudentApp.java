package week12;

 
import java.util.ArrayList;

public class StudentApp
{
    public static void main (String[]args)
    {
        ArrayList <Student> students = new ArrayList<>();
        
        students.add(new Student(101, "subrodh"));
        students.add(new Student(10, "hari"));
        students.add(new Student(105, "ramu"));
        
        
        System.out.println(students.get(0));
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        
        
        
        
        
        
    
    
    }
}
