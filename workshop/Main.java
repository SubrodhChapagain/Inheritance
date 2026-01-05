package workshop;

public class Main
{
    public static void main (String[]args)
    {
    
      Book b1 = new Book();
      
      b1.title = "MunaMadan";
      b1.author = "Roshan pandey";
      b1.price = 258;
      b1.displaydetails();
      
      Book b2 = new Book();
      b2.title = "Alchemist";
      b2.author = "mama";
      b2.price = 300;
      b2.displaydetails();
   
      
      
      Recatngle r1 = new Recatngle();
      
      r1.length = 10;
      r1.breadth = 27.2;
      r1.display();
      r1.calculation();
      
      Recatngle r2 = new Recatngle();
      
      r2.length = 11.11;
      r2.breadth = 29.65;
      r2.display();
      r2.calculation();
      
      
      
      
      Employee e1 = new Employee();
      e1.id = 01;
      e1.name ="Subrodh";
      e1. salary = 2000000;
      e1.displayemployee();
      
      Employee e2 = new Employee();
      e2.id = 03;
      e2.name ="Sub";
      e2. salary =18000009;
      e2.displayemployee();
      
      Employee e3 = new Employee();
      e3.id = 03;
      e3.name ="Su";
      e3. salary = 29878780;
      e3.displayemployee();
      
      if(e1.salary>e2.salary && e1.salary> e3.salary)
      {
        System.out.println("highest emp 1 "+e1);
        
        }
      else if(e2.salary>e1.salary && e2.salary> e3.salary)
       {
        System.out.println("highest emp 2 "+e2);
        
        }
        else
        {
         
            System.out.println("highest emp 3 "+e3);
        
        }

        
        
      Laptop l1 = new Laptop("lenovo", 4, 200000);
      l1.displaylap();
      Laptop l2 = new Laptop("Asus",8, 400000);
      l2.displaylap();
      Laptop l3 = new Laptop ("HP",16, 400000);
      l3.displaylap();
      
      
      
      Mobile m1 = new Mobile("Samsung", 40000);
      m1.isaffordable();
      Mobile m2 = new Mobile("honour", 2000);
      m2.isaffordable();
      
    
    
    {
      Result re1 = new Result(45, 77, 66);
      re1.total();
      re1.perc();
      
      Result re2 = new Result(50, 79, 90);
      re2.total();
      re2.perc();
      
      Result re3 = new Result(80, 80, 19);
      re3.total();
      re3.perc();
    }
    }
}
