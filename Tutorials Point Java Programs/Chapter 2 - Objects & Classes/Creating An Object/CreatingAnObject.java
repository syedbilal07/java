/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatinganobject;

/**
 *
 * @author Bilal
 */
public class CreatingAnObject {
    public CreatingAnObject(String name){
        System.out.println("Passed Name Is: " + name);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreatingAnObject object = new CreatingAnObject("Bilal");
    }
    
}
