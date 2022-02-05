package PackageData;

public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        //output String representation of packageData
        System.out.printf("After instatiation: \n%s\n" , packageData);

        //change package access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye";

        //output String representation of packageData
        System.out.printf("\nAfter changing values: \n%s\n" , packageData);
    }//end main
}//end class PackageDataTest
