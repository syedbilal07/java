package multiplestaticblock;

public class MultipleStaticBlock {
        static int num;
        static String mystr;
        static{
            num = 10;
            mystr = "David";
        }
        static{
            num = 07;
            mystr = "Villa";
        }
    public static void main(String[] args) {
        System.out.println("The Value Of 'num' Is " + num);
        System.out.println("The Value Of 'mystr' Is " + mystr);
    }
}
