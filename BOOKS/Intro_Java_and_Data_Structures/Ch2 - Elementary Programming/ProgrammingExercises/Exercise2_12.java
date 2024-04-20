import java.util.Scanner;
/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off 
speed v, you can compute the minimum runway length needed for an airplane to 
take off using the following formula:
        
    length = v^2/( 2 * a)

Write a program that prompts the user to enter v in meters/second (m/s) and 
the acceleration a in meters/second squared (m/s^2), then, displays the minimum 
runway length.
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286
*/



public class Exercise2_12 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the speed and the acceleartion of the airplane
        System.out.print("Enter speed and acccelaration of the airplane: ");
        double speed = input.nextDouble();
        double accelaration = input.nextDouble();

        // Compute the length of the runway
        double lengthRunway = Math.pow(speed, 2) / (2 * accelaration);
        // Make the lengthRunway to only show 2 digit after the decimal point
        lengthRunway = ((int)(lengthRunway*100))/100.0;
        
        // Show the result
        System.out.println("The minimum runway length for this airplane is " + lengthRunway);

        input.close();
    }
}