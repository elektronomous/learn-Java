/*
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so it prompts the user to enter the
time zone offset to GMT and displays the time in the specified time zone. Here is
a sample run:
Enter the time zone offset to GMT: -5
The current time is 4:50:34

The time    : 4:32:54  | offset = -5
the current : 11:32:54 | offset = -5  
 */

import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the GMT offset
        System.out.print("Enter GMT Offset: ");
        int offsetGMT = input.nextInt();


        // Get the Miliseconds of the current time
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // Get the current seconds 
        long currentSeconds = totalSeconds % 60;

        // make the total seconds to store the minute of the total seconds
        totalSeconds /= 60;

        // get the current minutes from the total seconds
        long currentMinutes = totalSeconds % 60;

        // make the total seconds to store the hour of the minute it stored earlier
        totalSeconds /= 60;

        // now get the current hours
        long currentHours = (totalSeconds + offsetGMT) % 24;

        // Display the result first
        System.out.println("GMT: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);

    }
}