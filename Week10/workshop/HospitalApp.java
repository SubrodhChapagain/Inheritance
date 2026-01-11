package Week10.workshop;

public class HospitalApp
{
    public static void main (String[] args)
    {
        Nurse n1 = new Nurse(01,"Sita","Day",10000,250);
        System.out.println(n1);
        
        Doctor d1 = new Doctor(05,"Hari",190000,"Eye",10000);
        System.out.println(d1);
    
    }
}