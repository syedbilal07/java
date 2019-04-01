package measuringelapsedtime;
import java.util.*;

public class MeasuringElapsedTime {
    public static void main(String[] args) {
        try
        {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("The Difference Is : " + diff); 
        }
        catch (Exception e) 
        {
            System.out.println("Got an exception!");
        }
    }
}