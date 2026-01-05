package week9.workshop;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person {
    int id;
    String name;
    double basicSalary;
    static String collegeName = "ABC College";

    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}
