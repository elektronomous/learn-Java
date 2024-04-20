import java.util.Scanner;
/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a
point (x, y) and checks whether the point is within the circle centered at (0, 0)
with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
circle, as shown in Figure 3.7a.

(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
The formula for computing the distance is 
          _______________________
        \/(x2 - x1)² + (y2 - y1)²  

Test your program to cover all cases.) Two sample runs are shown below:
    
    Enter a point with two coordinates: 4 5
    Point (4.0, 5.0) is in the circle
    
    Enter a point with two coordinates: 9 9
    Point (9.0, 9.0) is not in the circle

*/

public class Exercise3_22 { 
    public static void main(String[] args) {
        // Create a Scanner object to read valeus from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter x and y
        System.out.print("Enter coordinate x and y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Because the distance is center (0,0), then the x1 and y1 both are 0
        double distance = (x - 0) * (x - 0) + (y - 0) * (y - 0);
               distance = Math.pow(distance, 1/2.0);
        
        if (distance < 10) 
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        
        input.close();
    }
}