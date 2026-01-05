package week9.workshop;


public class BankApp {
    public static void main(String[] args) {

        SavingAccount sa =
                new SavingAccount(101, "Hari", 50000, 5);

        CurrentAccount ca =
                new CurrentAccount(102, "Sita", 20000, 10000);

        sa.deposit(5000);
        System.out.println("Interest: " + sa.calculateInterest());
        System.out.println("Balance: " + sa.getBalance());

        ca.withdraw(25000);
        System.out.println("Balance: " + ca.getBalance());
    }
}