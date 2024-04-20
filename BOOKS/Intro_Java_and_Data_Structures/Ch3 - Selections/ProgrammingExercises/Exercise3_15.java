/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a 
threedigit integer. The program prompts the user to enter a three-digit 
integer and determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
   $10,000.
2. If all digits in the user input match all digits in the lottery number, the award
   is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award
   is $1,000.
*/

import java.util.Scanner;

public class Exercise3_15 {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int)(Math.random() * 1000);
        System.out.println(lottery);

        // Prompt the user to enter a gues
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int digitGuess = input.nextInt();

        // seperate the digits
        int digit1 = digitGuess / 10 / 10;
        int digit2 = digitGuess / 10 % 10;
        int digit3 = digitGuess % 10;

        // seperate the lottery
        int digitLoterry1 = lottery / 10 / 10;
        int digitLoterry2 = lottery / 10 % 10;
        int digitLoterry3 = lottery % 10;

        
        // rules (1)
        if (digit1 == digitLoterry1 && digit2 == digitLoterry2 && digit3 == digitLoterry3)
            System.out.println("You won $10000");
        else if (
                 ((digit1 == digitLoterry1) || (digit1 == digitLoterry2) || (digit1 == digitLoterry3)) &&
                 ((digit2 == digitLoterry1) || (digit2 == digitLoterry2) || (digit2 == digitLoterry3)) &&
                 ((digit1 == digitLoterry1) || (digit1 == digitLoterry2) || (digit1 == digitLoterry3))
                )
            System.out.println("You won $3000");
        else if (
            ((digit1 == digitLoterry1) || (digit1 == digitLoterry2) || (digit1 == digitLoterry3)) ||
            ((digit2 == digitLoterry1) || (digit2 == digitLoterry2) || (digit2 == digitLoterry3)) ||
            ((digit1 == digitLoterry1) || (digit1 == digitLoterry2) || (digit1 == digitLoterry3))
           )
           System.out.println("You won $1000");
        else
           System.out.println("You lost");
        
        
        input.close();
    }
}