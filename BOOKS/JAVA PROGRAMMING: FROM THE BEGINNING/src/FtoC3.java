//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FtoC3.java (Chapter 2, page 62)                          //
//////////////////////////////////////////////////////////////

// Converts a Fahrenheit temperature entered by the user to
// Celsius

import jpb.*;

public class FtoC3 {
  public static void main(String[] args) {
    final double FREEZING_POINT = 32.0;
    final double DEGREE_RATIO = 5.0 / 9.0;

    SimpleIO.prompt("Enter Fahrenheit temperature: ");
    String userInput = SimpleIO.readLine();
    double fahrenheit = Convert.toDouble(userInput);
    double celsius = 
      (fahrenheit - FREEZING_POINT) * DEGREE_RATIO;
    System.out.println("Celsius equivalent: " + celsius);
  }
}
