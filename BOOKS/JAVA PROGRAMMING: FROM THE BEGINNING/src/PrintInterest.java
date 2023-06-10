//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// PrintInterest.java (Chapter 8, page 321)                 //
//////////////////////////////////////////////////////////////

// Prints a table showing the value of $100 invested at
// different rates of interest over a period of years

import jpb.*;

public class PrintInterest {
  public static void main(String[] args) {
    // Initialize array so that all amounts are equal
    double[] amounts = new double[5];
    for (int i = 0; i < amounts.length; i++)
      amounts[i] = 100.00;

    // Prompt user to enter interest rate
    SimpleIO.prompt("Enter interest rate: ");
    String userInput = SimpleIO.readLine();
    int lowRate = Integer.parseInt(userInput);

    // Prompt user to enter number of years
    SimpleIO.prompt("Enter number of years: ");
    userInput = SimpleIO.readLine();
    int numYears = Integer.parseInt(userInput);

    // Print a heading for the table. Each column represents
    // a single interest rate. The lowest rate is the one
    // entered by the user. Four other rates are shown; each
    // is 1% higher than the previous one.
    System.out.print("\nYears");
    for (int i = 0; i < amounts.length; i++)
      printField(lowRate + i + "%", 6);
    System.out.println();

    // Print contents of table; each row represents one
    // year
    for (int year = 1; year <= numYears; year++) {
      printField(year + "  ", 5);
      for (int i = 0; i < amounts.length; i++) {
        amounts[i] += (lowRate + i) / 100.0 * amounts[i];
        printField("" + Math.round(amounts[i]), 6);
      }
      System.out.println();
    }
  }

  // Displays str in a field of the specified width, with
  // spaces added at the beginning if necessary
  private static void printField(String str, int width) {
    for (int i = str.length(); i < width; i++)
      System.out.print(" ");
    System.out.print(str);
  }
}
