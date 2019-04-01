package roleofthisinconstructoroverloading;

class ConstructorOverloading{
    private int RollNum;
    ConstructorOverloading(){
        RollNum = 100;
    }
    ConstructorOverloading(int rNo){
        this();
        /*this() is used for calling the default  
       * constructor from parameterized constructor.
       * It should always be the first statement 
       * in constructor body.
       */
        RollNum = RollNum + rNo;
    }
    public int getRollNo(){
        return RollNum;
    }
    public void setRollNum(int RollNum){
        this.RollNum = RollNum;
    }
}

public class RoleOfThisInConstructorOverloading {
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(12);
        System.out.println("Roll No Is : " + obj.getRollNo());
    }
}
