package bytearraystream;

import java.io.*;
import java.io.IOException;

public class ByteArrayStream {
    public static void main(String[] args) throws IOException {
        String request;
        FileOutputStream fout1 = new FileOutputStream("D://myFile1.txt");
        FileOutputStream fout2 = new FileOutputStream("D://myFile2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(711);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        bout.flush();
        bout.close();
        System.out.println("Data Written Succesfully");
    }
}
