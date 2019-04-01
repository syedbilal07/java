package ifelsestatement;

public class IfElseStatement {
    public static void main(String[] args) {
        int x = 30;

        if( x == 10 ) 
        {
            System.out.print("Value of X is 10 \n");
        }
        else if( x == 20 ) 
        {
            System.out.print("Value of X is 20 \n");
        }
        else if( x == 30 ) 
        {
            System.out.print("Value of X is 30\n");
        }
        else 
        {
            System.out.print("This is else statement\n");
        }
    }
}