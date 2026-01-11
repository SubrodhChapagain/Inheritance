package Week10.workshop;

public class OrderApp
{
    public static void main(String[]args)
    {
        NormalOrder no = new NormalOrder(01,"Shyam",12000,500);
        System.out.println(no);
        
        PremiumOrder po = new PremiumOrder(2,"Madan",12000,1000);
        System.out.println(po);
        
    
    
    }
}