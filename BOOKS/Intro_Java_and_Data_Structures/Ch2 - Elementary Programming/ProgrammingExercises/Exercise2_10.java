/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is

        Q = M * (finalTemperature – initialTemperature) * 4184

where M is the weight of water in kilograms, initial and final temperatures are in
degrees Celsius, and energy Q is measured in joules. Here is a sample run:

Enter the amount of water in kilograms: 55.5
Enter the initial temperature: 3.5
Enter the final temperature: 10.5
The energy needed is 1625484.0
*/

import java.util.Scanner;

public class Exercise2_10 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // We have const here
        final double TEMPCONSTANT = 4184;
        // Prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kg: ");
        double waterMass = input.nextDouble();
        // Prompt the user to enter the initial and final degree in celcius
        System.out.print("Enter the initial and final degree in celcius: ");
        double initDegree = input.nextDouble();
        double finalDegree = input.nextDouble();

        // Compute the joules
        double joules = waterMass * (finalDegree - initDegree) * TEMPCONSTANT;

        // Show the result
        System.out.println("The energy needed is " + joules);

        input.close();
    }
}