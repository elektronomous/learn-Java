/*
(Sum the digits in an integer) Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:

Enter a number between 0 and 1000: 999
The sum of the digits is 27
*/
import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt a user to enter integer between 0 - 1000:
        System.out.print("Enter number between 0 - 1000: ");
        int number = input.nextInt();
        int remainingNumber = number;

        // to get the unit, you can it by modulation
        int unit = remainingNumber % 10;
        // remove the unit by divide it by 10
        remainingNumber /= 10;
        // now get the tenth
        int tenth = remainingNumber % 10;
        // remove the tenth by divided it by 10
        remainingNumber /= 10;
        // the only remaing is thousand
        // now you add them together
        int total = unit + tenth + remainingNumber;

        System.out.println("The total of " + number + " is " + total);
        input.close();
    }
}