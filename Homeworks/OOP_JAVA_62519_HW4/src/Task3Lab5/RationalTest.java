package Task3Lab5;

public class RationalTest {
    public static void main(String[] args) {
        Rational object1 = new Rational(3 , 4);
        Rational object2 = new Rational( 5 , 6);

        Rational answer = object1.plus(object2);
        System.out.println(answer);

        answer = object1.minus(object2);
        System.out.println(answer);

        answer = object1.multiplication(object2);
        System.out.println(answer);

        answer = object1.dividing(object2);
        System.out.println(answer);

    }
}
