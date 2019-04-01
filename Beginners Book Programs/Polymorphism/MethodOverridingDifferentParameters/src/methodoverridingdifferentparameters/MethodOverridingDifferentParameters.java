package methodoverridingdifferentparameters;
class DisplayOverriding{
    public void display(char c){
        System.out.println(c);
    }
    public void display(char c, int a){
        System.out.println(c + " " + a);
    }
}
public class MethodOverridingDifferentParameters {
    public static void main(String[] args) {
        DisplayOverriding Obj = new DisplayOverriding();
        Obj.display('B');
        Obj.display('C', 7);
        
    } 
}
