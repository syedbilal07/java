package singlesocketserver;
import java.net.*;
import java.io.*;
import java.util.*;

public class SingleSocketServer {
    static ServerSocket socket1;
    protected final static int port = 1999;
    static Socket connection;
    static boolean first;
    static StringBuffer process;
    static String TimeStamp;
    
    public static void main(String[] args) {
        try
        {
            socket1 = new ServerSocket(port);
            System.out.println("Single Server Socket Initialized");
            int character;
            while(true)
            {
                connection = socket1.accept();
                BufferedInputStream is = new BufferedInputStream(connection.getInputStream());
                InputStreamReader isr = new InputStreamReader(is);
                process = new StringBuffer();
                while((character = isr.read()) != 13)
                {
                    process.append((char)character);
                }
                System.out.println(process);
                //need to wait 10 seconds for the app to update database
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Interrupted");
                }
                TimeStamp = new Date().toString();
                String returnCode = "Single Server Responded At : " + TimeStamp + (char)13;
                BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
                OutputStreamWriter osw = new OutputStreamWriter(bos);
                osw.write(returnCode);
                osw.flush();
            }
            
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
}