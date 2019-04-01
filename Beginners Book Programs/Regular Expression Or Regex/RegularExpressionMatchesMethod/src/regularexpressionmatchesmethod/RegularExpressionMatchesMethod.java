package regularexpressionmatchesmethod;

import java.util.regex.Pattern;

public class RegularExpressionMatchesMethod {
    public static void main(String[] args) {
        String content = "This Is Syed Bilal";
        String pattern = ".*Bilal.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("The Text Contains 'Bilal' : " + isMatch);
    }
}
