package staticvariables;

public class StaticVariables {
    // salary  variable is a private static variable
    private static double salary;
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development";
    
    public static void main(String[] args) {
         salary = 50000;
         System.out.println("Department Is : " + DEPARTMENT + "." + " Average Salary Is : " + salary);
    }
}
