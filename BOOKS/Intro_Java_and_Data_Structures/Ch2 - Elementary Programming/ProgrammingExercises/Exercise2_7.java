/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the maximum number of years and 
remaining days for the minutes. For simplicity, assume that a year has 365 days. 
Here is a sample run:

Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
*/

import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        // Create object Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a minutes below 1 Billion
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        // convert that minutes into hours
        int hours = minutes / 60;
        // convert that hours to days
        int days = hours / 24;
        // convert that days into years
        int years = days / 365;
        // get the remaining days
        days %= 365;

        // Show the result
        System.out.println(minutes + " minutes is approximately " + years +
                          " years and " + days + " days");

        input.close();
    }
}