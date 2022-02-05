package MaximumFinder;

import java.util.Scanner;

public class MaximumFinder {
    //obtain three floating point values and locate the maximum value
    public void determineMaximum(){
        Scanner input = new Scanner(System.in);

        //obtain user input
        System.out.print("Enter three floating-point numbers" +
                " values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //determine the maximum value
        //double result = maximum(number1, number2, number3);
        double result = Math.max(number1 , Math.max(number2 , number3));
        System.out.println("Maximum is: " + result);
    }// end method determineMaximum

    public double maximum( double x , double y , double z){
        double maximumValue = x;// assume X as a largest value

        //determine whether Y is greater than maximumValue
        if(y > maximumValue){
             maximumValue = y;
        }

        //determine whether Z is greater than maximumValue
        if(z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }//end method maximum
}//end class MaximumFinder
