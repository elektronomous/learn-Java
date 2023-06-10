//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FtoC.java (Chapter 2, page 51)                           //
//////////////////////////////////////////////////////////////

// Converts a Fahrenheit temperature to Celsius

public class FtoC {
  public static void main(String[] args) {
    double fahrenheit = 98.6;
    double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
    System.out.print("Celsius equivalent: ");
    System.out.println(celsius);
  }
}
