package week9.workshop;

public class Bike extends Vehicle
{
    double enginecapacity;
    
    public Bike (int vehicle, String brand, int baseprice, double engine)
    {
        super(vehicle, brand, baseprice);
        this.enginecapacity = engine;
    
    }
    
    public double calcualtefinalprice()
      {
        
         double tax = calculatetax();
         return tax + BasePrice ;
         
     }
     
    
    
}