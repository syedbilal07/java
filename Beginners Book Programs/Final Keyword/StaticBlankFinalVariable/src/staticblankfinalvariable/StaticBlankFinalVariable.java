package staticblankfinalvariable;

class Student{
    static final int ROLL_NO;
    static{
        ROLL_NO = 7;
    }
    void myMethod(){
        System.out.println("The ROLL NO Is " + ROLL_NO);
    }
}

public class StaticBlankFinalVariable {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.myMethod();
    }
}
