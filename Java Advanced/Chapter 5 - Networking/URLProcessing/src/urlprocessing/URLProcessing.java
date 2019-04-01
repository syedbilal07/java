package urlprocessing;
import java.net.*;
import java.io.*;

public class URLProcessing {
    public static void main(String[] args) {
        try
        {
            URL url = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if(urlConnection instanceof HttpURLConnection)
            {
                connection = (HttpURLConnection) urlConnection;
            }
            else
            {
                System.out.println("Please Enter An HTTP URL");
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while((current = in.readLine()) != null)
            {
                urlString += current;
            }
             System.out.println(urlString);
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }
    }
}