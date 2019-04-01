package virtualmethod;

public class Salary extends Employee {
    private double salary;
    public Salary(String name, String address, int number, double salary)
    {
        super(name,address,number);
        setSalary(salary);
    }
    @Override
    public void mailCheck()
    {
        System.out.println("Mailing To " + getName() + " With Salary " + salary) ;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }
    public double computePay()
    {
        System.out.println("Computing Pay For : " + getName());
        return salary/52;
    }
}