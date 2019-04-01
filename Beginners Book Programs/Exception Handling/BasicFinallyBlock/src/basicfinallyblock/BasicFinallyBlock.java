package basicfinallyblock;

class Method{
public static int myMethod(){
    try{
    return 0;
    }
    finally{
        System.out.println("Inside Finally Block");
    }
}
}

public class BasicFinallyBlock {
    public static void main(String[] args) {
         System.out.println(Method.myMethod());
    } 
}
