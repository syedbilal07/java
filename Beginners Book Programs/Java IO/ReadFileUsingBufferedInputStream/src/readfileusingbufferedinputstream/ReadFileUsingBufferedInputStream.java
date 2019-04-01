package readfileusingbufferedinputstream;
import java.io.*;

public class ReadFileUsingBufferedInputStream {
    public static void main(String[] args) {
        File file = new File("D:\\Java File.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            while(bis.available() > 0){
                System.out.println((char)bis.read());
            }
        }
        catch(FileNotFoundException e1){
            System.out.println("The Specified File Is Not Found " + e1);
        }
        catch(IOException e2){
            System.out.println("IO Exception Occured " + e2);
        }
        finally{
            try{
                if(fis != null && bis != null){
                fis.close();
                bis.close();
                }
        }
            catch(IOException e3){
                 System.out.println("Error In Input Stream Close()" + e3);   
            }
        }
    }
}
