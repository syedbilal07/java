package boundedtypeparameters;

public class BoundedTypeParameters {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z )
    {
        // assume x is initially the largest
        T max = x;
        
        if(y.compareTo(max) > 0)
        {
            max = y; // y is the largest so far
        }
        if(z.compareTo(max) > 0)
        {
            max = z; // z is the largest so far
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 
        3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
        6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
        "apple", "orange", maximum("pear", "apple", "orange"));
    }
}