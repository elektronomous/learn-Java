//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FtoC4.java (Appendix E, page 764)                        //
//////////////////////////////////////////////////////////////

// Converts a Fahrenheit temperature entered by the user to
// Celsius

import java.io.*;
import jpb.*;

public class FtoC4 {
  public static void main(String[] args) {
    final double FREEZING_POINT = 32.0;
    final double DEGREE_RATIO = 5.0 / 9.0;
    InputStreamReader streamIn =
      new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(streamIn, 1);

    System.out.print("Enter Fahrenheit temperature: ");
    System.out.flush();
    try {
      String userInput = in.readLine();
      double fahrenheit = Convert.toDouble(userInput);
      double celsius = 
        (fahrenheit - FREEZING_POINT) * DEGREE_RATIO;
      System.out.println("Celsius equivalent: " + celsius);
    } catch (IOException e) {
      System.out.println(e.getMessage());
      System.exit(-1);
    }
  }
}
