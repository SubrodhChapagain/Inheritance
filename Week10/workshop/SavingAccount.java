package Week10.workshop;

public class SavingAccount extends Account
{
    public SavingAccount(int acc, String name, double balance) {
        super(acc, name, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.05;
    }

    public double calculateInterest(double rate) {
        return super.getBalance() * rate;
    }
}
