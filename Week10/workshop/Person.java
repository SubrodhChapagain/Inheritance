package Week10.workshop;


public class Person
{
    private int id;
    private String name;
    double baseSalary;
    
    public Person(int id, String name ,double base){
        this.id= id;
        this.name = name;
        this.baseSalary = base;
    }
    
        public void setId(int newid){
        this.id = newid;
    }
    
    public int getId(int newid){
        return this.id;
    }
    
    public void setName(String newname)
    {
        this.name = newname;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    
    
    public double calculateSalary()
    {
        return this.baseSalary;
    }
    
    public double calculateSalary( double emergencyCase)
    {
        return emergencyCase;
    }
    
    
    @Override
    public String toString()
    {
        return this.name + " Id"+ this.id;
    
    }

}