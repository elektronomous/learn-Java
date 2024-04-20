/*
(Current time) Revise Programming Exercise 2.8 to display the hour using a
12-hour clock. Here is a sample run:
Enter the time zone offset to GMT: −5
The current time is 4:50:34 A
 */

import java.util.Scanner;

 public class Exercise3_30 {
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
         long currentHours = (totalSeconds + offsetGMT) % 12;

         if (currentHours == 0) currentHours = 12;
 
         // Display the result first
         System.out.println("GMT: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
 
         input.close();
     }
 }