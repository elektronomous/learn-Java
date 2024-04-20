/*
(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle. Here are the sample runs:

    Enter a point’s x- and y-coordinates: 100.5 25.5
    The point is in the triangle
    Enter a point’s x- and y-coordinates: 100.5 50.5
    The point is not in the triangle

Let the coordinates of the three corners be (x1, y1), (x2, y2), and (x3, y3). And coordinates of the given point P be (x, y)

Calculate the area of the given triangle, i.e., the area of the triangle ABC in the above diagram. 
    
        Area A = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2 

Calculate the area of the triangle PAB. We can use the same formula for this. Let this area be A1. 
Calculate the area of the triangle PBC. Let this area be A2. 
Calculate the area of the triangle PAC. Let this area be A3. 
If P lies inside the triangle, then A1 + A2 + A3 must be equal to A. 

Input: A = (0, 0), B = (10, 30), C = (20, 0), P(10, 15)
Output: Inside
Explanation:
              B(10,30)
                / \
               /   \
              /     \
             /   P   \      P'
            /         \
     A(0,0) ----------- C(20,0) 
Input: A = (0, 0), B = (10, 30), C = (20, 0), P(30, 15)
Output: Outside
Explanation:
              B(10,30)
                / \
               /   \
              /     \
             /       \      P
            /         \
     A(0,0) ----------- C(20,0) 
*/

import java.util.Scanner;

public class Exercise3_27 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // The problem has its own constant
        final double POINTA_X = 0;          // x1
        final double POINTA_Y = 0;          // y1
        final double POINTB_X = 200;        // x2
        final double POINTB_Y = 0;          // y2
        final double POINTC_X = 0;          // x3
        final double POINTC_Y = 100;        // y3

        // prompt user to enter points
        System.out.print("Enter two points: ");
        double point_x = input.nextDouble();    // x
        double point_y = input.nextDouble();    // y

        // first compute the area of triangle, we call it A1
        /* 
            A = (x1, y1)
            B = (x2, y2)
            C = (x3, y3)
            Area A = [ x1(y2 – y3) + x2(y3 – y1) + x3(y1-y2)]/2 
        */
        double areaOf_ABC = (POINTA_X * (POINTB_Y - POINTC_Y) + POINTB_X * (POINTC_Y - POINTA_Y) +
                            POINTC_X * (POINTA_Y - POINTB_Y)) / 2;
        
        // Compute the area of PAB, we call it A2
        /* 
            P = (x, y)
            A = (x1, y1)
            B = (x2, y2)
            Area A = [ x(y1 – y2) + x1(y2 – y) + x2(y - y1)]/2 
        */
        double areaOf_PAB = (point_x * (POINTA_Y - POINTB_Y) + POINTA_X * (POINTB_Y - point_y) +
                            POINTB_X * (point_y - POINTA_Y)) / 2;

        // Compute the area of PBC, we call it A3
        /* 
            P = (x, y)
            B = (x2, y2)
            C = (x3, y3)
            Area A = [ x(y2 – y3) + x2(y3 – y) + x3(y - y2)]/2 
        */
        double areaOf_PBC = (point_x * (POINTB_Y - POINTC_Y) + POINTB_X * (POINTC_Y - point_y) +
                            POINTC_X * (point_y - POINTB_Y)) / 2;
        
        // Compute the area of PBC, we call it A3
        /*             
            P = (x, y)
            A = (x1, y1)
            C = (x3, y3)
            Area A = [ x(y1 – y3) + x1(y3 – y) + x3(y - y1)]/2 
        */
        double areaOf_PAC = (point_x * (POINTA_Y - POINTC_Y) + POINTA_X * (POINTC_Y - point_y) +
                             POINTC_X * (point_y - POINTA_Y)) / 2;



        if (
            (Math.abs(areaOf_PAB) + Math.abs(areaOf_PBC) + Math.abs(areaOf_PAC)) == areaOf_ABC
            )
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
            
        input.close();
    }
}