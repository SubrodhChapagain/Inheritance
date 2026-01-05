package week9.workshop;

public class Car extends Vehicle
{
    private int door;
    String fuelType;
    
    
    public Car(int vehicle, String brand, int baseprice, int doors, String fuel)
     {
         super(vehicle, brand, baseprice);
         this.door = doors;
         this.fuelType = fuel;
     }
      
      public double calcualtefinalprice()
      {
        
         double tax = calculatetax();
         double lux = (BasePrice+tax)*0.5;
         return tax + BasePrice + lux;
         
     }
    
}