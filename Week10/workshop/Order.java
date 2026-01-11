package Week10.workshop;


public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    
    public Order(int id, String name, double amount)
    {
        this.orderId= id;
        this.customerName = name;
        this.amount = amount;
    }
    
    public void setOrderId(int newId)
    {
        this.orderId =newId;
    }
    
    public int getOrderId()
    {
        return this.orderId;
    }
    
    public void setAmount(double newAmount)
    {
        this.amount =newAmount;
    
    }
    
    public double getAmount()
    {
        return this.amount;
    }
    
    public double calculateFinalAmount()
    {
        return this.getAmount();
    }
    
    @Override
    public String toString()
    {
        return "order id "+this.orderId + " base amount "+this.amount+" customer name "+this.customerName;
    
    }
    
}