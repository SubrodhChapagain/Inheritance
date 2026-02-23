package week11.Workshop;


public class Rectangle extends Shape
{
    private int length;
    private int height;
    private int breadth;
    
    public Rectangle(int length, int height, int breadth)
    {
        this.length  = length;
        this.height = height;
        this.breadth = breadth;
    }
    
    @Override
    public double calculateArea()
    {
       return this.length*breadth*height; 
    }
    
    @Override
    public double calculatePerimeter()
    {
     return (2*(this.length+this.breadth));
    }
    
    @Override
    public void Draw()
    {
       System.out.println("This is rectangle");
    }
   
}