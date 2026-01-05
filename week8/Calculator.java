package week8;


public class Calculator
{
    
    public void displayinfo()
    {
        System.out.println("Welcome to calaculator");
    
    }
    
    public void add(int a, int b)
    {
        int sum = a+b;
        System.out.println("Sum is "+sum);
    
    }
    
    
    // return type + no paramaters
    public int getFixedNumber()
    {
    
        return 10;
    
    }
     
    // return types and paramaters
    
    public int multiply(int c, int d)
    {
         
        return c*d;
    
    }
    
    
    
    // static method 
    public static int square(int a)
    {
    
      return a*a;
    }
    
}