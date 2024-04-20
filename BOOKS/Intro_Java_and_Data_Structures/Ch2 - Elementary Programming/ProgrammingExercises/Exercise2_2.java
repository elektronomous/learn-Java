/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * π
volume = area * length

Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4
*/

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // We have constant PHI
        final double PI = 3.14159;

        // Read the radius
        System.out.print("Enter number of radius cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter number of length cylinder: ");
        double length = input.nextDouble();

        // Compute the area
        double area = radius * radius * PI;
        // compute the volume
        double volume = area * length;

        // Shows the result
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        input.close();
    }
}