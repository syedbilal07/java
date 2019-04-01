package creatinganobject;

public class CreatingAnObject {
    
    public CreatingAnObject(String name){
        System.out.println("Passed Name Is: " + name);
    }
    
    public static void main(String[] args) {
        CreatingAnObject object = new CreatingAnObject("Bilal");
    }
}
