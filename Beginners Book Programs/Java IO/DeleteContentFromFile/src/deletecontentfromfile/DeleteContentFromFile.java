package deletecontentfromfile;
import java.io.*;
public class DeleteContentFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D://Read.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.print("");
        pw.close();
        
    }
}
