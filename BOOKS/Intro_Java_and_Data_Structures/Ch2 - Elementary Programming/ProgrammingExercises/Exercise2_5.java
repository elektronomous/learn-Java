/*
gratuity = a tip given to a waiter; taxicab driver, etc.
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. Here is a sample run:

Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
*/

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter subtotal and gratuity
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        // Compute the tip
        double tip = subtotal * (gratuity / 100);
        // Compute the total that's include the tip
        double total = subtotal + tip;

        // Show the result
        System.out.println("The gratuity $" + tip + " and total is $" + total);

        input.close();
    }
}