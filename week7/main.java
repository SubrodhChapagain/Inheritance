package week7;



public class main
{
    public static void main (String[]args)
    {
        students s1 = new students();
        s1.collegeid = "np01cp";
        s1.name = "Subrodh chapagain";
        s1.age=19;
        s1.study();
    
         System.out.println(s1.collegeid);
         System.out.println(s1.name);
         System.out.println(s1.age);
         
         
         
        students s2 = new students();
        s2.collegeid = "np01cp0098";
        s2.name = "Ramu kaka";
        s2.age= 69;
        s2. laugh();
        
        System.out.println(s2.collegeid);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        
        
    car c1 = new car();
    c1.Brand = "audi";
     c1.model = "Q1";
     c1.colour ="pink";
    c1.price = 200000000;
    c1. owner = "Raju";
    c1.drive();
    
    
    System.out.println(c1.owner);
    System.out.println(c1.Brand);
    System.out.println(c1.model);
    System.out.println(c1.colour);
    System.out.println(c1.price);
    c1.braking();
    
    
    
    }
}
