package childclassthrowscheckedexception;
import java.io.*;
class Building{
    public void color(){
        System.out.println("The Color Is White");
    }
}
class Floor extends Building{
    @Override
    public void color() throws IOException{
        System.out.println("The Color Is Black");
    }
}
public class ChildClassThrowsCheckedException {
    public static void main(String[] args) {
        Building obj = new Floor();
        obj.color();
    }
}
