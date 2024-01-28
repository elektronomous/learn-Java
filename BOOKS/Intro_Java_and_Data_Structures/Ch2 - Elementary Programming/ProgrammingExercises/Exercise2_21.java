import java.util.Scanner;
/*
(Financial application: calculate future investment value) Write a program that 
reads in investment amount, annual interest rate, and number of years and 
displays the future investment value using the following formula:

        futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12

For example, if you enter amount 1000, annual interest rate 3.25%, and number 
of years 1, the future investment value is 1032.98.
Here is a sample run: 
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Future value is $1043.92
*/

public class Exercise2_21 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the amount to be investment
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        // Prompt user to enter annual interest rate
        System.out.print("Enter annual interest rate in %: ");
        double annualInterest = input.nextDouble();
        // Get the monthly interest rate
        double monthlyInterestRate = 1 + (annualInterest/100/12);

        // Prompt user to enter how many years user would invest
        System.out.print("Enter number of years: ");
        double yearsInvestment = input.nextDouble();

        // Compute the futureInvestmentValue
        double futureInvestmentValue = investmentAmount * Math.pow(monthlyInterestRate, yearsInvestment*12);
        // make the value to show only 2 decimal digit
        futureInvestmentValue = ((int)(futureInvestmentValue*100)/100.0);

        // Display the future values
        System.out.println("The future value is $" + futureInvestmentValue);

        input.close();
    }
}