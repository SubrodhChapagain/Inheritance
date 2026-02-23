package week11;


public class CarDelivery extends Delivery implements Interface
{
    private static final double PER_KM_CHARGE = 60;
    private static final double MIN_PER_CHARGE = 5;
    public CarDelivery (int orderID, double distance, String pickup)
    {
        super(orderID , distance, pickup);
    }
    
    
    @Override
    public double calcualteCharge()
    {
        return super.getDistance() * PER_KM_CHARGE;
    
    }
    
    @Override
    public double estimateTime()
    {
        return super.getDistance() * MIN_PER_CHARGE;
    
    }
    
    @Override
    public void notify(String message)
    {
        System.out.println(message);
    
    
    }
    
    
    
    
    
}