package writefileusingbufferedoutputstream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileUsingBufferedOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        String myContent = "This Is My Data To Be Written In A File";
        try{
            file = new File("D://Write File.txt");
            fos = new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            byte[] bytesArray = myContent.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
            if(fos != null){
                fos.close();
                }
            }
            catch(IOException e){
            e.printStackTrace();
            }
        }
    }
}
