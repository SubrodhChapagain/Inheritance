package week9.workshop;

    public class ContractEmployee extends employee
    {
    int workingDays;
    public ContractEmployee(int employeeId, String name,double Salary, int workingDays) {
        super(employeeId, name, Salary);
        this.workingDays = workingDays;
    }

    public double calculateTotalSalary() {
        return basicsalary * workingDays;
    }
}
