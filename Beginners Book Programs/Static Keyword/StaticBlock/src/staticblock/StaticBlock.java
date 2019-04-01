package staticblock;

public class StaticBlock {
    static int num;
    static String mystr;
    static{
        num = 07;
        mystr = "Static Keyword In Java";
    }
    public static void main(String[] args) {
        System.out.println("The Value Of 'num' Is : " + num);
        System.out.println("The Value Of 'mystr' Is : " + mystr);
    }  
}
