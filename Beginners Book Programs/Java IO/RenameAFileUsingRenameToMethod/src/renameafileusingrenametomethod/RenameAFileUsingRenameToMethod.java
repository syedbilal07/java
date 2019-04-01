package renameafileusingrenametomethod;
import java.io.File;

public class RenameAFileUsingRenameToMethod {
    public static void main(String[] args) {
        File oldfile = new File("D:\\Old File.txt");
        File newfile = new File("D:\\New File.txt");
        boolean flag = oldfile.renameTo(newfile);
        if(flag){
            System.out.println("File Renamed Successfully");
        }
        else{
            System.out.println("File Cannot Be Renamed");
        }
    } 
}
