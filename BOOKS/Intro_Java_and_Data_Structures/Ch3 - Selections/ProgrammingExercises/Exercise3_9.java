import java.util.Scanner;

/*
(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other 9 digits using the following formula:
    
    (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
    d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:
VideoNote
    
    Sort three integers
    Enter the first 9 digits of an ISBN as integer: 013601267
    The ISBN-10 number is 0136012671
    
    Enter the first 9 digits of an ISBN as integer: 013031997
    The ISBN-10 number is 013031997X
*/

public class Exercise3_9 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 9 digits of the ISBN
        System.out.print("Enter 9 digit of the ISBN: ");
        int digits = input.nextInt();
        int digit9 = digits % 10;
        int digit8 = digits / 10 % 10;
        int digit7 = digits / 100 % 10;
        int digit6 = digits / 1000 % 10;
        int digit5 = digits / 10000 % 10;
        int digit4 = digits / 100000 % 10;
        int digit3 = digits / 1000000 % 10;
        int digit2 = digits / 10000000 % 10;
        int digit1;

        // Aware if the user enter the 0-digit in the beginning
        if ((digits / 100000000) == 0)
            digit1 = 0;
        else
            digit1 = digits / 100000000 ;

        // Compute the checksum
        int checksum = digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) +
                       (digit5 * 5) + (digit6 * 6) + (digit7 * 7) + (digit8 * 8) +
                       (digit9 * 9);    
            checksum %= 11;
        
        // Display the result
        System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 +
                           "" + digit4 + "" + digit5 + "" + digit6 + "" + digit7 + "" + 
                           "" + digit8 + "" + digit9 + "" + (checksum == 10 ? "X" : checksum));
        input.close();                
    }
}