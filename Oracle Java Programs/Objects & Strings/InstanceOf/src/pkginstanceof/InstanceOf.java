/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;

/**
 *
 * @author Bilal
 */
public class InstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        
        System.out.println("Object 1 Is Instance Of Parent: " + (obj1 instanceof Parent));
        System.out.println("Object 1 Is Instance Of Child: " + (obj1 instanceof Child));
        System.out.println("Object 1 Is Instance Of MyInterface: " + (obj1 instanceof MyInterface));
        System.out.println("Object 2 Is Instance Of Parent: " + (obj2 instanceof Parent));
        System.out.println("Object 2 Is Instance Of Child: " + (obj2 instanceof Child));
        System.out.println("Object 2 Is Instance Of MyInterface: " + (obj2 instanceof MyInterface));
    }
  
}
  class Parent{};
  class Child extends Parent implements MyInterface{};
  interface MyInterface{};
