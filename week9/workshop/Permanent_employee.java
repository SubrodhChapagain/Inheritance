package week9.workshop;


public class Permanent_employee extends employee
{
    double hra;
    double da;
    public Permanent_employee( int emp, String name, double salary, double hra, double da)
    {
        super(emp , name, salary);
        this.hra =hra;
        this.da = da;

    }
    
    public double calculatetotalsalary()
    {
        return basicsalary+hra+da+calculateBonus(); 
    }
    
    
}