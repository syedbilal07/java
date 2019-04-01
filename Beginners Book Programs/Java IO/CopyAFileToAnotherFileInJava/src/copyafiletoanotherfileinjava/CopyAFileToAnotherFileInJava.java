package copyafiletoanotherfileinjava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAFileToAnotherFileInJava {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        try{
            File infile = new File("D://Read.txt");
            File outfile = new File("D://Write.txt");
            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;
            while((length = instream.read(buffer)) > 0){
                outstream.write(buffer,0,length);
            }
            instream.close();
            outstream.close();
            System.out.println("File Copied Sucessfully");
        }
        catch(IOException e){
            System.out.println("I/O Exception Occured " + e);
        }
    }  
}
