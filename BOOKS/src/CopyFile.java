//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// CopyFile.java (Chapter 14, page 617)                     //
//////////////////////////////////////////////////////////////

// Copies one file into another. The names of both files must
// be specified on the command line.

import java.io.*;

public class CopyFile {
  public static void main(String[] args) {
    // Terminate program if number of command-line arguments
    // is wrong
    if (args.length != 2) {
      System.out.println("Usage: java CopyFile source dest");
      System.exit(-1);
    }

    try {
      // Open source file for input and destination file for
      // output
      FileInputStream source = new FileInputStream(args[0]);
      FileOutputStream dest = new FileOutputStream(args[1]);

      // Set up a 512-byte buffer
      byte[] buffer = new byte[512];

      // Copy bytes from the source file to the destination
      // file, 512 bytes at a time
      while (true) {
        int count = source.read(buffer);
        if (count == -1)
          break;
        dest.write(buffer, 0, count);
      }

      // Close source and destination files
      source.close();
      dest.close();

    } catch (FileNotFoundException e) {
      System.out.println("File cannot be opened");
    } catch (IOException e) {
      System.out.println("I/O error during copy");
    }
  }
}
