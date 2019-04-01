package uncheckedexception2;

public class UncheckedException2 {
    public static void main(String[] args) {
        try{
            int array[] = {1,2,3,4,5};
            System.out.print(array[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The Specified Index Is Not Found In The Array");
        }
    } 
}
