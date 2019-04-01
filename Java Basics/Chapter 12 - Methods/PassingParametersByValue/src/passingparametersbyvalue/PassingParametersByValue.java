package passingparametersbyvalue;

public class PassingParametersByValue {
    public static void swapFunction(int a, int b)
    {
        System.out.println("Before Swapping(Inside), a = " + a + " b = " + b);
        
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping(Inside), a = " + a + " b = " + b);
    }
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Before Swapping, a = " + a + " b = " + b);
        
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before And After Swapping Values Will Be Same Here : ");
        System.out.println("After Swapping, a = " + a + " And b Is " + b);
    } 
}