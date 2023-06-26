package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.Exercises;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double ONEPOUNDINKILO = 0.454;

        // enter a pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // convert it to kilo
        double kilo = pounds * ONEPOUNDINKILO;

        System.out.println(pounds + " pounds is " + kilo + " kilograms");
        input.close();
    }
}