package classesandobjects;

class Employee
{
    String name;
    int age;
    String designation;
    double salary;
    Employee(String name)
    {
        this.name = name;
    }
    public void setAge(int empAge)
    {
        age = empAge;
    }
    public void setDesignation(String empDesignation)
    {
        designation = empDesignation;
    }
    public void setSalary(double empSalary)
    {
        salary = empSalary;
    }
    public int getAge()
    {
        return age;
    }
    public String getDesignation()
    {
        return designation;
    }
    public double getSalary()
    {
        return salary;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Syed Bilal");
        emp1.setAge(24);
        emp1.setDesignation("Manager");
        emp1.setSalary(50000);
        Employee emp2 = new Employee("Ammar Hameed");
        emp2.setAge(22);
        emp2.setDesignation("General Manager");
        emp2.setSalary(40000);
        
        System.out.println("emp1 Age : " + emp1.getAge());
        System.out.println("emp1 Designation : " + emp1.getDesignation());
        System.out.println("emp1 Salary : " + emp1.getSalary());
        System.out.println("emp2 Age : " + emp2.getAge());
        System.out.println("emp2 Designation : " + emp2.getDesignation());
        System.out.println("emp2 Salary : " + emp2.getSalary());
    }
}
