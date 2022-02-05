package Analysis;

import java.util.Scanner;

public class Analysis {
    public void processExamResults(){
        Scanner input = new Scanner( System.in );

        // initializing variables in declarations
        int passes = 0; // number of passes
        int failures = 0; // number of failures
        int studentCounter = 1; // student counter

        int result; // onew exam result

        while(studentCounter <= 10 ){
            System.out.print("Enter result (1 = pass , 2 = fail): " );
            result = input.nextInt();
            if(result == 1){
                passes += 1;
            }else{
                failures += 1;
            }
            studentCounter += 1;
        }// end while

        System.out.printf("Passed: %d%nFailed: %d%n" , passes , failures);
        if(passes > 8){
            System.out.println("Raise Tuition");
        }
    }// end method processExamResults
} // end class Analysis
