//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// RenameFiles.java (Chapter 14, page 612)                  //
//////////////////////////////////////////////////////////////

// Renames selected files in the current directory

import java.io.*;
import jpb.*;

public class RenameFiles {
  public static void main(String[] args) {
    // Obtain a list of all files in the current directory
    File currentDirectory = new File(".");
    String[] fileNames = currentDirectory.list();

    // Process each name in the list
    for (int i = 0; i < fileNames.length; i++) {

      // Ask user whether or not to rename file
      SimpleIO.prompt("Rename " + fileNames[i] + " (y/n)? ");
      String response = SimpleIO.readLine();

      // If the answer is "y" or "Y", ask for new name and
      // then call renameTo
      if (response.equalsIgnoreCase("y")) {
        SimpleIO.prompt("Enter new name: ");
        String newName = SimpleIO.readLine();
        File oldFile = new File(fileNames[i]);
        File newFile = new File(newName);
        boolean successful = oldFile.renameTo(newFile);
        if (!successful)
          System.out.println("Could not rename " + 
                             fileNames[i] + " to " +
                             newName);
      }
    }
  }
}
