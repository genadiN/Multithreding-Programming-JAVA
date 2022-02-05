package Task6Lab6a20;

public class A implements Four_interface{

    @Override
    public void firsMethod() {
        System.out.println("This is method 1");
    }

    @Override
    public void secondMethod() {
        System.out.println("This is method 2");
    }

    @Override
    public void m() {
        System.out.println("This is m() method");
    }

    @Override
    public void thirdMethod() {
        System.out.println("This is method 3");
    }

    @Override
    public void fourthMethod() {
        System.out.println("This is method 4");
    }

    @Override
    public void fifthMethod() {
        System.out.println("This is method 5");
    }

    @Override
    public void sixthMethod() {
        System.out.println("This is method 6");
    }

    public void First_Interface(First_Interface ob){
        ob.firsMethod();;
        ob.secondMethod();;
    }

    public void Second_Interface(Second_interface ob){
        ob.thirdMethod();
        ob.fourthMethod();
    }

    public void Third_Interface(Third_Interface ob){
        ob.fifthMethod();
        ob.sixthMethod();
    }

    public void Four_Interface(Four_interface ob){
      ob.firsMethod();
      ob.secondMethod();
      ob.thirdMethod();
      ob.fourthMethod();
      ob.fifthMethod();
      ob.sixthMethod();
      ob.m();
    }

    public void classB(B ob ){
        ob.m();
    }
}
