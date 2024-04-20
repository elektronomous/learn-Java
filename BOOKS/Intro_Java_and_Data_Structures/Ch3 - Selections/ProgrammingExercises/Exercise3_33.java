import java.util.Scanner;

/*
 * (Financial: compare costs) Suppose you shop for rice in two different
 * packages.
 * You would like to write a program to compare the cost. The program prompts
 * the
 * user to enter the weight and price of each package and displays the one with
 * the
 * better price. Here is a sample run:
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price.
 *
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price.
 * 
 */

class Exercise3_33 {
    public static void main(String[] args) {
        // Create a scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the weight and price for package 1 and 2
        System.out.print("Enter weight and price for package 1: ");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for packet 2: ");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();

        // The algorithm for finding if two packages have the same price is
        int result = (int) ((weight1 * price2) - (price1 * weight2));

        if (result > 0)
            System.out.println("The package 2 has a better price");
        else if (result < 0)
            System.out.println("The package 1 has a better price");
        else
            System.out.println("The two packages have the same price");

        input.close();
    }
}