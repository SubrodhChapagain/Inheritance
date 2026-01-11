package Week10.workshop;

public class BikeDelivery extends DeliveryPartner
{
    private double distance;
    
    public BikeDelivery(int partnerId, String name, double basePay, double distance)
    {
        super(partnerId, name , basePay);
        this.distance = distance;
    }
    
    @Override
    public double calcualtePayment()
    {
        return (super.calcualtePayment()+ (this.distance*8));
    
    }
    
    public double calcualtePayment(double extraOrders)
    {
        return this.calcualtePayment()+extraOrders*40;
    
    }
}