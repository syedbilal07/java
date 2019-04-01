package blankfinalvariable;

class Student{
    final int ROLL_NO;
    Student(int rno){
        ROLL_NO = rno;
    }
    void myMethod(){
        System.out.println("The ROLL NO Is " + ROLL_NO);
    }
}

public class BlankFinalVariable {
    public static void main(String[] args) {
        Student obj = new Student(522);
        obj.myMethod();
    }
}
