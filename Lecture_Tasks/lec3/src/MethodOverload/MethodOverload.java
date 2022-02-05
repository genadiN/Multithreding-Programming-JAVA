package MethodOverload;

public class MethodOverload {
    public void testOverloadedMethods(){
        System.out.printf("Square of integer 7 is %d\n" , square(7));
        System.out.printf("Square of double 7.5 is %.3f\n" , square(7.5));
    }// end method testOverloadedMethods

    //square method with int argument
    public int square(int number){
        System.out.printf("\nCalled square with int argument: %d\n" ,
              number);
        return number * number;
    }

    // square method with double argument
    public double square(double doubleValue){
        System.out.printf("\nCalled square with double argument: %.3f\n" ,
                doubleValue);
        return doubleValue * doubleValue;
    }//end method square with double argument
}//end class MethodOverloaded
