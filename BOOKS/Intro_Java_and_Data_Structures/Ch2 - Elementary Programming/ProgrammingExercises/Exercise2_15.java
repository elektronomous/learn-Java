import java.util.Scanner;
/*
(Geometry: distance of two points) Write a program that prompts the user to
enter two points (x1, y1) and (x2, y2) and displays their distance. The formula
for computing the distance is square root of (x2 - x1)^2 + (y2 - y1)^2. Note you can use 
Math.pow(a, 0.5) to compute the square root of a. Here is a sample run:

Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194

x = (x2 - x1)(x2 - x1)
  = x2^2 - x2x1 - x1x2 + x1^2
  = x2^2 - 2(x2x1) + x1^2

y = (y2 - y1) (y2 - y1)
  = y2^2 - y1y2 - y1y2 - y1^2
  = y2^2 - 2(y1y2) - y1^2
*/

public class Exercise2_15 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from user
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two points for x and y
        System.out.print("Enter two point x1 and x2: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.print("Enter two points y1 and y2: ");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute the distance
        double x = Math.pow(x2,2.0) - (2 * (x2 * x1)) + Math.pow(x1,2.0);
        double y = Math.pow(y2,2.0) - (2 * (y2 * y1)) + Math.pow(y1,2.0);
        double distance = Math.pow(x + y, (1/2.0));

        // Display the distance 
        System.out.println("The distance between the two points: " + distance);

        input.close();
    }
}