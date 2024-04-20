import java.util.Scanner;
/*
(Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and
(x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a and b.
The intersecting point of the two lines can be found by solving the following
linear equations:

    (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
    (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

This linear equation can be solved using Cramer’s rule (see Programming
Exercise 3.3). If the equation has no solutions, the two lines are parallel (see
Figure 3.8c). Write a program that prompts the user to enter four points and 
displays the intersecting point. Here are sample runs

    Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 −1.0 4.0 2.0 −1.0 −2.0
    The intersecting point is at (2.88889, 1.1111)
    x1 = 2, y1 = 2
    x2 = 5, y2 = -1.0
    x3 = 4.0, y3 = 2.0
    x4 = -1.0, y4 = -2.0

    (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
    (2 - (-1.0))x - (2 - 5)y = (2 - (-1.0))x1 - (2 - 5)y1
    (2 + 1)x - (-3)y = (2 + 1)x1 - (-3)y1
    3x + 3y = 3x1 + 3y1
    ax + by = e
    a = 3
    b = 3
    
    (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
    (2.0 - (-2.0))x - (4.0 - (-1.0))y = (2.0 - (-2.0))x3 - (4.0 - (-1.0))y3
    4x - 5y = 4x3 - 5y3
    ax + by = f
    c = 4
    d = 5

    a * d - b * c =
    3 * 5 - 3 * 4 = 
    15 - 12 = 3

    e = 3x1 + 3y1
      = 3(2) + 3(2)
      = 12
    f = 4x3 - 5y3
      = 4(4.0) - 5(2.0)
      = 16 - 10
      = 6
    
    3x + 3y = 12
    |    |
    x + y = 4
    4x - 5y = 6
    _____________-
    4x + 4y = 16
    4x - 5y = 6
    _____________-
    9y = 10
     y = 10 / 9 = 1.1111

    x + y = 4
    x + 1.111 = 4
    x = 4 - 1.11111
      = 2.888889
_________________________________________________________________________________
    
    Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 −1.0 −2.0
    The two lines are parallel

    x1 = 2, y1 = 2
    x2 = 7, y2 = 6.0        
    x3 = 4.0, y3 = 2.0    
    x4 = -1.0, y4 = -2.0     


    (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
    (2 - 6)x - (2 - 7)y = (2 - 6)x1 - (2 - 7)y1
    -4x + 5y = -4x1 + 5y1
    (ax + by = e)

    (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
    (2 - (-2))x - (4 - (-1)))y = (2 - (-2))x3 - (4 - (-1))y3
    4x - 5y = 4x3 - 5y3
    (cx + dy = f)

    (ad - bc) = 0 means no solution
    (-4 * -5) - (5 * 4)
    20 - 20 = 0

    the two lines are parallel
*/

public class Exercise3_25 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter x1, y1, x2, y2, x3, y3 and x4, y4
        System.out.print("Enter x1, y1, x2, y2, x3, y3 and x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // find a
        double a = y1 - y2;
        // find b
        double b = x1 - x2;

        // find c
        double c = y3 - y4;
        // find d
        double d = x3 - x4;
        
        if ((a*d - b*c) == 0)
            System.out.println("The two lines are parallel");
        else {
            double adbc = (a * d - b * c);

            // find the e and f
            double e = (y1 - y2) * x1 - (x1 - x2) * y1;
            double f = (y3 - y4) * x3 - (x3 - x4) * y3;
            
            // find the y
            double y = ((e * c) - (f * a)) / adbc ;
            double x = ((e * d) - (f * b)) / adbc;

            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }

        input.close();
    }
}