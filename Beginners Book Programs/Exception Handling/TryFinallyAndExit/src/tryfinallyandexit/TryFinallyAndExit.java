package tryfinallyandexit;

public class TryFinallyAndExit {
    public static void main(String[] args) {
      try{
          System.out.println("Inside Try Block");
          System.exit(0);
      }   
      catch(Exception e){
          System.out.println("Exception Got Caught" + e);
      }
      finally{
          System.out.println("Java finally block");
      }
    }
}
