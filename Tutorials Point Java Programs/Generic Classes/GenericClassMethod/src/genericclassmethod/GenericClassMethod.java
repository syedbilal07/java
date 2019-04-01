package genericclassmethod;

public class GenericClassMethod {
        // Generic Method printArray
    public static <E> void printArray(E[] inputArray){
        // Display Array Elements
        for(E element : inputArray){
            System.out.printf("%s", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create Array Of Integer, Double, Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'S','A','A','D','I'};
        System.out.println("Array : Integer Array Contains ");
        printArray(intArray);
        System.out.println("Array : Double Array Contains ");
        printArray(doubleArray);
        System.out.println("Array : Character Array Contains ");
        printArray(charArray);
    }
}