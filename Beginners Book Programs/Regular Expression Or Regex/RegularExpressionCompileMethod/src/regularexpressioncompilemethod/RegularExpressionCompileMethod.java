package regularexpressioncompilemethod;

import java.util.regex.*;

public class RegularExpressionCompileMethod {
    public static void main(String[] args) {
       String content = "This Is Netbeans & It Is Mainly Used For Java Programming";
       String match = ".*java.*";
       Pattern pattern = Pattern.compile(match, Pattern.CASE_INSENSITIVE);
       Matcher check = pattern.matcher(content);
       boolean isMatched = check.matches();
       System.out.println("Is It A Match ? : " + isMatched);
    } 
}
