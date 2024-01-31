import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read valeus from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the year
        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);

        input.close();
    }
}