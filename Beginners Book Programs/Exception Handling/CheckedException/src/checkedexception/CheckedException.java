package checkedexception;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        FileInputStream file = null;
        try{
            file = new FileInputStream("myfile.txt");
        }
        catch(FileNotFoundException e){
            System.err.println("The Specified file is not found");
        }
        int a;
        try{
        while((a = file.read()) != -1){
            System.out.print((char)a);
            }
        file.close();
        }
        catch(IOException io){
            System.err.println("I/O Error Occured");
        }
    }
}
