import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        // If there's remaining amount after we divided it, we'll use it to find quarters
        remainingAmount %= 100;     

        // find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        // If there's remaining amount after we divided it, we'll use it to find dimes
        remainingAmount %= 25;

        // find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        // If there's remaining amount after we divided it, we'll use it to find nickels
        remainingAmount %= 10;

        // find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        // If there's remaining amount after we divided it, we'll use it to find pennies
        remainingAmount %= 5;

        // find the number of pennies
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

        input.close();
    }
}