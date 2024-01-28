/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and display the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. Here is a sample
run of the program:

Enter the number of years: 5
The population in 5 years is 325932969

(Population projections) The U.S. Census Bureau projects population based
on the following assumptions:
     (1) One birth every 7 seconds
     (2) One death every 13 seconds
     (3) One new immigrant every 45 seconds

Write a program to display the population for each of the next five years.
Assume that the current population is 312,032,486 and one year has 365 days.
*/

import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter the years
        System.out.print("Enter how many years the population will become: ");
        double years = input.nextDouble();

        // Convert the years to seconds
        double seconds = (years * 365) * 24 * 3600;

        // then from the seconds, we count the census
        int oneBirth = (int)seconds / 7;
        int death = (int)seconds / 13;
        int newImmigrant = (int)seconds / 45;

        // Show the result;
        System.out.println("The population in " + years + " is " + (oneBirth - death + newImmigrant + 312032486));

        input.close();
    }
}