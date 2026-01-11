package Week10.workshop;


public class Account
{
    private int accountNo;
    private String holderName;
    private double balance;
    
    public Account(int acc, String name, double balance)
    {
        this.accountNo = acc;
        this.holderName = name;
        this.balance = balance;
    }
    
    public void setAcc(int newacc)
    {
        this.accountNo = newacc;
    }
    
    public int getAcc()
    {
        return this.accountNo;
    
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public double getBalance()
    {
        return this.balance;
    
    }
    
    public double calculateInterest() {
        return this.balance;
    }
    
    @Override
    public String toString()
    {
        return "name: "+this.holderName+ "acc no "+this.accountNo + "balance " + this.balance;
    
    }
    
    

    
    
    
}