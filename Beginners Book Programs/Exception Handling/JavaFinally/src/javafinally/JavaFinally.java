package javafinally;

class Finally{
    public static int myMethod(){
        try{
            return 25;
        }
        finally{
            System.out.println("This is Finally block");
            System.out.println("Finally block ran even after return statement");
        }
    }
}
public class JavaFinally {
    public static void main(String[] args) {
       System.out.println(Finally.myMethod());
    }
}
