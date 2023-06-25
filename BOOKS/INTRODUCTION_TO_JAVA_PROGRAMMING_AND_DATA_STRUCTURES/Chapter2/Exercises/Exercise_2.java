package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.Exercises;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PHI = 3.14159;
        
        System.out.print("Enter the length of cylinder: ");
        double length = input.nextDouble();
        System.out.print("Enter number of radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * PHI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

        input.close();
    }
}