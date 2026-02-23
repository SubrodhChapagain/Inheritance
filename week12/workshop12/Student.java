package week12.workshop12;

public class Student
{
    private long phone;
    private String name;
    private String group;
    
    public Student(String name,String group,long phone)
    {
        this.name = name;
        this.group = group;
        this.phone =phone;
    }
    
    @Override
    public String toString()
    {
        return "phone "+ this.phone + " name "+this.name + "group "+this.group;
    
    }
    
    public void setPhone(long newnumber)
    {
        this.phone = newnumber;
    }
    
    public long getPhone()
    {
        return phone;
    }
    
    public void setName(String newname)
    {
        this.name = newname;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setGroup(String newgroup)
    {
        this.group = newgroup;
    }
    
    public String getGroup()
    {
        return group;
    }
    
    
    
    
    
    
}
