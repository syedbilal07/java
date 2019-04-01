package abstractclass;

public abstract class Employee {
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String address, int number)
    {
        System.out.println("Constructing An Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay()
    {
        System.out.println("Inside Employee Cumpute Pay");
        return 0.0;
    }
    public void mailCheck()
    {
        System.out.println("Inside Employee Mail Check Method");
        System.out.println("Mailing To " + this.name + " " + this.address);
    }
    @Override
    public String toString()
    {
        return this.name + " " + this.address + " " + this.number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public int getNumber()
    {
        return number;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
}