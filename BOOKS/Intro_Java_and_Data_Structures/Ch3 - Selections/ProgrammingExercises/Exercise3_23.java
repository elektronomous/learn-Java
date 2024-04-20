import java.util.Scanner;
/*
(Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. 

(Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less 
than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal
to 5.0 / 2. Test your program to cover all cases.) Here are two sample runs:

        Enter a point with two coordinates: −4.9 2.49
        Point (−4.9, 2.49) is in the rectangle
        Enter a point with two coordinates: −5.1 −2.4
        Point (−5.1, −2.4) is not in the rectangle
*/


public class Exercise3_23 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter x and y coordinate
        System.out.print("Enter x and y coordinate: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        final double RECTANGLE_WIDTH = 10.0;
        final double RECTANGLE_HEIGHT= 5.0;

        if (Math.abs(x) < (RECTANGLE_WIDTH /2) && Math.abs(y) < (RECTANGLE_HEIGHT / 2))
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        
        input.close();
    }
}