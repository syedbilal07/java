package privateconstructororsingletonclass;

class SingleClass{
    //Static Class Reference
    private static SingleClass obj = null;
    private SingleClass(){
        /*Private Constructor will prevent 
       * the instantiation of this class directly*/
    }
    public static SingleClass objectMethod(){
        /*This logic will ensure that no more than
	 * one object can be created at a time */
        if(obj == null){
            obj = new SingleClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton Class Example");
    }
}

public class PrivateConstructorOrSingletonClass {
    public static void main(String[] args) {
        //Object cannot be created directly due to private constructor 
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        SingleClass obj = SingleClass.objectMethod();
        obj.display();
    }
}
