package week8;


public class Main
{
    public static void main(String[]args)
    {
        Calculator calc = new Calculator();
        calc.displayinfo();
    
        calc.add(10,5);
        
        
        
        calc.getFixedNumber();
        int fixNum = calc.getFixedNumber();
        System.out.println("The fixed number is: " + fixNum);
        
        
        int multi = calc.multiply(5,2);
        int multi1 =  calc.multiply(6,0);
        System.out.println("The multi is: " + multi);
        
        
        Calculator.square(10);
        
    }
    
    
}