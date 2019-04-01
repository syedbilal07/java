package makefilereadonly;
import java.io.File;

public class MakeFileReadOnly {
    public static void main(String[] args) {
        File file = new File("D://Read.txt");
        boolean flag = file.setReadOnly();
        if(flag){
            System.out.println("File Converted To Read Only");
        }
        else{
            System.out.println("Opeartion Failed");
        }
    }
}
