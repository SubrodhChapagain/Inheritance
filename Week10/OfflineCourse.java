package Week10;

public class OfflineCourse extends Course 
{
    private double labFee;
    
    public OfflineCourse(int courseID, String courseName, double baseFee, double lab)
    {
        super (courseID , courseName, baseFee);
        this.labFee = lab;
    }
    
    @Override
    public double calculateFee()
    {
        return super.getBaseFee()+this.labFee;
    }
    
    public void displayOnline()
    {
        super.displayCourse();
        System.out.println("fee for online class" + this.calculateFee());
    }
    
}