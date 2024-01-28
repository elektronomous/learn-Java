import java.util.Scanner;
/*
(Financial application: compound value) Suppose you save $100 each month into 
a savings account with an annual interest rate of 5%. Thus, the monthly interest 
rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
        
        100 * (1 + 0.00417) = 100.417

After the second month, the value in the account becomes

        (100 + 100.417) * (1 + 0.00417) = 201.252

After the third month, the value in the account becomes
        
        (100 + 201.252) * (1 + 0.00417) = 302.507

and so on. Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Programming Exercise 5.30, you 
will use a loop to simplify the code and display the account value for any month.)
*/

public class Exercise2_13 { 
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // we have annual interest rate and doesn't change
        final double ANNUALINTEREST = 0.05/12;

        // Prompt user to enter monthly saving
        System.out.print("Enter monthly saving in $: ");
        double monthlySaving = input.nextDouble();
        double totalMonthSaving = monthlySaving * (1 + ANNUALINTEREST); // first month

        // get the next 5-months saving
        totalMonthSaving += monthlySaving;
        totalMonthSaving *= (1 + ANNUALINTEREST);   // second Month
        totalMonthSaving += monthlySaving;
        totalMonthSaving *= (1 + ANNUALINTEREST);   // third Month
        totalMonthSaving += monthlySaving;
        totalMonthSaving *= (1 + ANNUALINTEREST);   // fourth Month
        totalMonthSaving += monthlySaving;
        totalMonthSaving *= (1 + ANNUALINTEREST);   // fifth Month
        totalMonthSaving += monthlySaving;
        totalMonthSaving *= (1 + ANNUALINTEREST);   // six Month
        
        // Display two-digit after decimal point
        totalMonthSaving = ((int)(totalMonthSaving * 100)/100.0);
        // Display the result
        System.out.println("After the sixth month, the account value is $" + totalMonthSaving);

        input.close();
    }
}