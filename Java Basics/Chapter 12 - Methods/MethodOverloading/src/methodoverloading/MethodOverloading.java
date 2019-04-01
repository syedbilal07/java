package methodoverloading;

public class MethodOverloading {
    public static int minValue(int n1, int n2)
    {
        int result;
        if(n1 > n2)
            result = n2;
        else
            result = n1;
        return result;
    }
    public static double minFunction(double n1, double n2)
    {
        double result;
        if(n1 > n2)
            result = n2;
        else
            result = n1;
        return result;
    }
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        double c = 7.3;
        double d = 9.4;
        int result1 = minValue(a,b);
      
        // same function name with different parameters
        double result2 = minFunction(c, d);
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);
    }
}