package week17.Scenario;


/**
 * Write a description of class Student here.
 * a class Student with studentId, name and course.
 * a method that returns formatted HTML text for display in JLabel
 * 
 * @author Subrodh Chapagain
 * @version 1.0
 */
public class Student
{
    private String student;
    private int studentId;
    private String course;
    
    //constructor
    public Student(String name, int id, String course)
    {
        this.student = name;
        this.studentId = id;
        this.course = course;
    }
    
    //Getters
    public String getStudent()
    {
        return this.student;
    }
    
    public int getStudentId()
    {
        return this.studentId;
    }
    
    public String course()
    {
        return this.course;
    }
    
    //formatted HTML text for text to display in JLabel
    public String formatted()
    {
        return "<html><body><div>"
            + "<p><b>Student Id:</b> " + this.studentId + "</p>"
            + "<p><b>Name:</b> " + this.student + "</p>"
            + "<p><b>Course:</b> " + this.course + "</p>"
            + "</div></body></html>";
    }
    
    
    
}