package breakwithlabel;

public class BreakWithLabel {

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
        search:
        for(i = 0;i<arrayOfInts.length;i++){
            for(j = 0; j < arrayOfInts.length;j++){
                if(arrayOfInts[i][j] == search){
                       found = true;
                       break search;
                }
            }
        }
        if(found){
            System.out.println("Found " + search + " At Index " + i + "," + j);
        }
        else{
             System.out.println(search + "Is Not Found");
        }
    } 
}
