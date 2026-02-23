package week11.Workshop;


public abstract class Shape implements Drawable
{
    
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
    public void displayShapeInfo()
    {
        System.out.println("Area :"+ calculateArea());
        System.out.println("Perimeter :"+ calculatePerimeter());
        
    }
    
    

}