package week11;

public abstract class Delivery
{
    private int orderId;
    private double distanceInKm;
    private String pickUpLocation;
    
    
    public Delivery(int orderID, double distance, String pickup)
    {
        this.orderId = orderID;
        this.distanceInKm = distance;
        this.pickUpLocation = pickup;
    }
    
    public int getOrderId()
    {
        return this.orderId;
    
    }

    public void setOrderId(int newId)
    {
        this.orderId = newId;
    }
    
    public double getDistance()
    {
        return this.distanceInKm;
    }
    
    public String getPickup()
    {
        return this.pickUpLocation;
    }
    
    
    
    // charge + time
    abstract double calcualteCharge();
    abstract double estimateTime();
  
    
}