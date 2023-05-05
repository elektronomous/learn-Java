//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// CoinFlip.java (Chapter 4, page 145)                      //
//////////////////////////////////////////////////////////////

// Asks the user to guess a coin flip

import jpb.*;

public class CoinFlip {
  public static void main(String[] args) {
    // Prompt user to guess heads or tails
    SimpleIO.prompt("Enter heads or tails: ");
    String userInput = SimpleIO.readLine();
    if (!userInput.equalsIgnoreCase("heads") &&
        !userInput.equalsIgnoreCase("tails")) {
      System.out.println("Sorry, you didn't enter heads " +
                         "or tails; please try again.");
      return;
    }      

    // Choose a random number
    double randomNumber = Math.random();

    // Determine whether user guessed correctly
    if (userInput.equalsIgnoreCase("heads") && 
        randomNumber < 0.5)
      System.out.println("You win!");
    else if (userInput.equalsIgnoreCase("tails") &&
             randomNumber >= 0.5)
      System.out.println("You win!");
    else
      System.out.println("Sorry, you lose.");
  }
}
