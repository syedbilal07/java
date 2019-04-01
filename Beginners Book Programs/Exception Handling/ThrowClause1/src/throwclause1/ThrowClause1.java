package throwclause1;

class ThrowClause1{
    static int sum(int num1,int num2){
        if(num1 == 0)
            throw new ArithmeticException("Fisrt Parameters Is Not Valid");
        else
            System.out.println("Both Parameters Are Correct");
        return num1 + num2;           
    }
public static void main(String[] args) {
       int result = sum(01,12);
       System.out.println(result);
       System.out.println("Continue Next Statements");
    }  
}
