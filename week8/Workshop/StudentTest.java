package week8.Workshop;


public class StudentTest
{
    public static void main (String[]args)
    {
        String collegeName = "Islington";
        System.out.println("Collage name:" + collegeName);
        System.out.println();
        
      Student s1 = new Student("Subrodh",01,"ktm",9888);
      s1.displayinfo();
      System.out.println();
      
      
      Student s2 = new Student ("Hari",02,"Pkr", 98890);
      s2.displayinfo();
      
    
      
    }
}