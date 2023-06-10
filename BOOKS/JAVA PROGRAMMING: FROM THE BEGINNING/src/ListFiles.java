//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ListFiles.java (Chapter 14, page 611)                    //
//////////////////////////////////////////////////////////////

// Displays a list of all files in the current directory

import java.io.*;

public class ListFiles {
  public static void main(String[] args) {
    // Obtain a list of all files in the current directory
    File currentDirectory = new File(".");
    String[] fileNames = currentDirectory.list();

    // Display each name in the list
    for (int i = 0; i < fileNames.length; i++)
      System.out.println(fileNames[i]);
  }
}
