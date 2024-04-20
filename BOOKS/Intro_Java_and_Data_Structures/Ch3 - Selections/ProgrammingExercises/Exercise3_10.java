import java.util.Scanner;
/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly 
generates a subtraction question. Revise the program to randomly
generate an addition question with two integers less than 100. 
*/


public class Exercise3_10 {
    public static void main(String[] args) {
        // Generate random numbers
        int number1 = (int)(Math.random() * 101);
        int number2 = (int)(Math.random() * (101 - number1));

        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the result
        System.out.print("What is " + number1 + " + " + number2 + " = ");
        int answer = input.nextInt();

        if (answer == (number1 + number2))
            System.out.println("You're correct!");
        else
            System.out.println("You're wrong");
        
        input.close();
    }
}