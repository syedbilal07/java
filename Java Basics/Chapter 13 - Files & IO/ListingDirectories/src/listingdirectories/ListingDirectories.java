package listingdirectories;
import java.io.*;

public class ListingDirectories {
        
    public static void main(String[] args) {
        File file = null;
        String[] paths;
        
        // create new file object
        file = new File("J:/");
        
        // array of files and directory
        paths = file.list();
        
        // for each name in the path array
        for(String path : paths)
        {
             // prints filename and directory name
            System.out.println(path);
        }
    }
}