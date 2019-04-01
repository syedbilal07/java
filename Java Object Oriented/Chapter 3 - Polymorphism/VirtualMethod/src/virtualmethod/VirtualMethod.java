package virtualmethod;

public class VirtualMethod {
    public static void main(String[] args) {
        Salary sal = new Salary("Syed Bilal", "Hill Town", 07, 3600.00);
        Employee emp = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Calling mailCheck() Using Salary Object");
        sal.mailCheck();
        System.out.println("Calling mailCheck() Using Employee Object");
        emp.mailCheck();
    }
}