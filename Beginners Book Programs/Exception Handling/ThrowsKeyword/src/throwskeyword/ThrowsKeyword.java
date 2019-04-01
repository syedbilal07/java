package throwskeyword;

import java.io.*;

class Demo{
    void MyMethod(int num) throws IOException, ClassNotFoundException{
        if(num == 1){
            throw new IOException("I/O Exception Occured");
        }
        else{
            throw new ClassNotFoundException("Class Not Found Exception Has Occured");
        }
    }
}

public class ThrowsKeyword{
    public static void main(String[] args) {
        try{
        Demo obj = new Demo();
        obj.MyMethod(2);
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
