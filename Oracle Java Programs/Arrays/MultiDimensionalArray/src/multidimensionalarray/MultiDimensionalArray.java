/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensionalarray;

/**
 *
 * @author Bilal
 */
public class MultiDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] names ={
        {"Mr.", "Mrs.","Ms."},{"Bilal","Emma"}                 
    };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
        System.out.println("The Length Of 'Names' Array Is:" + names.length);
    }
}
