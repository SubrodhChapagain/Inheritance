package week21.week21;
import java.util.*;

public class Employee
{
    private String name, employmentType, department;
    private double salary;
    ArrayList<String> benefits = new ArrayList<>();
    
    public Employee(String name, String employmentType, String department,double salary,ArrayList<String> benefits)
    {
        this.name = name;
        this.employmentType= employmentType;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString()
    {
        return "Name: "+name+"employmentType : "+employmentType+" department: "+department+"benefits: "+benefits+"Salary: "+salary;
    } 
}