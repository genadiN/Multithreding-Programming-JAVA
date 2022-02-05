import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list= new ArrayList<>(); // for distinct numbers;

        //1st way;
//        int number ; // for double
//        System.out.print("Enter number: ");
//        number = input.nextInt();
//        while(number != 0){
//            if(!(list.contains(number) )){
//                list.add(number);
//            }
//            System.out.print("Next number: ");
//            number = input.nextInt();
//        }
//        System.out.println("Distinct numbers: " + list);
        // 2nd way
//        int number ; // for double
//        System.out.print("Enter number: ");
//        number = input.nextInt();
//        while(number != 0){
//            list.add(number);
//            System.out.print("Next number: ");
//            number = input.nextInt();
//        }
//        HashSet<Integer> set = new HashSet<>(list); // distinct
//        System.out.println("Distinct numbers: " + set);
        // 3rd way
        System.out.print("Enter number sequence: ");
        // 1.1 23.5 4.4       4.4 3.1     3.3   0 3.1 2.2
        // 1,2,3,4,2,1,2,0,3,5
        String line =  input.nextLine();
        String[] numbersString = line.split("\\s+|,") ;// regex = regulqren izraz // more spaces = \\s+
        double[] numbers = new double[numbersString.length];

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = Double.parseDouble((numbersString[i]));
            if(numbers[i] == 0){
                System.out.print("Distinct numbers " + list);
                System.exit(0);
            }
            if(!list.contains(numbers[i])){
                list.add(numbers[i]);
            }
        }

    }
}
