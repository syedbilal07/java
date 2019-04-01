package dateformattingusingflag;
import java.util.Date;

public class DateFormattingUsingFlag {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    } 
}