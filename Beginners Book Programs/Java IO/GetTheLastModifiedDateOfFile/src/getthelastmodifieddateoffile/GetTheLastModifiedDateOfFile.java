package getthelastmodifieddateoffile;
import java.io.File;
import java.text.SimpleDateFormat;

public class GetTheLastModifiedDateOfFile {
    public static void main(String[] args) {
        File file = new File("D://Read.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        System.out.println("Last Modified Date : " + sdf.format(file.lastModified()));
    }
}
