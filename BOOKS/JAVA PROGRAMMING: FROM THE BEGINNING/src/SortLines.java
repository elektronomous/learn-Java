//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// SortLines.java (Chapter 13, page 569)                    //
//////////////////////////////////////////////////////////////

// Sorts a series of lines entered by the user

import java.util.*;
import jpb.*;

public class SortLines {
  public static void main(String[] args) {
    // Prompt user to enter lines
    System.out.println("Enter lines to be sorted, " +
                       "ending with a blank line.");

    // Create vector to store lines
    Vector v = new Vector();

    // Read lines and insert into vector; elements will be
    // kept in order at all times
    while (true) {

      // Read a line; exit loop if line is empty
      String inputLine = SimpleIO.readLine();
      if (inputLine.length() == 0)
        break;

      // Determine where line should be stored in vector
      int i;
      for (i = 0; i < v.size(); i++)
        if (inputLine.compareTo((String) v.elementAt(i)) < 0)
          break;

      // Insert line at this position. Existing elements will
      // be moved to make room for the new element.
      v.insertElementAt(inputLine, i);
    }

    // Display elements of vector
    for (int i = 0; i < v.size(); i++)
      System.out.println(v.elementAt(i));
  }
}
