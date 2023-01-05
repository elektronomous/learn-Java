//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// MonthLength.java (Chapter 8, page 313)                   //
//////////////////////////////////////////////////////////////

// Determines the number of days in a month

import jpb.*;

public class MonthLength {
  public static void main(String[] args) {
    // Prompt the user to enter a month
    SimpleIO.prompt("Enter a month (1-12): ");
    String userInput = SimpleIO.readLine();
    int month = Integer.parseInt(userInput);

    // Terminate program if month is not between 1 and 12
    if (month < 1 || month > 12) {
      System.out.println("Month must be between 1 and 12");
      return;
    }

    // Prompt the user to enter a year
    SimpleIO.prompt("Enter a year: ");
    userInput = SimpleIO.readLine();
    int year = Integer.parseInt(userInput);

    // Determine the number of days in the month
    int numberOfDays;
    switch (month) {
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

      default: numberOfDays = 31;
               break;
    }

    // Display the number of days in the month
    System.out.println("There are " + numberOfDays +
                       " days in this month");
  }
}
