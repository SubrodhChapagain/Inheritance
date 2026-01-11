package Week10.workshop;

public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int partnerId, String name, double basePay)
    {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay= basePay;
    }
    
    
    public void setpartnerId(int newid){
        this.partnerId = newid;
    }
    
    public int getpartnerId(){
        return this.partnerId;
    }
    
    public void setName(String newname)
    {
        this.name = newname;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setBasepay(int newpay)
    {
        this.basePay = newpay;
    }
    
    public double getBasepay()
    {
        return this.basePay;
    }
    
    public double calcualtePayment()
    {
        return this.basePay;
    
    }
    
    @Override
    public String toString()
    {
        return this.name + " Id "+ this.partnerId +"basepay "+this.basePay;
    
    }
    
    
    
    
    
    
}