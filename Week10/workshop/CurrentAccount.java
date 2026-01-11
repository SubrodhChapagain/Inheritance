package Week10.workshop;

public class CurrentAccount extends Account
{
    public CurrentAccount(int acc, String name, double balance) {
        super(acc, name, balance);
    }
    
    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.02;
    }
    
    @Override
    public String toString()
    {
         return toString();
    }
    
    public double calculateInterest(double rate) {
        return super.getBalance() * rate;
    }
}