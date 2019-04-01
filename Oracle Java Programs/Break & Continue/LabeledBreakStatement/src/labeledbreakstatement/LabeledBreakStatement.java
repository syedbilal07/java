/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labeledbreakstatement;

/**
 *
 * @author Bilal
 */
public class LabeledBreakStatement {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int i;
        int j = 0;
        int search = 12;
        boolean found = false;
        for(i = 0; i < arrayOfInts.length; i++){
            for(j = 0;j < arrayOfInts[i].length; j++){
                if(arrayOfInts[i][j] == search){
                    found = true;
                    break;
                }
            }
        }
        if(found){
        System.out.println("Found " + search + " At Index " + i + "," + j);
    }
        else{
        System.out.println(search + "Is Not Found In The Array");
       } 
    }
}
