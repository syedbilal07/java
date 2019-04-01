package deepnestedtrycatch;

public class DeepNestedTryCatch {
    public static void main(String[] args) {
      try{
          try{
              try{
                  int[] array = {1,2,3,4};
                  System.out.print(array[10]);
              }
          catch(ArithmeticException e){
              System.out.println("Arithmetic Exception Handled In Try Block 3");
          }
        }   
          catch(ArithmeticException e1){
              System.out.println("Arithmetic Exception Handled In Try Block 2");
          }
      }
          catch(ArithmeticException e2){
              System.out.println("Arithmetic Exception Handled In Main Try Block");
         }
          catch(ArrayIndexOutOfBoundsException a){
              System.out.println("ArrayIndexOutOfBoundsException Handled In Main Try Block");
          }
          catch(Exception b){
              System.out.println("Exception Handled In Main Try Block");
         }
      }  
}
