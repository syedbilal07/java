package inheritancebasics;

class Calculation
{
    int z;
    
    public void addition(int x, int y)
    {
        z = x + y;
        System.out.println("The Sum Is : " + z);
    }
    public void subtraction(int x, int y)
    {
        z = x - y;
        System.out.println("The Difference Is : " + z);
    }
}
class myClass extends Calculation
{
    public void multiplication(int x, int y)
    {
        z = x * y;
        System.out.println("The Product Is : " + z);
    }
}
public class InheritanceBasics {
    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.addition(2, 4);
        obj.subtraction(6, 4);
        obj.multiplication(2, 2);
    }
}