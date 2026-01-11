package Week10;

public class Course
{
    private int courseID;
    private String courseName;
    private double baseFee;
    
    public Course(int courseID, String courseName, double baseFee)
    {
        this.courseID =courseID;
        this.courseName=courseName;
        this.baseFee=baseFee;
    }
    
    public void setCourseID( int newID)
    {
        this.courseID= newID;
    }
    
    public int getCourseID()
    {
        return this.courseID;
    }
    
    public void setCourseName( String newname)
    {
        this.courseName= newname;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public void setBaseFee(double newfee)
    {
        this.baseFee = newfee;
    }
    
    public double getBaseFee()
    {
        return baseFee;
    }
    
    public double calculateFee()
    {
        return this.baseFee;
    }
    
    public double calculateFee(double discountAmmount)
    {
        return this.baseFee - discountAmmount;
    }
    
    public void displayCourse()
    {
       System.out.println("course id "+ this.courseID);
       System.out.println("course name "+ this.courseName);
       System.out.println("Base fee "+ this.baseFee);
       
    }
    
    
    
}