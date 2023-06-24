package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter2.src;
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter seconds
        System.out.print("Enter number of seconds: ");
        int seconds = input.nextInt();
        
        // compute the minutes
        int minutes = seconds / 60;
        // compute the remaining seconds
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " +
                           remainingSeconds + " seconds");

        input.close();
    }
}