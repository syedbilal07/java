package instancevariables;

public class InstanceVariables {
    // this instance variable is visible for any child class.
    public String name;
    // salary  variable is visible in InstanceVariables class only.
    private double salary;
    // The name variable is assigned in the constructor.
    public InstanceVariables(String empName)
    {
        this.name = empName;
    }
    // The salary variable is assigned a value.
    public void setSalary(int empSalary)
    {
        salary = empSalary;
    }
    // This method prints the employee details.
    public void printEmployeeDetails()
    {
        System.out.println("Employee Name Is : " + name);
        System.out.println("Employee Salary Is : " + salary);
    }
    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables("Syed Bilal");
        obj.setSalary(50000);
        obj.printEmployeeDetails();
    }
}
