//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FileProperties.java (Chapter 14, page 610)               //
//////////////////////////////////////////////////////////////

// Displays the properties of a file

import java.io.*;
import jpb.*;

public class FileProperties {
  public static void main(String[] args) {
    // Prompt user to enter file name
    SimpleIO.prompt("Enter a file name: ");
    String fileName = SimpleIO.readLine();

    // Create a File object
    File f = new File(fileName);

    // Display properties of file
    if (f.canRead())
      System.out.println("File can be read");
    if (f.canWrite())
      System.out.println("File can be written");
    if (f.exists())
      System.out.println("File exists");
    if (f.isDirectory())
      System.out.println("File is a directory");
    if (f.isFile())
      System.out.println("File is normal");
    System.out.println("Length of file: " + f.length());
  }
}
