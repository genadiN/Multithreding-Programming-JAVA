package PackageData;

public class PackageData {
    int number; // package access instance variable
    String string; // package access instance variables

    //constructor
    public PackageData(){
        number = 0;
        string = "Hello";
    }//end PackageData constructor

    //return Package object String representation
    public String toString(){
        return String.format("number: %d; stirng: %s", number, string);
    }//end method toString
}//end class PackageData
