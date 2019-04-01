package unboxing;

class myClass{
    public static void myMethod(int num){
        System.out.println(num);
    }
}

public class Unboxing {
    public static void main(String[] args) {
       Integer inum = 7;
       myClass.myMethod(inum);
    }
}
