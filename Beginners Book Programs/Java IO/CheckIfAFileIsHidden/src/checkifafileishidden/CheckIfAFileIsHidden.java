package checkifafileishidden;
import java.io.File;

public class CheckIfAFileIsHidden {
    public static void main(String[] args) {
        File file = new File("D://Write.txt");
        if(file.isHidden()){
            System.out.println("File Is Hidden");
        }
        else{
            System.out.println("File Is Not Hidden");
        }
    }
}
