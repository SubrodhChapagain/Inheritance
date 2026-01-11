package Week10.workshop;

public class CarDelivery extends DeliveryPartner
{
    private double luxaryCharge;
    public CarDelivery(int partnerId, String name, double basePay, double charge)
    {
        super(partnerId, name , basePay);
        this.luxaryCharge = charge;
    }
    
    @Override
    public double calcualtePayment()
    {
        return (super.calcualtePayment()+ this.luxaryCharge);
    
    }
    
    public double calcualtePayment(double extraOrders)
    {
        return this.calcualtePayment()+extraOrders*50;
    }
    
    
    
}