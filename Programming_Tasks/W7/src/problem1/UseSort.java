package problem1;

import java.util.Arrays;
import java.util.Random;

public class UseSort {

    public static void print(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        SortOrder sortOrder = new SortOrder();
        Sortable asc = sortOrder.getAscendingOrder();
        Sortable desc = sortOrder.getDescendingOrder();

        MySort mySort = new MySort();//asc by default

        Random rand = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101) - 50;
            //[-50; 50] -> [0; 100] - 50
            //[23; 67] - 23 -> [0; 44] -> nextInt(45) + 23

        }

        System.out.println("Numbers unsorted:");
        print(numbers);

        mySort.sort(numbers);
        System.out.println("\nNumbers ascending order:");
        print(numbers);

        mySort.setCallback(desc);
        mySort.sort(numbers);
        System.out.println("\nNumbers descending order:");
        print(numbers);

        MySort newSort = new MySort(){
            @Override
            public void sort(int[] numbers) {
                Arrays.sort(numbers);
            }
        };
        System.out.println("\n\nAnonymous ascending:");
        newSort.sort(numbers);
        print(numbers);

        MySort mySort1 = new MySort(desc);
        mySort1.sort(numbers);
        System.out.println("\nNumbers descending order:");
        print(numbers);

    }
}
