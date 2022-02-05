package Payablee;

import AbstractClasses.SalariedEmployee;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        // create four-element Pauable array
        Payable payableObjects[] = new Payable[ 4 ];

        //populate array with objects that implement Payable
        payableObjects[ 0 ] = new Invoice("01234","seat", 2, 375.00);
        payableObjects[ 1 ] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[ 2 ] = new SalariedEmployee("John" , "Smith", "111-11-1111", 800.00);
        payableObjects[ 3 ] =
                new SalariedEmployee("Lisa" , "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoices and Employees processed polymorphicallyL\n");

        //generally process each element in array payableObjects
        for(Payable objects : payableObjects){
            // output currentPayable and its appropriate payment amount
            System.out.printf("%s \n%s: $%,.2f\n\n",
                    objects.toString(),
                    "payment due", objects.getPaymentAmount() );
        }//end for
    }//end main
}//end class PayableInterfaceTest
