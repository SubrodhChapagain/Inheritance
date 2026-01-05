package week8.Workshop;


public class ShoppingCart
{
    private String itemName;
    private double price;
    private int quantity;
    
    public ShoppingCart (String item , double price, int quantity)
    {
     this.itemName = item;
     this.price =  price;
     this.quantity = quantity;
    }
    
    public void setQuantity(int quantity)
    {
       this.quantity = quantity;
    }
    public int getQuantity()
    {
       return this.quantity;
    }
    
    
    // calculate total
    
    public double calcualateTotal()
    {
    
     return this.quantity*this.price;
     
    }
    
    
    // calculate disount
    
    public double calculatediscount(double discountpercentage)
    {
      double total = this.calcualateTotal();
      
      return (total- (discountpercentage/100)*total);
      
    }
    
    
    public void displaycart()
    {
      
        System.out.println("item Name is: "+ itemName);
        System.out.println("Item price :" + price);
        System.out.println("Quantity:" + quantity);
    
    }
    
}