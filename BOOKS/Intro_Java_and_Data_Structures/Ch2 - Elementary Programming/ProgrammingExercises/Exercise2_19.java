import java.util.Scanner;
/*
(Geometry: area of a triangle) Write a program that prompts the user to enter 
three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays 
its area. The formula for computing the area of a triangle is
        
        s = (side1 + side2 + side3)/2; 
        area = squareRoot(s(s - side1)(s - side2)(s - side3))

Here is a sample run:
Enter the coordinates of three points separated by spaces
like x1 y1 x2 y2 x3 y3: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6 

The formula of area of triangle in coordinate geometry is:
A = 1/2 * (x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2))
*/

public class Exercise2_19 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter x1, y1, x2, y2, x3, y3
        System.out.print("Enter the coordinate of three point seperated by space " +
                        "like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble(),
               y1 = input.nextDouble(),
               x2 = input.nextDouble(),
               y2 = input.nextDouble(),
               x3 = input.nextDouble(),
               y3 = input.nextDouble();

        double areaTriangle = 1/2.0 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));

        // Display the result of the area of the Triangle 
        System.out.println("The area of triangle is " + areaTriangle);

        input.close();
    }
}