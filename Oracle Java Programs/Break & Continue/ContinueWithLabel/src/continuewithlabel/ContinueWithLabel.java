package continuewithlabel;

public class ContinueWithLabel {
    public static void main(String[] args) {
        String search = "Look for a substring in me";
        String substring = "sub";
        boolean found = false;
        int max = search.length() - substring.length();
        int i;
        test:
        for(i = 0; i < max;i++){
            int n = substring.length();
            int j = i;
            int k = 0;
            while(n-- != 0){
                if(search.charAt(j++) != substring.charAt(k++)){
                    continue test;
                }
            }
            found = true;
            break;
        }
        System.out.println(found ? "Found It!": "Didn't Find It!");
    }
}
