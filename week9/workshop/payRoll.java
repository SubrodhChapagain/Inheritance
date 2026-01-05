package week9.workshop;

public class payRoll
{
     public static void main(String[] args) {
        Permanent_employee pe =new Permanent_employee(1, "Ram", 30000, 5000, 4000);
        
        ContractEmployee ce =new ContractEmployee(2, "Shyam", 1000, 20);
        
        System.out.println("PERMANENT EMPLOYEE");
        pe.displayemployee();
        
        System.out.println("Total Salary: " + pe.calculatetotalsalary());
        System.out.println("\nCONTRACT EMPLOYEE ");
        ce.displayemployee();
        
        System.out.println("Total Salary: " + ce.calculateTotalSalary());
    }
}