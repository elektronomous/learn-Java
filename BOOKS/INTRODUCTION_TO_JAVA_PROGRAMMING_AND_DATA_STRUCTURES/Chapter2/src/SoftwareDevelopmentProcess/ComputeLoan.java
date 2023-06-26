package SoftwareDevelopmentProcess;
import java.util.Scanner;

public class ComputeLoan {

    public static void main(String[] args) {
        // create a scanner class
        Scanner input = new Scanner(System.in);

        // enter annual interest rate in percentage, e.g., 7.5
        System.out.print("Enter annual interest rate (e.g., 7.5): ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // enter number of years
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        // calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / 
                                (1 - 1 / Math.pow(
                                                  1 + monthlyInterestRate, 
                                                  numberOfYears * 12)
                                                );
        double totalPayment = monthlyPayment * 12 * numberOfYears;

        // display the result
        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);

        input.close();
    }
}
