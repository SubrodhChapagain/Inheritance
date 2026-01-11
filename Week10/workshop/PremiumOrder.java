package Week10.workshop;



public class PremiumOrder extends Order
{
    private int premiumCharge;
    
    public PremiumOrder (int id, String name, double amount, int charge)
    {
        super(id ,name, amount);
        this.premiumCharge= charge;
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount()+this.premiumCharge;
    }
    
    public double calculateFinalAmount(double discountAmount)
    {
        return this.calculateFinalAmount()-discountAmount;
    }
}