/*
(Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle
is inside the first or overlaps with the first, as shown in Figure 3.10. 

(Hint: circle2 is inside circle1 if the distance between the two centers <= r1 − r2
and circle2 overlaps circle1 if the distance between the two centers <=
r1 + r2. Test your program to cover all cases.)
Here are the sample runs:

    Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13
    Enter circle2’s center x-, y-coordinates, and radius: 1 1.7 4.5
    circle2 is inside circle1
 */

import java.util.Scanner;

 public class Exercise3_29 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter x-, y-coordinate and radius of the first circle
        System.out.print("Enter x, y, and radius of first circle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        // Prompt user to enter x-, y-coordinate and radius for the second
        System.out.print("Enter x, y, and radius of second circle: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        // Compute the distance between point (x1, y1) and (x2, y2)
        double distance = Math.pow((x2 - x1) * (x2 - x1) +
                                   (y2 - y1) * (y2 - y1),   0.5);
        
        if (distance <= (radius1 - radius2))    
            System.out.println("Circle2 is inside Circle1");
        else if (distance <= (radius1 + radius2))
            System.out.println("Circle2 overlaps the circle1");
        else
            System.out.println("Circle2 is outside the circle1"); 
        
        input.close();
    }
 }