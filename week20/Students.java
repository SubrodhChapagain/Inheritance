package week20;
import java.util.ArrayList;

public class Students
{
    private String name,gender, course;
    private ArrayList<String>hobbies;
    
    public Students(String name, String gender, String course, ArrayList<String> hobbies){
        this.name = name;
        this.gender = gender;
        this.hobbies = hobbies;
        this.course = course;
    }
    
    @Override
    public String toString()
    {
        return "Name: "+name+" Gender: "+gender+" course: "+course+" Hobbies: "+hobbies;
    }
}