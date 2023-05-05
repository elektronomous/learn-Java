//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// CheckISBN.java (Chapter 3, page 119)                     //
//////////////////////////////////////////////////////////////

// Program name: CheckISBN
// Author: K. N. King
// Written: 1998-04-17
// Modified: 1999-02-11
//
// Prompts the user to enter an ISBN number. Computes the
// check digit for the ISBN. Displays both the check digit
// entered by the user and the check digit computed by the
// program.

import jpb.*;

public class CheckISBN {
  public static void main(String[] args) {
    // Prompt the user to enter an ISBN
    SimpleIO.prompt("Enter ISBN: ");
    String originalISBN = SimpleIO.readLine();

    // Determine location of dashes
    int dashPos1 = originalISBN.indexOf("-");
    int dashPos2 = originalISBN.indexOf("-", dashPos1 + 1);

    // Remove dashes from ISBN
    String reducedISBN =
      originalISBN.substring(0, dashPos1) +
      originalISBN.substring(dashPos1 + 1, dashPos2) +
      originalISBN.substring(dashPos2 + 1, 11);

    // Compute the check digit for the ISBN
    int total =
      10 * Integer.parseInt(reducedISBN.substring(0, 1)) +
       9 * Integer.parseInt(reducedISBN.substring(1, 2)) +
       8 * Integer.parseInt(reducedISBN.substring(2, 3)) +
       7 * Integer.parseInt(reducedISBN.substring(3, 4)) +
       6 * Integer.parseInt(reducedISBN.substring(4, 5)) +
       5 * Integer.parseInt(reducedISBN.substring(5, 6)) +
       4 * Integer.parseInt(reducedISBN.substring(6, 7)) +
       3 * Integer.parseInt(reducedISBN.substring(7, 8)) +
       2 * Integer.parseInt(reducedISBN.substring(8, 9));
    int checkDigit = 10 - ((total - 1) % 11);

    // Display the check digit entered by the user
    System.out.println("Check digit entered: " +
                       originalISBN.charAt(12));

    // Display the computed check digit
    final String DIGITS = "0123456789X";
    System.out.println("Check digit computed: " +
                       DIGITS.charAt(checkDigit));
  }
}
