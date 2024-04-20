import java.util.Scanner;
/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
*/

public class Exercise3_8 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three integers
        System.out.print("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Create a temporary variable
        int temp;

        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;

            if (number2 > number3) {
                temp = number2;
                number2 = number3;
                number3 = temp;
            }
        } else if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;

            if (number2 > number3) {
                temp = number2;
                number2 = number3;
                number3 = temp;
            }
        } else if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        
        System.out.println("Non-decreasing order: " + number1 + " " + number2 + " " + number3);

        input.close();
    }
}