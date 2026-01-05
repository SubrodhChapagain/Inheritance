package week9.workshop;


/**
 * Write a description of class SchoolApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class SchoolApp 
    {
    public static void main(String[] args) {

        Teacher teacher =
                new Teacher(1, "Anita", 40000, "Java", 10000);

        Staff staff =
                new Staff(2, "Ramesh", 160, 300);

        System.out.println("Teacher Annual Salary: " +
                teacher.calculateAnnualSalary());

        System.out.println("Staff Salary: " +
                staff.calculateSalary());

        System.out.println("College Name: " + Person.collegeName);
    }
}