package minvaluemethod;

public class MinValueMethod {
    public static int minMethod(int n1, int n2)
    {
        int result;
        if(n1 > n2)
            result = n2;
        else
            result = n1;
        return result;
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 60;
        int c = minMethod(a, b);
        System.out.println("Min Value Is : " + c);
    } 
}