package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.src;
import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PHI = 3.14159; // declare a constant

        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter radius value
        System.out.print("Enter a number of radius: ");
        double radius = input.nextDouble();

        // compute the area
        double area = radius * radius * PHI;

        System.out.println("The area of radius " + radius + " is " + area);

        input.close();
    }
}
