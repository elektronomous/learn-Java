import java.util.Scanner;
/*
(Cost of shipping) A shipping company uses the following function to calculate
the cost (in dollars) of shipping based on the weight of the package (in pounds).

             |3.5,  if 0 < w <= 1
     c(w) --/ 5.5,  if 1 < w <= 3
            \ 8.5,  if 3 < w <= 10
            | 10.5, if 10 < w <= 20

Write a program that prompts the user to enter the weight of the package and
displays the shipping cost. If the weight is negative or zero, display a message
“Invalid input.” If the weight is greater than 20, display a message “The package
cannot be shipped.”
*/

public class Exercise3_18 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the weight of the package
        System.out.print("Enter the weight of the package(pounds): ");
        double weight = input.nextDouble();

        if (weight < 0 || weight > 20)
            System.out.println("The package cannot be shipped.");
        else if (weight <= 1)
            System.out.println("The shipping cost is $3.5");
        else if (weight <= 3)
            System.out.println("The shipping cost is $5.5");
        else if (weight <= 10)
            System.out.println("The shipping cost is $10");
        else 
            System.out.println("The shipping cost is $10.5");
        
        input.close();
    }
}