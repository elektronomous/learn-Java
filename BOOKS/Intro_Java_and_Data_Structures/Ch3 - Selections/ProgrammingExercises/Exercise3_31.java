import java.util.Scanner;
/*
(Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the
user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert
from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S.
dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. Here are the sample runs:

    Enter the exchange rate from dollars to RMB: 6.81
    Enter 0 to convert dollars to RMB and 1 vice versa: 0
    Enter the dollar amount: 100
    $100.0 is 681.0 yuan
    Enter the exchange rate from dollars to RMB: 6.81
    Enter 0 to convert dollars to RMB and 1 vice versa: 1
    Enter the RMB amount: 10000
    10000.0 yuan is $1468.43
 */


 public class Exercise3_31 {
    public static void main(String[] args) {
        // Create a Scanner object read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the exchange rate from dollars to rmb
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        // Prompt user to choose whether to convert dollar or vice versa
        System.out.print("Enter 0 to convert dollars to RMB or vice versa: ");
        int choice = input.nextInt();


        switch (choice) {
            case 0:
                // Prompt the user to enter the amount 
                System.out.print("Enter the amount of dollar: ");
                double amountDollar = input.nextDouble();

                System.out.println(amountDollar + "$ is " + (amountDollar * exchangeRate) + " yuan");
                break;
            case 1:
                // Prompt the user to enter the amount 
                System.out.print("Enter the amount of RMB: ");
                double amountRMB = input.nextDouble();
                
                // Display the result to dollar
                System.out.println(amountRMB + " yuan is " + (amountRMB / exchangeRate) + " dollars");
                break;
            default:
                System.out.println("You've enter invalid input");
        }

        input.close();
    }
 }