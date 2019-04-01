package regularexpressionsplitmethod;

import java.util.regex.*;

public class RegularExpressionSplitMethod {
    public static void main(String[] args) {
        String text = "I Am Syed Bilal & I Am Using Netbeans For Java Programming";
        // Pattern For Delimiter (Delimiter Would Be Specified Here Using Regex)
        String piece = "am";
        Pattern pattern = Pattern.compile(piece, Pattern.CASE_INSENSITIVE);
        String[] myString = pattern.split(text);
        for(String temp : myString){
            System.out.println(temp);
        }
        System.out.println("Number Of Split Strings : " + myString.length);
    }
}
