package week8.Workshop;

public class Student
{
    private String name;
    private int id;
    String address;
    long phno;
    
    
    
    public Student(String name, int id, String addr, long no)
    {
        
      this.name = name;
      this.id = id;
      this.address = addr;
      this.phno = no;
    
    }
    
    // setters and getters method
    
    public void setName(String name)
    {
     this.name = name;
     
    }
    
    public String getName()
    {
      return this.name;
    }
    
    
    
    // setters anf getters for ID
    public void setId(int id)
    {
     this.id = id;
     
    }
    
    public int getId()
    {
      return this.id;
      
    }
    
    
    
    public void displayinfo()
    {
       
        System.out.println("Name of students is: "+name);
        System.out.println("Student id: "+ id);
        System.out.println("Students Address: " + address);
        System.out.println("Student phonenumber: "+phno);
         
        
    }
    
}