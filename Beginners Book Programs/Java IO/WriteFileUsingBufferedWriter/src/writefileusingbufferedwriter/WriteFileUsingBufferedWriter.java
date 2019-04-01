package writefileusingbufferedwriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriteFileUsingBufferedWriter {
    public static void main(String[] args) {
        BufferedWriter buff = null;
        try{
            String mycontent = "This String Would Be Written To The Specified File";
            File file = new File("D:\\Buffered Writer File.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            buff = new BufferedWriter(fw);
            buff.write(mycontent);
            System.out.println("File Written Succesfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(buff != null){
                    buff.close();
                }
            }
            catch(IOException e){
            e.printStackTrace();
            }
        }
    }
}
