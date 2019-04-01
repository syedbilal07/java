package objectclone;

class DogName implements Cloneable{
    private final String Name;
    public DogName(String Name){
         this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    // Overriding clone() method of Object class
    @Override
    public Object clone() throws CloneNotSupportedException{
        return(DogName) super.clone();
    }
}

public class ObjectClone {
    public static void main(String[] args) {
        DogName obj1 = new DogName("Tom");
        try{
            DogName obj2 = (DogName) obj1.clone();
            System.out.println(obj2.getName());
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
