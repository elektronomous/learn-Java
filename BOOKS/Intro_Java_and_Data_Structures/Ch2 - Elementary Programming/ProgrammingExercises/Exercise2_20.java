import java.util.Scanner;
/*
(Financial application: calculate interest) If you know the balance and the 
annual percentage interest rate, you can compute the interest on the next monthly 
payment using the following formula:
    
        interest = balance * (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate 
and displays the interest for the next month. Here is a sample run: 
\Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
The interest is 2.91667
*/

public class Exercise2_20 {
    public static void main(String[] args) {
        // Create a Scanner Object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter balance and interest rate (e.g., 3 for 3%)
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble(),
               annualInterestRate = input.nextDouble();

        // Compute the interest
        double interest = balance * (annualInterestRate/1200);

        System.out.println("The interest is " + interest);

        input.close();
    }
}