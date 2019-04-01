package simpletrycatch;

public class SimpleTryCatch {
    public static void main(String[] args) {
        int num1 = 62;
        int num2 = 0;
        try{
             int num3 = num1 / num2;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured Becuase 62 Is Not Divisibile By 0");
        }
        System.out.println("I Am Out Of Try-Catch Blocks");
    }  
}
