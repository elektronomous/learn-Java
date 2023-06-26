import Fract.*;

public class TestFraction {
    public static void main(String[] args) {
        Fraction f = new Fraction(4, 8);

        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());
        
        f.setNumerator(5);
        f.setDenominator(7);
        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());

        Fraction f1 = new Fraction(2, 1);
        Fraction f2 = new Fraction(1, 2);

        System.out.println(f1.add(f2).toString());
        System.out.println(f1.substract(f2).toString());
        // we can implicitly called toString like this
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));
    }
}