package Capture;

public class CaptureTest {
    private static int count = 5; // captured inside the anonymous class
    private String str = "Captured string";
    public void method(String dest){
        //dest is effectively final
        int localVar = 5; // localVar is effectively final
        Wrapping wr = new Wrapping(localVar){
            private String label = dest; // dest is captured here
            public int value(){
                //dest = ""; // // not allowed, dest variable is captured!!
                return super.value() *count;
            }
            public String toString(){
                return str;
            }
        };
        //localVar = 7 // not allowed , localVar is captured!!
        count = 8;
        str = "New captured string"; // allowed
    }
}

