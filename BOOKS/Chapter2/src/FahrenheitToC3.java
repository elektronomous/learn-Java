import jpb.*
;
public class FahrenheitToC3 {
    public static void main(String[] args) {
        final double FREEZING_POINT = 32.0;
        final double DEGREE_RATIO = 5.0/9.0;


        SimpleIO.prompt("Enter Fahrenheit temperatur: ");
        String userInput = SimpleIO.readLine();

        double fahrenheit = Convert.toDouble(userInput);
        double celcius = (fahrenheit - FREEZING_POINT) * DEGREE_RATIO;

        System.out.println("Celcius equivalent: " + celcius);

    }
}
