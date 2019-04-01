package continuestatement;

public class ContinueStatement {
    public static void main(String[] args) {
        String search = "peter piper picked a " + "peck of pickled peppers";
        int max = search.length();
        int i;
        int num = 0;
        for(i = 0;i < max;i++){
            if(search.charAt(i) != 'p')
                continue;
            num++;        
            }
        System.out.println("Found " + num + " P's In The String");
        }
    }
