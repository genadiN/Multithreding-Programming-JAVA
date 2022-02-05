package Array;

public class SumArray {
    public static void main(String[] args) {
        int array[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        //add each element's value to total
        for(int counter = 0 ; counter < array.length ; counter++){
            total += array[counter];
        }
        System.out.printf("Sum of elements from array is: %d\n" , total);
    }//end main
}// end class SumArray
