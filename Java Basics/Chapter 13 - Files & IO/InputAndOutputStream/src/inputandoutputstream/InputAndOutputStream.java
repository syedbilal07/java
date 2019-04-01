package inputandoutputstream;
import java.io.*;

public class InputAndOutputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        byte bWrite [] = {11,21,3,40,5};
        OutputStream os = new FileOutputStream("file.txt");
        for(int i = 0; i < bWrite.length; i++)
        {
            os.write(bWrite[i]); // writes the bytes
        }
        os.close();
        
        InputStream is = new FileInputStream("file.txt");
        int size = is.available();
        
        for(int i = 0; i < size; i++)
        {
            System.out.println((char)is.read() + " ");
        }
        is.close();
    }
}