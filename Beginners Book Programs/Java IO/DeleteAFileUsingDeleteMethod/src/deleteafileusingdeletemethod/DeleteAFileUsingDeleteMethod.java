package deleteafileusingdeletemethod;
import java.io.File;

public class DeleteAFileUsingDeleteMethod {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Java File.txt");
            if(file.delete()){
                System.out.println("File Is Deleted :" + file.getName());
            }
            else{
                System.err.println("File Cannot Be Deleted Or File Is Not Found");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
