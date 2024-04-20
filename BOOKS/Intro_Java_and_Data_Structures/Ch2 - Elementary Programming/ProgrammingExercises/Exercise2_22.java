import java.util.Scanner;
/*
(Financial application: monetary units) Rewrite Listing 2.10, 
ComputeChange.java, to fix the possible loss of accuracy when converting 
a double value to an int value. Enter the input as an integer whose last 
two digits represent the cents. For example, the input 1156 represents 11
dollars and 56 cents.
*/

public class Exercise2_22 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);
        
        // read the money the user enter
        System.out.print("Enter the dollar in integer form: ");
        int dollar = input.nextInt();

        // Compute the cents
        int cents = dollar % 100;
        dollar /= 100;

        // Compute the dollar and the cents
        System.out.println("The dollar $" + dollar + " and " + cents + " cents");
        
        input.close();
    }
}