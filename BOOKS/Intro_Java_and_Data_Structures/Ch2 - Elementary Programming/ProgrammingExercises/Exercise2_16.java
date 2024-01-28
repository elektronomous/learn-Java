import java.util.Scanner;
/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the 
side of a hexagon and displays its area. The formula for computing the area of a 
hexagon is

        Area = 3squareRoot(3)/2 s^2,

where s is the length of a side. Here is a sample run:
Enter the length of the side: 5.5
The area of the hexagon is 78.5918
*/

public class Exercise2_16 {
    public static void main(String[] args) {
        // Create a Scanner to read values from user
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the length of the side of Hexagon
        System.out.print("Enter the length of the side: ");
        double hexagonSide = input.nextDouble();

        // Compute the area
        double hexagonArea = (3 * (Math.pow(3, 0.5)))/2 * Math.pow(hexagonSide, 2);

        // Show the result
        System.out.print("The area of the hexagon is " + hexagonArea);

        input.close();
    }
}