package exceptionsample;

public class ExceptionSample {
    public static void main(String[] args) throws Exception {
        ExceptionSample e = new ExceptionSample();
        e.displayMesage();
    }
    public void displayMesage() throws Exception{
        for(int i=8;i>0;i--){
            System.out.print("i:" + i);
            if(i == 1){
                throw new Exception("This Is My Custom Message");           
            }
        }
    }
}
