package staticvariables;

public class StaticVariables {
    static int var1 = 07;
    String var2 = "Bilal";
    public static void main(String[] args) {
        StaticVariables obj = new StaticVariables();
        System.out.println("The Value Of 'var1' Is " + var1);
        System.out.println("The Value Of 'var2' Is " + obj.var2);
    }
}
