package week8.Workshop;

public class BankAccount
{
    public static void main(String[]args)
    {
        Atm c1 = new Atm(20010,189301,"Subrodh");
        c1.display();
        System.out.println();
        
        c1.deposit(100);
        System.out.println();
        
        c1.withdraw (100);
        System.out.println();
        
        c1.setName("Hari");
        c1.display();
    
    
    }
}