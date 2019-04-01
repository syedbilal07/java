package singlesocketclient;
import java.net.*;
import java.io.*;
import java.util.*;

public class SingleSocketClient {
    public static void main(String[] args) {
        /** Define a host server */
        String host = "localhost";
        /** Define a port */
        int port = 1999;
        StringBuffer instr = new StringBuffer();
        String TimeStamp;
        System.out.println("Socket Client Initialized");
        // Requesting a Socket and Establishing a Connection
        try
        {
            /** Obtain an address object of the server */
            InetAddress address = InetAddress.getByName(host);
            /** Establish a socket connection */
            Socket connection = new Socket(address, port);
            // Writing to the Socket
            /** Instantiate a BufferedOutputStream object */
            BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
            /** Instantiate an OutputStreamWriter object with the optional character
            * encoding.
            */
            OutputStreamWriter osw = new OutputStreamWriter(bos, "US-ASCII");
            TimeStamp = new Date().toString();
            String process = "Calling The Socket Server On : " + host + ", Port : " + port + " At : " + TimeStamp + (char)13;
            /** Write across the socket connection and flush the buffer */
            osw.write(process);
            osw.flush();
            
            // Reading from the Socket
            
            /** Instantiate a BufferedInputStream object for reading
            * incoming socket streams.
            */
            BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
            
            /**Instantiate an InputStreamReader with the optional
            * character encoding.
            */
            InputStreamReader isr = new InputStreamReader(bis, "US-ASCII");
            
            /**Read the socket's InputStream and append to a StringBuffer */
            int c;
            while((c = isr.read()) != 13)
            {
                instr.append((char)c);
            }  
            /** Close the socket connection. */
            connection.close();
            System.out.println(instr);
        } 
        catch (UnknownHostException ex) 
        {
            System.out.println("Host Name Is Unknown");
        } 
        catch (IOException ex) 
        {
            System.out.println("I/O Exception");
        } 
    }
}