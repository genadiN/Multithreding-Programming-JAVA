package Task6Lab6a20;

public class Test {
    public static void main(String[] args) {
        A object1 = new A();
        A object2 = new A();
        B object3 = new B();

        object1.First_Interface(object2);
        object1.Second_Interface(object2);
        object1.Third_Interface(object2);

        object1.classB(object3);
    }

}
