<<<<<<< HEAD:BOOKS/Chapter2/src/FahrenheitToC3.java
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
=======
import jpb.*;

public class FahrenheitToCelcius3 {
    public static void main(String[] args) {
        final double FREEZING_POINT = 32.0;
        final double DEGREE_RATIO = 5.0/9.0;

        SimpleIO.prompt("Enter the fahrenheit temperature: ");
        String userInput = SimpleIO.readLine();

        double fahrenheit = Convert.toDouble(userInput);
        double celcius = (fahrenheit - FREEZING_POINT) * DEGREE_RATIO;

        System.out.println("The equivalent celcius: " + celcius);
    }
}
>>>>>>> 14a8eae654d6114b5f1b1b907c799373cdc49d07:BOOKS/JAVA PROGRAMMING: FROM THE BEGINNING/Chapter2/src/FahrenheitToCelcius3.java
