package filereaderclass;
import java.io.*;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        
        // creates the file
        file.createNewFile();
        
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        
        // Writes the content to the file
        writer.write("This\n is\n an\n example\n"); 
        writer.flush();
        writer.close();
        
        // Creates a FileReader Object
        FileReader reader = new FileReader(file);
        char[] a = new char[50];
        // reads the content to the array
        reader.read(a);
        
        for(char c : a)
        {
            System.out.print(c);
        }
        reader.close();
    }
}