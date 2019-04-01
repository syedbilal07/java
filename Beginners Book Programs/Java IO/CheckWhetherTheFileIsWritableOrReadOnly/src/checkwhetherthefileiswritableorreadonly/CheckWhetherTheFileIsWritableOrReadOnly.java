package checkwhetherthefileiswritableorreadonly;
import java.io.File;

public class CheckWhetherTheFileIsWritableOrReadOnly {
    public static void main(String[] args) {
        File file = new File("D://Write.txt");
        boolean flag = file.canWrite();
        if(flag){
            System.out.println("File Is Writable");
        }
        else{
            System.out.println("File Is Read Only");
        }
    }
}
