package week9.workshop;


public class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(int accountNumber, String name,
                          double balance, double interestRate) {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return super.getBalance() * interestRate / 100;
    }
}

