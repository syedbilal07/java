package myexception;

class defineException extends Exception{
    String str1;
    defineException(String str2){
        str1 = str2;
    }
    @Override
    public String toString(){
        return("Output String :" + str1);
    }
}

public class MyException {
    public static void main(String[] args) {
        try{
            throw new Exception("Exception Thrown!");
        }
        catch(Exception e){
            System.out.println("Hi this is my catch block") ;
            System.out.println(e);
        }
    }
}
