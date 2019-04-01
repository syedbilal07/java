package createfile;
import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Java File.txt");
            boolean check = file.createNewFile();
            if(check){
                System.out.println("File Created Successfully");
            }
            else{
                System.out.println("File Cannot Be Created Due To Some Error Or File Is Already Present");
            }
        }
        catch(IOException e){
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
