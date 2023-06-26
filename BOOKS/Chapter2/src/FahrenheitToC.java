public class FahrenheitToC {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celcius = (fahrenheit - 32.0) * (5.0/9.0);
        /* The way you create the 32.0 and 5.0/9.0 is hardcoded
         * it doesn't have a meaning, make your user hard to read it
         * so we create constant for both value
         */

        System.out.print("Celcius equivalent: ");
        System.out.println(celcius);
    }
}
