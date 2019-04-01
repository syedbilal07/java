package defaultthrow;

public class DefaultThrow {
    public static void main(String[] args) {
        try{
            char array[] = {'a','b','c','d'};
            System.out.println(array[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception!!");
        }
    }  
}
