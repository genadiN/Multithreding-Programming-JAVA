package NestedClass;

//Creating objects fom inner classes
public class NestedClass {
    private String name = "instance name";
    private static String staticName = "static name";

    public static void main(String[] args) {
        NestedClass nt = new NestedClass();
        //create object from inner classes
        NestedClass.NestedOne nco = nt.new NestedOne();
        NestedClass.NestedTwo nct =
                new NestedClass.NestedTwo();
    }
    class NestedOne{ // a non - static inner class
        NestedOne() {// gets full access to outer class
            System.out.println(name);
            System.out.println(staticName);
        }
    }
    static class NestedTwo{//a static inner class
        NestedTwo(){// gets full access to outer class
            System.out.println(staticName);
        }

    }
}
