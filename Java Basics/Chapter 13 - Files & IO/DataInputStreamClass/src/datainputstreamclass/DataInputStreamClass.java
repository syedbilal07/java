package datainputstreamclass;
import java.io.*;

public class DataInputStreamClass {
    public static void main(String[] args) throws IOException {
        String file = "J:\\file.txt";
        // writing string to a file encoded as modified UTF-8
        DataOutputStream dataOut = new DataOutputStream((new FileOutputStream(file)));
        dataOut.writeUTF("hello");
        // Reading data from the same file
        DataInputStream dataIn = new DataInputStream(new FileInputStream(file));
        while(dataIn.available() > 0)
        {
            String read = dataIn.readUTF();
            System.out.println(read + " ");
        }
    }
}