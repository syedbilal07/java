package enhancedforloop;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers)
        {
            System.out.println("Value Of x :" + x);
            
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for(String name : names)
        {
            System.out.println("Name Is :" + name);
        }
    }
}
