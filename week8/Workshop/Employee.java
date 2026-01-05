package week8.Workshop;

public class Employee
{
    private double basicsalary;
    String name;
    int empid;
    
    
    public Employee(String name,int empid, double salary)
    {
        this.name = name;
        this.empid = empid;
        this.basicsalary =  salary;
    }
    
    //getters and setters for basic salary
    
    public void setBasicsalary(double basicsalary)
    {
        this.basicsalary =  basicsalary;
    }
    public double getBasicsalary()
    {
      return this.basicsalary;
    }
    
    // method for gross salary
    
    public void gross()
    {
        //use gets 20% bonus
        
        double grosssalary;
        grosssalary = basicsalary*0.2;
        System.out.println("Gross salary: "+grosssalary);
        basicsalary += grosssalary;
        
    }
    
    public void display()
    {
        System.out.println("employee name is:" + name);
        System.out.println("Final salary after bonus "+ basicsalary);
    
    }
    
}