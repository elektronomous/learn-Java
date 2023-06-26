package Fract;

public class Fraction {
    private int numerator;      // Numerator of fraction
    private int denominator;    // Denumerator of fraction

    // constructor
    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    // methods will go here
    // getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // setters
    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int denom) {
        denominator = denom;
    }

    // addition
    public Fraction add(Fraction f) {
        int num = numerator * f.getDenominator() +
                  denominator * f.getNumerator();

        int denom = denominator * f.getDenominator();

        Fraction result = new Fraction(num, denom);

        return result;
    }

    // multiplication
    public Fraction multiply(Fraction f) {
        // you could could access directly to the instance variable
        // because this method belong to the same class as the parameter
        // you've specified
        int num = numerator * f.numerator;
        int denom = denominator * f.denominator;


        return new Fraction(num, denom);
    }

    // division
    public Fraction divide(Fraction f) {
        int num = numerator * f.denominator;
        int denom = denominator * f.numerator;

        return new Fraction(num, denom);
    }

    // substraction
    public Fraction substract(Fraction f) {
        int num = numerator * f.getDenominator() -
                  denominator * f.getNumerator();
        int denom = denominator * f.denominator;

        return new Fraction(num, denom);

    }

    public String toString() {
        return (numerator + "/" + denominator);
    }


}