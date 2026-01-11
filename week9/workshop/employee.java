package week9.workshop;

public class employee
{
    int employeeID;
    String Name;
    double basicsalary;
    
    public employee( int emp, String name, double salary)
    {
        this.employeeID = emp;
        this.Name =  name;
        this.basicsalary = salary;
    }
    
    public double calculateBonus()
    {
        double bonus = basicsalary*0.1;
        return bonus;
    }
    
    public void displayEmployee()
    {
        
        System.out.println("emp ID: "+ employeeID);
        System.out.println("emp Name: "+ Name);
        System.out.println("baicsalary :"+basicsalary);
    }
}