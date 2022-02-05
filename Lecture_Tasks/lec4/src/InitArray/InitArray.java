package InitArray;

public class InitArray {
    //create and output two-dimensional arrays
    public static void main(String[] args) {
        int array1[][] = { {1, 2, 3} , {4, 5, 6} };
        int array2[][] = { {1, 2}, {3} , {4, 5, 6} };

        System.out.println("values in array1 by row are: ");
        outputArray( array1 );// displays array1 by row

        System.out.println("\n values in array2 by row are: ");
        outputArray(array2);//displays array2 by row
    }//end main

    //output rows and columns o a two-dimensional arrya
    public static void outputArray(int array[][]){
        //loop through array'rows
        for(int row = 0 ; row < array.length ; row++){
            //loop through columns of current row
            for(int cow = 0 ; cow < array[row].length ; cow++){
                System.out.printf("     %d" , array[row][cow]);
            }
            System.out.println();//start new line of output
        }//end outer for
    }//end method outputArray
}//end class InitArray
