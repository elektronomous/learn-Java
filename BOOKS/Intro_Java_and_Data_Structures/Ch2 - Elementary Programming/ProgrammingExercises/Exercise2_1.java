/* (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
   double value from the console, then converts it to Fahrenheit, and displays the
   result. The formula for the conversion is as follows:
   fahrenheit = (9 / 5) * celsius + 32
   Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
   Here is a sample run:

    Enter a degree in Celsius: 43.5
    43.5 Celsius is 110.3 Fahrenheit
*/

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter celcius temperature
        System.out.print("Enter a celcius temp: ");
        double celciusDegree = input.nextDouble();

        // Count the fahrenheit
        double fahrenheit = (9 / 5.0) * celciusDegree + 32;

        // Shows the result
        System.out.println("Temperature " + celciusDegree + " celcius degree: " + fahrenheit + " fahrenheit");

        input.close();
    }
}