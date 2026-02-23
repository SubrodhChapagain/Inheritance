package week12;


public class Student
{
    private int id;
    private String name;
    
    public Student(int id, String name)
    {
        this.id =id;
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return "id "+ this.id + " name "+this.name;
    
    }
}