/*
(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
compute the wind-chill temperature. The formula is valid for temperatures in the
range between -58°F and 41°F and wind speed greater than or equal to 2. Write
a program that prompts the user to enter a temperature and a wind speed. The
program displays the wind-chill temperature if the input is valid; otherwise, 
it displays a message indicating whether the temperature and/or wind speed is invalid.
*/

import java.util.Scanner;

public class Exercise3_20 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter degree in fahrenheit
        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Prompt user to enter the windspeed
        System.out.print("Enter the windspeed: ");
        double windSpeed = input.nextDouble();

        if (fahrenheit > -58 && fahrenheit < 41 && windSpeed > 2) {
            double windChill = 35.74 + 0.6215 * fahrenheit - 35.75 * (Math.pow(windSpeed, 0.16)) +
                               0.4275 * fahrenheit * (Math.pow(windSpeed, 0.16));
            
            System.out.println("The wind chill is " + windChill);
        }else
            System.out.println("You've enter invalid fahrenheit or windspeed");
        
        input.close();
    }
}