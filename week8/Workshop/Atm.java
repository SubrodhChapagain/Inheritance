package week8.Workshop;
 
public class Atm
{
    private int accno;
    private double balance;
    private String name;
    
    public Atm( int account, double balance, String name)
    {
        this.accno = account;
        this. balance = balance;
        this. name = name;
    }
    
    
    public void setAccno( int accno)
    {
        this.accno = accno ;
    }
    public int getAccno()
    {
      return this.accno;
    }
    
    
    public void setBalance( double balance)
    {
        this.balance = balance ;
    }
    public double getBlance()
    {
      return this.balance;
    }
    
    
    public void setName( String name)
    {
        this.name = name ;
    }
    public String getName()
    {
      return this.name;
    }
    
    
    public void deposit(double amount)
    {
    
        if (amount<0)
        {
          System.out.println("Insufficeint amount to deposit");
        
        }
        else 
        {
           balance += amount;
           System.out.println(+amount+"Amount deposited");
           System.out.println("Deposit successful:" + balance);        
        }
        
    
    }
    
    public boolean withdraw (double wamount)
    {
    
        if (wamount<0)
        {
        System.out.println("Invalid amount to withdraw");
        return false;
        }
        else if (wamount>balance)
        {
         System.out.println("Insufficeint amount to withdraw");
         return false;
        }
        else 
        {
            balance -= wamount;
            
            System.out.println("Withdrawl successful:" + balance);
            System.out.println(+wamount+"Amount withdrawed");
            return true;
        }
        
        
        
    }
    
    public void display()
        
         {
        System.out.println(" Customer name is: " + name);
        System.out.println("Customer account number: "+accno);
    
         }
    
    
}