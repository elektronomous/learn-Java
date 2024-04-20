/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax^2 + bx + c = 0 can be obtained using the following formula:
                 ________
    r1 = (-b + \/b² - 4ac) / 2a
and              _________
    r2 = (-b - \/b² - √4ac) / 2a

b² - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative, 
the equation has no real roots. Write a program that prompts the user to enter values for 
a, b, and c and displays the result based on the discriminant. If the discriminant is 
positive, display two roots. If the discriminant is 0, display one root. Otherwise, display
“The equation has no real roots.” Note you can use Math.pow(x, 0.5) to compute 2x. Here are
some sample runs:

Enter a, b, c: 1.0 3 1
The equation has two roots −0.381966 and −2.61803

*/
import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter values of a, b, c
        System.out.print("Enter values of a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Compute the discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double root1 = 0,
               root2 = 0;

        if (discriminant == 0) {
            root1 = (-b + Math.pow(b * b - 4 * a *c, 0.5)) / (2 * a);
            // Display the result
            System.out.println("The equation has one roots: " + root1);
        }
        else if (discriminant > 0) {
            root1 =  (-b + Math.pow(b * b - 4 * a *c, 0.5)) / (2 * a);
            root2 = (-b - Math.pow(b * b - 4 * a *c, 0.5)) / (2 * a);
            
            // Display the result
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        } 
        else 
            System.out.println("The equation has no real roots");
        
        input.close();
        
    }
}
