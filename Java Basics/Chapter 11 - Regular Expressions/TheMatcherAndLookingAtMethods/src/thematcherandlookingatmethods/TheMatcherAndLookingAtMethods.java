package thematcherandlookingatmethods;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheMatcherAndLookingAtMethods {
    // Instance Variables
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
   
    public static void main(String[] args) {
        pattern = pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        
        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);
      
        System.out.println("LookingAt() : " + matcher.lookingAt());
        System.out.println("Matches() : " + matcher.matches());
    }
}