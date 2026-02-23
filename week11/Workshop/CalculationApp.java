package week11.Workshop;


public class CalculationApp
{
    public static void main(String[] args)
    {
       Shape[] shape1 = new Shape [2];
    
       shape1[0] = new Rectangle(10,5,6);
       shape1[1] = new Circle(5);
  
       
       for(int i=0; i<shape1.length;i++)
       {
           shape1[i].Draw();
           shape1[i].displayShapeInfo();
        }
}
    
    
}