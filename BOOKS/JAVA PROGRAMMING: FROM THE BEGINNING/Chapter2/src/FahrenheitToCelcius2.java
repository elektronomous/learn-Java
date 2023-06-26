public class FahrenheitToCelcius2 {
    public static void main(String[] args) {
        final double FREEZING_POINT = 32.0;
        final double DEGREE_RATIO = 5.0 / 9.0;

        double fahrenheit = 98.6;
        double celcius = (fahrenheit - FREEZING_POINT) * DEGREE_RATIO;

        System.out.print("The equivalent celcius: ");
        System.out.println(celcius);
    }
}
