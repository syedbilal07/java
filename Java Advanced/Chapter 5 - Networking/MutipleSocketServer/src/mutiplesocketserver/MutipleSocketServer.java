package mutiplesocketserver;
import java.net.*;
import java.io.*;
import java.util.*;

public class MutipleSocketServer implements Runnable {
    private Socket connection;
    private String TimeStamp;
    private int ID;
    
    public static void main(String[] args) {
        int port = 1999;
        int count = 0;
        try
        {
            ServerSocket socket1 = new ServerSocket(port);
            System.out.println("Multiple Socket Connection Initialized");
            while(true)
            {
                Socket connection = socket1.accept();
                Runnable runnable = new MutipleSocketServer(connection, ++count);
                Thread thread = new Thread(runnable);
                thread.start();
            }
        }
        catch(IOException e)
        {
            System.out.println("I/O Exception. Printing The Stack Trace");
            e.printStackTrace();
        }
    }
    MutipleSocketServer(Socket s, int i)
    {
        this.connection = s;
        this.ID = i;
    }
    @Override
    public void run() 
    {
        try
        {
            BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
            InputStreamReader isr = new InputStreamReader(bis);
            int character;
            StringBuffer process = new StringBuffer();
            while((character = isr.read()) != 13)
            {
                process.append((char)character);
            }
            System.out.println(process);
            //need to wait 10 seconds to pretend that we're processing something
            try
            {
                Thread.sleep(10000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted... Printing The Stack Trace");
                e.printStackTrace();
            }
            TimeStamp = new Date().toString();
            String returnCode = "Multiple Socket Server Responded At : " + TimeStamp + (char) 13;
            BufferedOutputStream bos =  new BufferedOutputStream(connection.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(bos , "US-ASCII");
            osw.write(returnCode);
            osw.flush();
        }
        catch(IOException e)
        {
            System.out.println("I/O Exception. Printing The Stack Trace");
            e.printStackTrace();
        }
        finally
        {
            try
            {
                connection.close();
            }
            catch(IOException e)
            {
                System.out.println("I/O Exception. Printing The Stack Trace");
                e.printStackTrace();
            }
        }
    }
}