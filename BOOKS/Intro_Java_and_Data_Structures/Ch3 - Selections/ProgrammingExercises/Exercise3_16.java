/*
(Random point) Write a program that displays a random coordinate in a 
rectangle. The rectangle is centered at (0, 0) with width 100 and height 200.
*/

public class Exercise3_16 {
    public static void main(String[] args) {
        // generate random number
        double width = (Math.random() * 100);
        double height = (Math.random() * 200);

        width = ((int)(width * 100)) / 100.0;
        height = ((int)(height * 100)) / 100.0;

        System.out.println("The x and y: (" + width + ", "+ height +")");
    }
}