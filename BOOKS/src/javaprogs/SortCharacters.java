//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// SortCharacters.java (Chapter 13, page 582)               //
//////////////////////////////////////////////////////////////

// Sorts the characters in a string

import jpb.*;

public class SortCharacters {
  public static void main(String[] args) {
    // Prompt user to enter a string
    SimpleIO.prompt("Enter a string: ");
    String userInput = SimpleIO.readLine();

    // Create a string buffer to hold the sorted string
    StringBuffer stringBuf = new StringBuffer();

    // Insert characters from the user's input into the
    // string buffer, keeping the characters in the buffer
    // sorted at all times
    for (int i = 0; i < userInput.length(); i++) {
      char ch = userInput.charAt(i);
      int j;
      for (j = 0; j < stringBuf.length(); j++)
        if (ch < stringBuf.charAt(j))
          break;
      stringBuf.insert(j, ch);
    }

    // Display contents of string buffer
    System.out.println("Sorted version of string: " +
                       stringBuf);
  }
}
