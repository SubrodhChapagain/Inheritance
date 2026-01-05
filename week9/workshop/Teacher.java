package week9.workshop;


/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class Teacher extends Person
    {
    String subject;
    double bonus;

    public Teacher(int id, String name, double basicSalary,
                   String subject, double bonus) {
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary() {
        return super.calculateAnnualSalary() + bonus;
    }
}
