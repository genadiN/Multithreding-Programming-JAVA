package Task3Lab5;

public class Rational {
    private int numerator;
    private int denominator;

    // Default constructor
    public Rational(){
       this(1, 1);
    }

    // Constructor with parameters
    public Rational(int numerator , int denominator){

        int divisor = greatestCommonDivisor(Math.abs(numerator) , Math.abs(denominator) );
        if(denominator < 0){
           denominator = -denominator;
           numerator = -numerator;
        }
        setNumerator(numerator / divisor);
        setDenominator(denominator / divisor);

    }

    // Getters
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    // Setters
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if( denominator > 0){
            this.denominator = denominator;
        }
    }

    // Greatest common divisor of two numerator and denominator
    public int greatestCommonDivisor(int numerator , int denomirator){
        if( denomirator == 0){
            return numerator;
        }
        return greatestCommonDivisor(denomirator , numerator % denomirator);
    }

    // Plus function
    public Rational plus(Rational number){
        System.out.printf("Rational plus function:%n");
        int divisor = greatestCommonDivisor(
                this.denominator , number.denominator);
        int numerator =( this.numerator * number.denominator
                + this.denominator * number.numerator) / divisor;
        int denominator = this.denominator * number.denominator / divisor;
        return new Rational(numerator , denominator);
    }

    // Minus function
    public Rational minus(Rational number){
        System.out.printf("Rational minus function:%n");
        int divisor = greatestCommonDivisor
                (this.denominator , number.denominator );

        int numerator = this.numerator * number.denominator
                - this.denominator * number.numerator;
        numerator /= divisor;
        int denominator = this.denominator * number.denominator / divisor;
        return new Rational(numerator , denominator);
    }

    // Multiplication function
    public Rational multiplication(Rational number){
        System.out.printf("Rational multiplication function: %n");
        int numerator = this.numerator * number.numerator;
        int denominator = this.denominator * number.denominator;
        int divisor = greatestCommonDivisor(numerator , denominator);
        return new Rational(numerator / divisor , denominator / divisor);
    }

    // Dividing function
    public Rational dividing(Rational number){
        System.out.printf("Rational dividing function: %n");
        int numerator = this.numerator * number.denominator;
        int denominator = this.denominator * number.numerator;
        int divisor = greatestCommonDivisor(numerator , denominator);
        return new Rational(numerator / divisor , denominator / divisor);
    }

    @Override
    public String toString() {
        return String.format("Num / Denom %n%d     %d" , getNumerator() , getDenominator());
    }
}
