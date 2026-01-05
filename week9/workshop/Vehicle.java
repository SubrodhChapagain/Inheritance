package week9.workshop;

public class Vehicle
{
    int vehicleID;
    String Brand;
    int BasePrice;
    
    public Vehicle(int vehicle, String brand, int baseprice)
    {
       this.vehicleID = vehicle;
       this.Brand = brand;
       this.BasePrice = baseprice;
    }
    
    public void displayVehicleInfo()
    {
        System.out.println("VEHICEL ID:" + vehicleID);
        System.out.println("BRAND NAME:" +Brand);
        System.out.println("Baseprice:" + BasePrice);
    }
    
    public double calculatetax()
    {
    
     double tax = BasePrice - BasePrice*0.10;
     return tax;
    
    }
}