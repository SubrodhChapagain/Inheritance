package Week10.workshop;

public class NormalOrder extends Order
{
    private int orderCharge;
    public NormalOrder(int id, String name, double amount, int charge)
    {
        super(id ,name, amount);
        this.orderCharge= charge;
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount()+this.orderCharge;
    }
    
    
    public double calculateFinalAmount(double discountAmount)
    {
        return this.calculateFinalAmount()-discountAmount;
    }
        
}
