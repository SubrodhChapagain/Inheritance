package week9.workshop;


public class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(int accountNumber, String name,
                           double balance, double overdraftLimit) {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal not allowed!");
            return false;
        }
    }
}

