package compressafileingzipformat;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressAFileInGZIPFormat {
    public static void main(String[] args) {
        CompressAFileInGZIPFormat obj = new CompressAFileInGZIPFormat();
        obj.myFile();
    }
    public void myFile(){
        byte[] buffer = new byte[1024];
        try{
            //Specify Name and Path of Output GZip file here
            GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("D://Zip.gz"));
            //Specify location of Input file here
            FileInputStream fis = new FileInputStream("D:\\Print Writer.txt");
            //Reading from input file and writing to output GZip file
            int length;
            while((length = fis.read(buffer)) > 0){
            /* public void write(byte[] buf, int off, int len): 
            * Writes array of bytes to the compressed output stream.
            * This method will block until all the bytes are written.
            * Parameters:
            * buf - the data to be written
            * off - the start offset of the data
            * len - the length of the data
            */
            gos.write(buffer, 0, length);
            }
            fis.close();
            /* public void finish(): Finishes writing compressed 
            * data to the output stream without closing the 
            * underlying stream.
            */
            gos.finish();
            gos.close();
            System.out.println("File Compressed!!");
        }
        catch(IOException e1){
            System.out.println("IO Error Occured " + e1);
        }
    }
}
