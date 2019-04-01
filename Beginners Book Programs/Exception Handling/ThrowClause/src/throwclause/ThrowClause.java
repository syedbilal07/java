package throwclause;

class MyOwnException extends Exception{
    public MyOwnException(String message){
        super(message);
    }
}

class EmployeeTest{
    static void EmployeeAge(int Age) throws MyOwnException{
          if(Age<0){
              throw new MyOwnException("Age Cannot Be Less Than Zero");
          }  
          else{
              System.out.println("Age Is Valid");
          }
   }
}

public class ThrowClause {
    public static void main(String[] args) {
        try{
            EmployeeTest.EmployeeAge(-2);
        }
        catch(MyOwnException e){
            e.printStackTrace();
        }
    }   
}
