package week9.workshop;

public class VehicleApp
{
    public static void main()
     { 
        Car c1 = new Car(01045,"ford",10000090,4,"diseal");
        c1.displayVehicleInfo();
        c1.calculatetax();
        
        Bike b1 =  new Bike (01045,"MOTO",100090,103456);
        b1.displayVehicleInfo();
        b1.calculatetax();
        
     }
}