package baseclassandchildclassthrowscheckedexception;
class Building{
    public void color() throws NullPointerException{
        System.out.println("The Color Is White");
    }
}
class Floor extends Building{
    @Override
    public void color() throws NullPointerException{
        System.out.println("The Color Is Black");
    }
}
public class BaseClassAndChildClassThrowsCheckedException {
    public static void main(String[] args) {
        Building obj = new Floor();
        obj.color();
    }
}
