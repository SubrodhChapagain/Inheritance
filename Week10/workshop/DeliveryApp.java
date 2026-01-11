package Week10.workshop;

public class DeliveryApp
{
    public static void main (String[]args)
    {
        BikeDelivery b1 = new BikeDelivery(3,"hari",1000,3);
        System.out.println(b1);
        
        CarDelivery c1 = new CarDelivery(1,"madan",5000,250);
        System.out.println(c1);
    
    
    }
}