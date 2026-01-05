package week8.Workshop;

public class ShoppingApp
{
  public static void main (String[]args)
  {
    
      ShoppingCart d1 = new ShoppingCart("BOOK", 99, 2);
      d1.calculatediscount(20);
      d1.displaycart();
    
  }
}