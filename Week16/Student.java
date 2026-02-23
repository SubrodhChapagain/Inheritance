package Week16;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int age;
    private String school;
    private int grade;
    private String citizenship;
    private String phone;
    
    // constructor
    public Student(String name, int age, String school , int grade,String citizenship,String phone)
    {
        this.name=  name;
        this.age =age;
        this.grade =grade;
        this.citizenship = citizenship;
        this.phone = phone;
        this.school = school;
    }
    
    //getter methods
    public String getName()
    {
       return this.name; 
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public String getSchool()
    {
        return this.school;
    }
    
    public int getGrade()
    {
        return this.grade;
    }
    
    public String getCtzn()
    {
        return this.citizenship;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s,Age: %d, School: %s,Grade: %d",this.name,this.age,this.school,this.grade);
    }
    
    public String getNameInitials()
    {
        String[] spli = this.name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (String name: spli)
        {
            String first = name.substring(0,1).toUpperCase();
            String remaining = name.substring(1).toLowerCase();
            
            sb.append(first).append(".");
        }
        return sb.toString();    
    }
    
}
