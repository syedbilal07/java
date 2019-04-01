package fileclass;
import java.io.*;

public class FileClass {
    public static void main(String[] args) {
        File file = null;
        String[] str = {"test1.txt", "test2.txt"};
        // for each string in string array 
        for(String s : str)
        {
            // create new file
            file = new File(s);
            // true if the file is executable
            boolean bool = file.canExecute();
            // find the absolute path
            String a = file.getAbsolutePath();
            // prints absolute path
            System.out.println(a);
            // prints
            System.out.println("Is Executable : " + bool);
            
        }
    }
}