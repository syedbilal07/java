package regularexpressionmatchermethod;

import java.util.regex.*;

public class RegularExpressionMatcherMethod {
    public static void main(String[] args) {
        String content = "ZZZ AA PP AA QQQ AAA ZZ";
        String string = "AA";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("Found At: " + matcher.start() + "-" + matcher.end());
        }        
    }
}
