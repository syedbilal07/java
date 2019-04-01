package appendcontentusingprintwriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendContentUsingPrintWriter {
    public static void main(String[] args) {
        try{
        File file = new File("D:\\Print Writer.txt");
        if(!file.exists()){
                file.createNewFile();
        }
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter buff = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(buff);
        pw.println("");
        pw.println("This Is The First Line");
        pw.println("This Is The Second Line");
        pw.println("This Is The Third Line");
        pw.close();
        System.out.println("File Written Succesfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
