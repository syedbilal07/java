package appendcontentusingfilewriterandbufferedwriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendContentUsingFileWriterAndBufferedWriter {
    public static void main(String[] args) {
        String content = "This Is The Content Which Would Be Appended At The Last Of The File";
        File file = new File("D:\\Append File.txt");
        try{
            if(!file.exists()){
            file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter buff = new BufferedWriter(fw);
            buff.write(content);
            buff.close();
            System.out.println("File Written Succesfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
