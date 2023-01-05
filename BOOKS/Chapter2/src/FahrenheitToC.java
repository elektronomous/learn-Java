public class FahrenheitToC {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celcius = (fahrenheit - 32.0) * (5.0 / 9.0);

        System.out.print("Celcius equivalent: ");
        System.out.println(celcius);
    }
}
