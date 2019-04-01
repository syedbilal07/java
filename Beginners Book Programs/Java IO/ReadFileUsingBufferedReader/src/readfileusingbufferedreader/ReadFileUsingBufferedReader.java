package readfileusingbufferedreader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {
    public static void main(String[] args) {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        try{
            br1 = new BufferedReader(new FileReader("D:\\Java File.txt"));
            // Using ReadLine() Method Which Reads A Line Of Text
            System.out.println("Reading The File Using ReadLine() Method");
            String contentLine = br1.readLine();
            while(contentLine != null){
                System.out.println(contentLine);
                contentLine = br1.readLine();
            }
            br2 = new BufferedReader(new FileReader("D:\\Java File 2.txt"));
            // Using Read() Method Which Reads A Character Of Text
            System.out.println("Reading The File Using Read() Method");
            int num = 0;
            char ch;
            while((num = br2.read()) != -1){
                ch = (char)num;
                System.out.println(ch);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(br1 != null && br2 != null){
                    br1.close();
                    br2.close();
                    }
                }
            catch(IOException e){
            e.printStackTrace();
            }
        }
    }
}
