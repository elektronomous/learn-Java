package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.Exercises;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double ONEFOOTINMETER = 0.305;
        // enter number in feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double feetInMeters = feet * ONEFOOTINMETER;

        System.out.println(feet + " feet is " + feetInMeters + " meters");
        input.close();
    }
}