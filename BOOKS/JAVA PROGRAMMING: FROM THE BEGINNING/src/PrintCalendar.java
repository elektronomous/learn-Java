//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PrintCalendar.java (Chapter 8, page 325)                 //
//////////////////////////////////////////////////////////////

// Program name: PrintCalendar
// Author: K. N. King
// Written: 1998-05-07
// Modified: 1999-07-07
// 
// Displays a calendar for the current month. The calendar
// has the following form:
//
//       May 2000
// --------------------
//     1  2  3  4  5  6
//  7  8  9 10 11 12 13
// 14 15 16 17 18 19 20
// 21 22 23 24 25 26 27
// 28 29 30 31
//
// The month name and year are centered over the calendar.

import java.util.*;
import jpb.*;

public class PrintCalendar {
  public static void main(String[] args) {
    // Determine the current date
    GregorianCalendar date = new GregorianCalendar();

    // Adjust to first day of month
    date.set(Calendar.DATE, 1);

    // Determine the current month and year
    int month = date.get(Calendar.MONTH);
    int year = date.get(Calendar.YEAR);

    // Determine the day of the week for the first day of the
    // current month
    int dayOfWeek = date.get(Calendar.DAY_OF_WEEK) - 1;

    // Print a heading for the calendar
    printHeading(month, year);

    // Print the body of the calendar
    printDays(dayOfWeek, daysInMonth(month, year));
  }

  ///////////////////////////////////////////////////////////
  // NAME:       printHeading
  // BEHAVIOR:   Prints a heading for a one-month calendar.
  //             The heading consists of a month and year,
  //             centered over a row of 20 dashes.
  // PARAMETERS: month - number representing a month (0-11)
  //             year - the year
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void printHeading(int month, int year) {
    // Convert the month number to a name
    final String[] MONTH_NAMES =
      {"January", "February", "March", "April", "May",
       "June", "July", "August", "September", "October",
       "November", "December"};
    String monthString = MONTH_NAMES[month];

    // Determine how many spaces to display before the month
    int precedingSpaces = (15 - monthString.length()) / 2;

    // Print the month, year, and row of dashes
    System.out.println();
    for (int i = 1; i <= precedingSpaces; i++)
      System.out.print(" ");
    System.out.println(monthString + " " + year);
    System.out.println("--------------------");
  }

  ///////////////////////////////////////////////////////////
  // NAME:       printDays
  // BEHAVIOR:   Prints the days in a one-month calendar
  // PARAMETERS: dayOfWeek - day of week for first day in
  //                         month (0-6)
  //             monthLength - number of days in month
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void printDays(int dayOfWeek,
                                int monthLength) {
    // Leave space for "empty days" at the beginning of the
    // month
    for (int i = 0; i < dayOfWeek; i++)
      System.out.print("   ");

    // Display the calendar. Add a space before each
    // single-digit day so that columns will line up. Advance
    // to the next line after each Saturday date is printed.
    for (int day = 1; day <= monthLength; day++) {
      if (day <= 9)
        System.out.print(" " + day + " ");
      else
        System.out.print(day + " ");
      if ((dayOfWeek + day) % 7 == 0)
        System.out.println();
    }

    // If the month did not end on a Saturday, terminate the
    // last line of the calendar with a new-line
    if ((dayOfWeek + monthLength) % 7 != 0)
      System.out.println();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       daysInMonth
  // BEHAVIOR:   Computes the number of days in a month.
  // PARAMETERS: month - number representing a month (0-11)
  //             year - the year
  // RETURNS:    Number of days in the specified month in the
  //             specified year
  ///////////////////////////////////////////////////////////
  private static int daysInMonth(int month, int year) {
    int numberOfDays = 31;

    // Add 1 to month; the result will be between 1 and 12
    switch (month + 1) {
      case 2:  // February
               numberOfDays = 28;
               if (year % 4 == 0) {
                 numberOfDays = 29;
                 if (year % 100 == 0 && year % 400 != 0)
                   numberOfDays = 28;
               }
               break;

      case 4:  // April
      case 6:  // June
      case 9:  // September
      case 11: // November
               numberOfDays = 30;
               break;
    }

    return numberOfDays;
  }
}
