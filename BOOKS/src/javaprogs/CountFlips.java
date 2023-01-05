//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// CountFlips.java (Chapter 4, page 161)                    //
//////////////////////////////////////////////////////////////

// Counts the number of heads and tails in a series of coin
// flips

import jpb.*;

public class CountFlips {
  public static void main(String[] args) {
    // Prompt user to enter number of flips
    SimpleIO.prompt("Enter number of flips: ");
    String userInput = SimpleIO.readLine();
    int flips = Integer.parseInt(userInput);

    // Flip coin for specified number of times
    int heads = 0, tails = 0;
    while (flips > 0) {
      if (Math.random() < 0.5)
        heads++;
      else 
        tails++;
      flips--;
    }

    // Display number of heads and tails
    System.out.println("Number of heads: " + heads);
    System.out.println("Number of tails: " + tails);
  }
}
