package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.Exercises;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degree in Celcius: ");
        double celciusDegree = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celciusDegree + 32;

        System.out.println("The " + celciusDegree + " Celcius is " +
                           fahrenheit + " fahrenheit degree.");


        input.close();
    }
}