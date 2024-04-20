import java.util.Scanner;
/*
(Palindrome integer) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome integer. An integer is palindrome
if it reads the same from right to left and from left to right. A negative integer is
treated the same as a positive integer. Here are sample runs of this program:
   Enter a three-digit integer: 121
   121 is a palindrome
   Enter a three-digit integer: 123
   123 is not a palindrome
*/

public class Exercise3_12 {
   public static void main(String[] args) {
      // Create a Scanner object to read values from users
      Scanner input = new Scanner(System.in);

      // Prompt user to enter 3 integers
      System.out.print("Enter three integers: ");
      int digits = input.nextInt();

      int digit3 = digits % 10;
      int digit2 = digits / 10 % 10;
      int digit1;

      if ((digits / 100) == 0)
         digit1 = 0;
      else if ((digits / 1000) > 0)
         digit1 = digits / 100 % 10;
      else
         digit1 = digits / 100 % 10;
      
      if (digit3 == digit1)
         System.out.println(digit1 + "" + digit2 + "" + digit3 + " is a palindrome");
      else
         System.out.println(digit1 + "" + digit2 + "" + digit3 + " is not a palindrome");
      
      input.close();
         
   }
}