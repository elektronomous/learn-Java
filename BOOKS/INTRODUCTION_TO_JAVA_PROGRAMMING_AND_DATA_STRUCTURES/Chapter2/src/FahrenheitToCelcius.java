import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // convert fahrenheit to celcius
        double celcius = (5.0 / 9) * (fahrenheit - 32);

        // display the result
        System.out.println("Fahrenheit " + fahrenheit + " is " + celcius + " in celcius.");

        input.close();
    }
}