
package week23;


class Teacher extends Person
{
    private String subject;

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String performRole()
    {
        return name + " teaches " + subject+"\t";
    }

    public String takeLecture()
    {
        return name + " is taking lecture."+"\t";
    }
}
