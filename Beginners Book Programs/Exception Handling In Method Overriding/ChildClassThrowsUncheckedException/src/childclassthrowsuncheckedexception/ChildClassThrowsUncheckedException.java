package childclassthrowsuncheckedexception;

class Building{
    public void color(){
        System.out.println("The Color Is White");
    }
}
class Floor extends Building{
    @Override
    public void color() throws NullPointerException{
        System.out.println("The Color Is Black");
    }
}
public class ChildClassThrowsUncheckedException {
    public static void main(String[] args) {
        Building obj = new Floor();
        obj.color();
    }
}
