import java.util.Scanner;
/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
*/

public class Exercise3_2 {
    public static void main(String[] args) {
        // Generate 3 random numbers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Create a Scanner object to read user's answer
        Scanner input = new Scanner(System.in);
        // Prompt user to enter the result
        System.out.print(number1 + " + " + number2 + " + " + number3 + " is ");
        int result = input.nextInt();

        if (result == (number1 + number2 + number3))
            System.out.println("You're correct!");
        else
            System.out.println("You're wrong, The answer is " + (number1 + number2 + number3));
        
        input.close();
    }
}