//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ReverseLines.java (Chapter 13, page 561)                 //
//////////////////////////////////////////////////////////////

// Reverses a series of lines entered by the user

import java.util.*;
import jpb.*;

public class ReverseLines {
  public static void main(String[] args) {
    // Prompt user to enter lines
    System.out.println("Enter lines to be reversed, " +
                       "ending with a blank line.");

    // Create vector to hold lines
    Vector lines = new Vector();

    // Read lines and store in vector
    while (true) {
      String inputLine = SimpleIO.readLine();
      if (inputLine.length() == 0)
        break;
      lines.addElement(inputLine);
    }

    // Display elements of vector in reverse order
    for (int i = lines.size() - 1; i >= 0; i--)
      System.out.println(lines.elementAt(i));
  }
}
