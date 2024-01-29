import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args) {
        // 1. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // 2. Swap number if number1 less than number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the user to answer "What is number1 - number2?"
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        //    Create a Scanner to read values from users
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (answer == (number1 - number2))
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }

        input.close();
    }
}