package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.Exercises;
import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter subtotal
        System.out.print("Enter number of subtotal: ");
        double subtotal = input.nextDouble();
        // enter gratuity (persen)
        System.out.print("Enter number of gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = (gratuityRate / 100.0) * subtotal;
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        input.close();
    }
}