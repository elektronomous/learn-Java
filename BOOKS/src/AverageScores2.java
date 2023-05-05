//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// AverageScores2.java (Chapter 5, page 193)                //
//////////////////////////////////////////////////////////////

// Computes the average of a series of scores

import jpb.*;

public class AverageScores2 {
  public static void main(String[] args) {
    // Prompt user to enter number of scores
    SimpleIO.prompt("Enter number of scores: ");
    String userInput = SimpleIO.readLine().trim();
    int numberOfScores = Integer.parseInt(userInput);
    System.out.println();

    // Create array to hold scores
    int[] scores = new int[numberOfScores];

    // Prompt user to enter scores and store them in an array
    for (int i = 0; i < scores.length; i++) {
      SimpleIO.prompt("Enter score #" + (i + 1) + ": ");
      userInput = SimpleIO.readLine().trim();
      scores[i] = Integer.parseInt(userInput);
    }

    // Compute sum of scores
    int sum = 0;
    for (int i = 0; i < scores.length; i++)
      sum += scores[i];

    // Display average score
    System.out.println("\nAverage score: " +
                       sum / scores.length);
  }
}
