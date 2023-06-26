package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.Exercises;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter random number
        System.out.print("Enter number between 0 and 1000: ");
        int numbers = input.nextInt();

        int total = (numbers / 1000) +
                    (numbers / 100) +
                    (numbers / 10 % 10) +
                    (numbers % 10);

        System.out.println("The sum of the digits " + numbers + " is " + total);
        input.close();
    }
}