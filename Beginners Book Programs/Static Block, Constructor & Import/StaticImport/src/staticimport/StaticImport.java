package staticimport;
import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        double var1 = sqrt(5.0);
        double var2 = tan(30);
        out.println("Square Of 5 Is " + var1);
        out.println("Tan Of 30 Is " + var2);
    }
}
