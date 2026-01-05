package week9;


public class Car extends Vehicle
{
    private int door;
    
    public Car(String brandName, int maxSpeed, int doors)
     {
         super(brandName , maxSpeed);
         this.door = doors;
     }
     
    public void display()
     {
         System.out.println("CAR brand name:"+super.brandname);
         System.out.println("CAR speed:"+super.maxspeed);
         System.out.println("NO of doors :"+this.maxspeed);
         
      }
    
}