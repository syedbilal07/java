package trycatchandfinallyblock;

public class TryCatchAndFinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside Try Block");
            int num = 45/0;
            System.out.println(num);
       }
        catch(ArithmeticException  e){
            System.out.println("Arithmetic Exception :" + e);
        }
        finally{
            System.out.println("Inside Finally Block");
        }
        System.out.println("Outside Finally Block");
    }
}
