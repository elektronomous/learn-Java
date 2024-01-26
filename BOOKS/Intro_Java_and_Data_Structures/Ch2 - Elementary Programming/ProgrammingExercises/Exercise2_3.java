/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters
*/

import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // We have constant value of 1 foot = 0.305 meter
        final double ONEFOOTINMETER = 0.305;

        // read the feet's value
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        // convert it to meters
        double meters = feet * ONEFOOTINMETER;
        
        // Shows the result
        System.out.println(feet + " feets = " + meters + " meters");

        input.close();
    }
}