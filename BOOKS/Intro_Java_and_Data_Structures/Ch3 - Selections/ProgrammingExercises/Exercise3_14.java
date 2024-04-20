/*
(Game: heads or tails) Write a program that lets the user guess whether the flip
of a coin results in heads or tails. The program randomly generates an integer
0 or 1, which represents head or tail. The program prompts the user to enter a
guess, and reports whether the guess is correct or incorrect.
*/

import java.util.Scanner;

public class Exercise3_14 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter head or tails
        System.out.println("Head: 1 | Tail: 0");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == ((int)(Math.random() * 2)))
            System.out.println("You pick the correct choice: " + choice);
        else 
            System.out.println("You pick the wrong choice");
        
        input.close();
    }
}