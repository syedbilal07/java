package genericmethod;



public class GenericMethod {
    // generic method printArray
    public static <E> void printArray(E[] inputArray)
    {
        // Display array elements
        for(E element : inputArray)
        {
            System.out.println(element + " ");
        }
    }
    public static void main(String[] args) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        
        System.out.println("Array integerArray Contains:");
        printArray(intArray);
        System.out.println("\nArray doubleArray Contains:");
        printArray(doubleArray);
        System.out.println("\nArray characterArray Contains:");
        printArray(charArray);
    }
}