/*
(Use the &&, ||, and ^ operators) Write a program that prompts the user to
enter an integer and determines whether it is divisible by 5 and 6, whether it is
divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a
sample run of this program:

    Enter an integer: 10
    Is 10 divisible by 5 and 6? false
    Is 10 divisible by 5 or 6? true
    Is 10 divisible by 5 or 6, but not both? true

*/

import java.util.Scanner;

public class Exercise3_26 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int anInteger = input.nextInt();

        // Evaluate each logic
        boolean isDivisibleBy5and6 = (anInteger % 5 == 0) && (anInteger % 6 == 0);
        boolean isDivisibleBy5or6 = (anInteger % 5 == 0) || (anInteger % 6 == 0);
        boolean isDivisibleBy5xor6 = (anInteger % 5 == 0) ^ (anInteger % 6 == 0);

        // show the result
        System.out.println("Is " + anInteger + " divisible by 5 and 6? " + isDivisibleBy5and6);
        System.out.println("Is " + anInteger + " divisible by 5 or 6? " + isDivisibleBy5or6);
        System.out.println("Is " + anInteger + " divisible by 5 or, but not both 6? " + isDivisibleBy5xor6);
        
        input.close();
    }
}