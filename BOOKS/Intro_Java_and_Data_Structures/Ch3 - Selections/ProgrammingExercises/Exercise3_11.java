import java.util.Scanner;
/*
(Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 has 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 has 31 days
*/

public class Exercise3_11 {
    public static void main(String[] args) {
        // Create a Scanner object to read values from users
        Scanner input = new Scanner(System.in);

        // Prompt user to enter month and years
        System.out.print("Enter months(1-12): ");
        int month = input.nextInt();
        System.out.print("Enter years: ");
        int year = input.nextInt();

        switch (month) {
            case 1: System.out.println("31 Days");
                    break;
            case 2: if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        System.out.println("29 Days");
                    else
                        System.out.println("28 Days");
                    break;
            case 3: System.out.println("31 Days");
                    break;
            case 4: System.out.println("30 Days");
                    break;
            case 5: System.out.println("31 Days");
                    break;
            case 6: System.out.println("30 Days");
                    break;
            case 7: System.out.println("31 Days");
                    break;
            case 8: System.out.println("31 Days");
                    break;
            case 9: System.out.println("30 Days");
                    break;
            case 10: System.out.println("31 Days");
                    break;
            case 11: System.out.println("30 Days");
                    break;
            case 12: System.out.println("31 Days");
                    break;
            
        }

        input.close();
    }
}