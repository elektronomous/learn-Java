/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:
        
        a = (v1 - v0) / t

Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. Here is a sample run:
*/

import java.util.Scanner;

public class Exercise2_9 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter velocity and the time span
        System.out.print("Enter starting velocity in meters/second: ");
        double startingVelocity = input.nextDouble();
        System.out.print("Enter the ending velocity in meters/second: ");
        double endingVelocity = input.nextDouble();
        
        // prompt the user the time taken to make this change
        System.out.print("Enter the time span: ");
        double timeSpan = input.nextDouble();

        // Compute the accelaration
        double accelaration = (endingVelocity - startingVelocity) / timeSpan;

        // Show the result
        System.out.println("The average accelaration is: " + accelaration);

        input.close();
    }
}