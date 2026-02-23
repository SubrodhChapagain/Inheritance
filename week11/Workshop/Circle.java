package week11.Workshop;


public class Circle extends Shape
{
    private double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea()
    {
       return 3.14*(radius*radius); 
    }
    
    @Override
    public double calculatePerimeter()
    {
     return (2*3.14*radius);
    }
    
    @Override
    public void Draw()
    {
       System.out.println("This is circle");
    }
    
    
    
}