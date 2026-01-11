package Week10;

public class OnlineCourse extends Course 
{
    private double platformFee;
    
    public OnlineCourse(int courseID, String courseName, double baseFee, double plat)
    {
        super (courseID , courseName, baseFee);
        this.platformFee = plat;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee()+this.platformFee;
    }
    
    public void displayOnline()
    {
        super.displayCourse();
        System.out.println("platformFee" + this.calculateFee());
        
        
    }
}