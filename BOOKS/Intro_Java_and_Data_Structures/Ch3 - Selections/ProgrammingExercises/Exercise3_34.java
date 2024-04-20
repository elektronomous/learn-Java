import java.util.Scanner;

/*
 * 3.34 (Geometry: point on line segment) Exercise 3.32 shows how to test
 * whether a
 * point is on an unbounded line. Revise Exercise 3.32 to test whether a point
 * is on
 * a line segment. Write a program that prompts the user to enter the three
 * points for
 * p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1.
 * Here
 * are some sample runs:
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 * Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */

class Exercise3_34 {
    public static void main(String[] args) {
        // Create a scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the three points
        System.out.print("Enter the three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate the result if the p2 is whether on the line segment from p0 to p1
        // or not.
        double ab = Math.sqrt(Math.pow((x0 - x1), 2) + Math.pow((y0 - y1), 2));
        double ac = Math.sqrt(Math.pow((x0 - x2), 2) + Math.pow((y0 - y2), 2));
        double cb = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        int result = (int) (ab - (ac + cb));

        if (result == 0) {
            System.out.print("(" + x2 + ", " + y2 + ")");
            System.out.print(" is on the line segment from ");
            System.out.print("(" + x0 + ", " + y0 + ") to ");
            System.out.println("(" + x1 + ", " + y1 + ")");
        } else {
            System.out.print("(" + x2 + ", " + y2 + ")");
            System.out.print(" is not on the line segment from ");
            System.out.print("(" + x0 + ", " + y0 + ") to ");
            System.out.println("(" + x1 + ", " + y1 + ")");
        }

        input.close();
    }
}