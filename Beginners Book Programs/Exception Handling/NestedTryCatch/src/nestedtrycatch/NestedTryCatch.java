package nestedtrycatch;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Inside Try Block 1");
                int a = 50;
                int b = 0;
                int c = a/b;
            }
            catch(ArithmeticException a){
                System.out.println("Inside Catch Block 1");
                System.out.println("Arithmetic Exception In Try Block-1");
            }
            try{
                System.out.println("Inside Try Block 2");
                int a = 60;
                int b = 0;
                int c = a/b;
            }
            catch(ArithmeticException b){
                System.out.println("Inside Catch Block 2");
                System.out.println("Arithmetic Exception In Try Block-2");
            }
        }
        catch(ArrayIndexOutOfBoundsException c){
                System.out.println("Inside Main Catch Block");
                System.out.println("Array Exception In Main Catch Block");
            }
    }
}