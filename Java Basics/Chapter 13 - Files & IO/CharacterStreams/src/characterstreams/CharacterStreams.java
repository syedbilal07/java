package characterstreams;
import java.io.*;

public class CharacterStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader in = null;
        FileWriter out = null;
        
        try
        {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");
            
            int c;
            while((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
        finally
        {
            if(in != null)
            {
                in.close();
            }
            if(out != null)
            {
                out.close();
            }
        }
    }
}