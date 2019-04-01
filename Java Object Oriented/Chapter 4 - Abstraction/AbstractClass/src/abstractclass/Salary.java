package abstractclass;

public class Salary extends Employee {
    private double salary;
    public Salary(String name, String address, int number, double salary)
    {
        super(name,address,number);
        setSalary(salary);
    }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
            salary = newSalary;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public double computePay()
    {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
    public void mailCheck()
    {
        System.out.println("Inside Salary Mail Check Method");
        System.out.println("Mailing To " + getName() + " " + getSalary());
    }
}