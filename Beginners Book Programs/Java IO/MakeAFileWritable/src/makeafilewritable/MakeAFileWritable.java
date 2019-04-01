package makeafilewritable;
import java.io.File;

public class MakeAFileWritable {
    public static void main(String[] args) {
        File file = new File("D://Read.txt");
        file.setWritable(true);
        if(file.canWrite()){
            System.out.println("File Is Writable");
        }
        else{
            System.out.println("File Is Read Only");
        }
    }
}
