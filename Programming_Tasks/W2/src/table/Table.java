package table;

import java.util.Scanner;

public class Table {
    private double a; // start of the interval
    private double b; // end of the interval
    private int step; // step for increment

    public Table(double a , double b , int step) {
        setA(a);
        setB(b);
        setStep(step);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getStep() {
        return step;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setStep(int step) {
        if(step > 0){
            this.step = step;
        }else{
            this.step = 1;
        }
    }

    public void makeTable(){
        Scanner input = new Scanner(System.in); // read Enter

        int counter = 0; // count to 20
        double x; // current value to calculate
        double size; // size of interval

        x = a;
        size = (b - a) / step;
        System.out.println("x\t\tF(x)"); // table header
        do{
            System.out.printf("%6.4f\t%6.4f\n" , x
                    , (x - 2) * (x - 2) / (x * x + 1) );
            counter++;
            if(counter >= 20){
                System.out.println("Press Return to continue....");
                input.nextLine();
                counter = 0;
            }
            x += size;

        }while(x <= b);
    }
}
