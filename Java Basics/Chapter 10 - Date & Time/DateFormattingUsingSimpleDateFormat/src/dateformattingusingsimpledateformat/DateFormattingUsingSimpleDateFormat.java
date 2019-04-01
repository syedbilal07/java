package dateformattingusingsimpledateformat;
import java.util.*;
import java.text.*;

public class DateFormattingUsingSimpleDateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date : " + ft.format(date));
    }
}