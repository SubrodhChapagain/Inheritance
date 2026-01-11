package Week10.workshop;

public class Student
{
    private int rollNo;
    private String name;
    private int marks;
    
    public Student(int rollno, String name, int marks)
    {
        this. rollNo = rollno;
        this.name = name;
        this.marks=marks;
    }
    
    public int getRollNo() { 
        return rollNo; }
    
    public void setRollNo(int rollNo) { 
        this.rollNo = rollNo; }

    public String getName() { 
        return name; }
        
    public void setName(String name) { 
        this.name = name; }

    public int getMarks() { 
        return marks; }
        
    public void setMarks(int marks) 
    {
        this.marks = marks;}
    
    @Override
    public String toString()
    {
        return this.name + "rollno "+this.rollNo + "marks "+this.marks; 
    }
    
    public String calculateResult()
    {
        return marks >= 40 ? "Pass" : "Fail";
    }
    
    
    
    
}