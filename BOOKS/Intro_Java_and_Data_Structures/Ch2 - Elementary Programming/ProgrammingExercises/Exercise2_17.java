import java.util.Scanner;
/*
(Science: wind-chill temperature) How cold is it outside? The temperature alone is 
not enough to provide the answer. Other factors including wind speed, relative humidity,
and sunshine play important roles in determining coldness outside. In 2001, 
the National Weather Service (NWS) implemented the new wind-chill temperature 
to measure the coldness using temperature and wind speed. The formula is
    
    twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16

where ta is the outside temperature measured in degrees Fahrenheit, 
      v is the speed  measured in miles per hour, and 
      twc is the wind-chill temperature. 

      The formula cannot  be used for wind speeds below 2 mph or temperatures below -58°F
or above 41°F. Write a program that prompts the user to enter a temperature 
between -58°F and 41°F and a wind speed greater than or equal to 2 then displays 
the wind-chill  temperature. Use Math.pow(a, b) to compute v0.16
. Here is a sample run:
Enter the temperature in Fahrenheit between -58°F and 41°F:  5.3
Enter the wind speed (>= 2) in miles per hour: 6
The wind chill index is -5.56707
*/

public class Exercise2_17 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature
        System.out.print("Enter temperature in Fahrenheit between -58'F and 41'F: ");
        double fahrenheit = input.nextDouble();

        // Prompt the user to enter the wind speed
        System.out.print("Enter the wind speed greater than 2mph: ");
        double windSpeed = input.nextDouble();

        // Compute the wind-chill
        double windChill = 35.74 + 0.6215 * fahrenheit - 35.75 * (Math.pow(windSpeed, 0.16)) +
                           0.4275 * fahrenheit * (Math.pow(windSpeed, 0.16));
        
        // Display the result
        System.out.println("The wind chill index is " + windChill);

        input.close();
    }
}