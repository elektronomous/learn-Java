//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// RepeatedDigits.java (Chapter 5, page 198)                //
//////////////////////////////////////////////////////////////

// Checks a number for repeated digits

import jpb.*;

public class RepeatedDigits {
  public static void main(String[] args) {
    // Prompt user to enter a number and convert to int form
    SimpleIO.prompt("Enter a number: ");
    String userInput = SimpleIO.readLine().trim();
    int number = Integer.parseInt(userInput);

    // Create an array to store digit counts
    int[] digitCounts = new int[10];

    // Remove digits from the number, one by one, and
    // increment the corresponding array element
    while (number > 0) {
      digitCounts[number%10]++;
      number /= 10;
    }

    // Create a string containing all repeated digits
    String repeatedDigits = "";
    for (int i = 0; i < digitCounts.length; i++)
      if (digitCounts[i] > 1)
        repeatedDigits += i + " ";

    // Display repeated digits. If no digits are repeated,
    // display "No repeated digits".
    if (repeatedDigits.length() > 0)
      System.out.println("Repeated digits: " +
                         repeatedDigits);
    else
      System.out.println("No repeated digits");
  }
}
