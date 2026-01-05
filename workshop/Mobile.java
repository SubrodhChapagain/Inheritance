package workshop;

public class Mobile
{
    String brand;
    double price;
    
    
    public Mobile( String brand, double price)
    {
    
        this.brand = brand;
        this.price = price;
    
    
    }
    
    void isaffordable()
    {
    if(price<20000)
    {
    
    System.out.println("Brand : "+ brand);
    System.out.println("Price : "+ price);
    
    }
    
    }
}

