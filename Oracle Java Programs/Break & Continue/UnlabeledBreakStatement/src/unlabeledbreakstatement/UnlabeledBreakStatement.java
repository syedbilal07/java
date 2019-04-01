/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unlabeledbreakstatement;

/**
 *
 * @author Bilal
 */
public class UnlabeledBreakStatement {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589,12, 1076, 2000,8, 622, 127};
        int search = 12;
        boolean found = false;
        int i;
        for(i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] == search){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found " + search + " At Index " + i);
        }
        else{
           System.out.println(search + " Is Not Found In The Array"); 
        }
    }
}
