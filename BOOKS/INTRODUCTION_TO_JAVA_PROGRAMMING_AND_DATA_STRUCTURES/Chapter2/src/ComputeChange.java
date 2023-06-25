import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // Create a scanner class
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double (e.g., 11.56): $");
        double amount = input.nextDouble();

        // convert it to cents
        int remainingAmount = (int)(amount * 100);

        // find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        // find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        // find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        // find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        // find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " is consists of ");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

        input.close();
    }
}