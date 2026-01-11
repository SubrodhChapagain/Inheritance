package Week10.workshop;

public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(int id, String name,String shift,double base,double extra)
    {
        super(id , name, base);
        this. shift = shift;
        this.extraAllowance = extra;
    }
    
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary()+extraAllowance;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"Nurse Shift"+this.shift + "extraAllowance"+this.extraAllowance;
    
    }
    
    
    
}