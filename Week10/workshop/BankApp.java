package Week10.workshop;

public class BankApp
{
    public static void main(String[] args)
    {
        SavingAccount s1 = new SavingAccount(1001, "Hari", 50000);
        CurrentAccount c1 = new CurrentAccount(2001, "Sita", 80000);

        
        System.out.println(s1);
        System.out.println("Interest: " + s1.calculateInterest());
        System.out.println("Interest at 5%: " + s1.calculateInterest(5));

        
        System.out.println(c1);
        System.out.println("Interest: " + c1.calculateInterest());
        System.out.println("Interest at 7%: " + c1.calculateInterest(7));
    }
    
    }
