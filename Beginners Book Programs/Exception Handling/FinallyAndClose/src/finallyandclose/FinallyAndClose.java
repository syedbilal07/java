package finallyandclose;
import java.io.*;
import static java.lang.System.in;

public class FinallyAndClose {
    public static void main(String[] args) {
        InputStream input = null;
        try{
            input = new FileInputStream("C:\\Users\\Bilal\\Desktop\\FinallyAndClose\\src\\finallyandclose\\inputfile.txt");
        }
        catch(IOException e){
                System.out.print("The Exception Has Been Caught");
        }
        finally{
           if(input != null){
               try{
                   in.close();
               }
               catch (IOException exp) {
                System.out.println(exp);
               }
           } 
        }
    }
}