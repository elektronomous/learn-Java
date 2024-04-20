/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms. 
The program prompts the user to enter a number in pounds, converts it to kilograms,
and displays the result. One pound is 0.454 kilogram. Here is a sample run:
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
*/

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // We have constant for one pound = 0.454 kilogram
        final double ONEPOUNDTOKILOMETERS = 0.454;
    
        // prompt user to enter pounds
        System.out.print("Enter a value for pounds: ");
        double pounds = input.nextDouble();

        // Convert the pound to kilometers
        double kilometers = pounds * ONEPOUNDTOKILOMETERS;

        // Shows the result
        System.out.println(pounds + " pounds = " + kilometers + " kg");

        input.close();
    }
}