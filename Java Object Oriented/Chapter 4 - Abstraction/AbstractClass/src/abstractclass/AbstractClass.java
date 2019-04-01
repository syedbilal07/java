package abstractclass;

public class AbstractClass {
    public static void main(String[] args) {
        Salary s = new Salary("Syed Bilal", "Hill Park", 07, 55000);
        Employee e = new Salary("Huzaifa Hassan", "Park Lane", 07, 65000);
        System.out.println("Call mailCheck Using Salary Reference");
        s.mailCheck();
        System.out.println("Call mailCheck Using Employee Reference");
        e.mailCheck();
    }
}