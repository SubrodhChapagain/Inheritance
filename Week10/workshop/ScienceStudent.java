package Week10.workshop;

public class ScienceStudent extends Student {
    
    public ScienceStudent(int rollno, String name, int marks) {
        super(rollno, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.getMarks() >=45 ?"PASS":"Fail"; 
    }

    public String calculateResult(int graceMarks) {
        setMarks(getMarks()+graceMarks);
        return calculateResult();
    }
}