import java.util.Scanner;
/*
(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display
that the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.

The three edge with example:
a = 7, b = 10, c = 5

a + b > c => 7 + 10 > 5 => 17 > 5 => True
a + c > b => 7 + 5 > 10 => 12 > 10 => True
b + c > a => 10 + 5 > 7 => 15 > 7 => True

That's valid triangle
*/


public class Exercise3_19 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 3 edges triangel
        System.out.print("Enter three edges of triangle: ");
        double firstEdge = input.nextDouble();
        double secondEdge = input.nextDouble();
        double thirdEdge = input.nextDouble();

        if (/* 3 rules that's the input is valid */
            (firstEdge + secondEdge > thirdEdge) &&
            (firstEdge + thirdEdge > secondEdge) &&
            (secondEdge + thirdEdge > firstEdge)
           )
            // Compute and show the perimeter
            System.out.println("The perimeter: " + (firstEdge + secondEdge + thirdEdge));
        else
            System.out.println("You've enter the invalid edges for triangle");
        
        input.close();
    }
}