package Week10.workshop;

public class Doctor extends Person
{
    String specialization;
    double consultationFee;
    
    public Doctor(int id, String name,double base,String specialization,double consultationFee)
    {
        super(id , name, base);
        this. specialization = specialization;
        this. consultationFee = consultationFee;
    }
    
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary()+consultationFee;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" Doctor specialization"+this.specialization+"consultationFee"+this.consultationFee;
    
    }
    
    
}