//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FtoC2.java (Chapter 2, page 53)                          //
//////////////////////////////////////////////////////////////

// Converts a Fahrenheit temperature to Celsius

public class FtoC2 {
  public static void main(String[] args) {
    final double FREEZING_POINT = 32.0;
    final double DEGREE_RATIO = 5.0 / 9.0;
    double fahrenheit = 98.6;
    double celsius = 
      (fahrenheit - FREEZING_POINT) * DEGREE_RATIO;
    System.out.print("Celsius equivalent: ");
    System.out.println(celsius);
  }
}
