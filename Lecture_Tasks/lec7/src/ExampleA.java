//Example A shows how to inherit an inner class only

class WithInner{
    class Inner{} // inner class to inherit
}

class InheritInner extends WithInner.Inner{
    //extending the inner class
    //!InheritInner(){}
    // Will not compile
    InheritInner(WithInner wi){
        wi.super(); // reference to the outer class required
    }
}

public class ExampleA {
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
