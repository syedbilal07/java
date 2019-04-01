package finalmethod;

class XYZ{
    final void myMethod(){
        System.out.println("Class XYZ - myMethod");
    }
}

public class FinalMethod extends XYZ {
    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        obj.myMethod();
    }
}
