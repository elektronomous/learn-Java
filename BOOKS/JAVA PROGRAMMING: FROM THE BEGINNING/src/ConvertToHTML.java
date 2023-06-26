//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// ConvertToHTML.java (Chapter 14, page 634)                //
//////////////////////////////////////////////////////////////

// Converts an ordinary text file to an HTML file

import java.io.*;

public class ConvertToHTML {
  public static void main(String[] args) {
    // Terminate program if number of command-line arguments
    // is wrong
    if (args.length != 1) {
      System.out.println("Usage: java ConvertToHTML file");
      System.exit(-1);
    }

    // Call the generateHTMLFile method, which converts the
    // original file to an HTML file. Terminate the program
    // if an exception occurs.
    try {
      generateHTMLFile(args[0]);
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
      System.exit(-1);
    }
  }

  // Returns a file name that is identical to fileName, but
  // with the extension changed to .html
  private static String createHTMLFileName(String fileName) {
    int index = fileName.lastIndexOf(".");
    if (index != -1)
      fileName = fileName.substring(0, index);
    return fileName + ".html";
  }

  // Generates an HTML file containing the contents of the
  // original file, with HTML tags added
  private static void generateHTMLFile(String originalFile)
      throws IOException {

    // Open the original file for reading
    FileReader fileIn = new FileReader(originalFile);
    BufferedReader in = new BufferedReader(fileIn);

    // Determine the name of the HTML file by changing the
    // extension of the original file name to .html
    String newFile = createHTMLFileName(originalFile);

    // Open the HTML file for writing
    FileWriter fileOut = new FileWriter(newFile);
    BufferedWriter bufOut = new BufferedWriter(fileOut);
    PrintWriter out = new PrintWriter(bufOut);

    // Read the first line of the original file. Terminate
    // the program if the original file is empty.
    String firstLine = in.readLine();
    if (firstLine == null) {
      System.out.println("File is empty");
      System.exit(-1);
    }
    
    // Write a series of tags to the HTML file, using the
    // the first line of the original file for the <TITLE>
    // and <H2> tags.
    out.println("<HTML>");
    out.println("<HEAD>");
    out.println("<TITLE>" + firstLine + "</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY>");
    out.println("<H2>" + firstLine + "</H2>");

    // Copy the remaining lines of the original file to the
    // HTML file, replacing each empty line with a <P> tag
    while (true) {
      String currentLine = in.readLine();
      if (currentLine == null)
        break;
      if (currentLine.length() == 0)
        out.println("<P>");
      else
        out.println(currentLine);
    }

    // Write the closing tags to the HTML file
    out.println("</BODY>");
    out.println("</HTML>");

    // Close both files
    in.close();
    out.close();
  }
}
