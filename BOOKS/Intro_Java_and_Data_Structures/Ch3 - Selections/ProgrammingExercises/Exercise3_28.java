/*
(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as
shown in Figure 3.9. Test your program to cover all cases.

Here are the sample runs:
        Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43
        Enter r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3
    
        Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 5.5
        Enter r2’s center x-, y-coordinates, width, and height: 3 4 4.5 5
            
        r2 overlaps r1
        
        Enter r1’s center x-, y-coordinates, width, and height: 1 2 3 3
        Enter r2’s center x-, y-coordinates, width, and height: 40 45 3 2
        
        r2 does not overlap r1
       
*/

import java.util.Scanner;

public class Exercise3_28 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter x, y, width and height
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 =  input.nextDouble();

        // Prompt user to enter x, y, width and height
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 =  input.nextDouble();

        // Compute the rectangle1
        // Compute the x1 to the right
        double xRight1 = x1 + (width1 / 2);
        // compute the x2 to the left
        double xLeft1 = x1 - (width1 / 2);

        // Compute the y1 to the top
        double yTop1 = y1 + (height1 / 2);
        // Compute the y2 to the bottom
        double yBottom1 = y1 - (height1 / 2);

        // Compute the rectangle2
        // Compute the x2 to the right
        double xRight2 = x2 + (width2 / 2);
        // Comput the x2 to the left
        double xLeft2 = x2 - (width2 / 2);
        // Compute the y2 to the top
        double yTop2 = y2 + (height2 / 2);
        // Compute the y2 to the bottom
        double yBottom2 = y2 - (height2 / 2);
        
        // We have rectangle inside rectangle if
        if (
            (xRight2 <= xRight1 && xLeft2 >= xLeft1) &&
            (yTop2 <= yTop1 && yBottom2 >= yBottom1)
            )
            System.out.println("r2 is inside r1");
        else if (
            (xRight2 >= xLeft1 && xLeft2 <= xRight1) &&
            (yTop2 >= yBottom1 && yBottom2 <= yTop1)
        ) 
            System.out.println("r2 is overlap r1");
        else
            System.out.println("r2 is outside the r1");

        input.close();
    }
}