/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcasefallthrough;

/**
 *
 * @author Bilal
 */
public class SwitchCaseFallThrough {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.ArrayList<String> futureMonths = new java.util.ArrayList<>();
        int month = 8;
        switch(month){
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");   
            default: break;
        }
        if(futureMonths.isEmpty())
        {
            System.out.println("Invalid Month");
        }
        else
        {
            for(String monthName : futureMonths)
            {
                System.out.println(monthName);
            }
        }
    }
    
}
