package multipletrycatchblocks;

public class MultipleTryCatchBlocks {
    public static void main(String[] args) {
        try{
            int a[] = new int[7];
            a[4] = 30/0;
            System.out.println("First Print Statement In Try Block");
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic Exception Occured !");
        }
        try{
            int[] b = {1,2,3};
            System.out.println(b[4] + b[6]);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("Array Not Found !");
        }
        catch(Exception e){
            System.out.println("Warning Some Other Exceptions !");
        }
        System.out.println("Out Of Try-Catch Blocks");
    }  
}
