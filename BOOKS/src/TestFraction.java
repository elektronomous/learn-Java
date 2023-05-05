//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// TestFraction.java (Chapter 10, page 430)                 //
//////////////////////////////////////////////////////////////

// Tests the behavior of the Fraction class.

import jpb.*;

public class TestFraction {
  public static void main(String[] args) {
    while (true) {
      // Prompt the user to enter the numerator and
      // denominator of two fractions
      int num = ValidIO.readInt("Enter first numerator: ");
      int denom = 
        ValidIO.readInt("Enter first denominator: ");
      Fraction f1 = new Fraction(num, denom);
      System.out.println();

      num = ValidIO.readInt("Enter second numerator: ");
      denom = ValidIO.readInt("Enter second denominator: ");
      Fraction f2 = new Fraction(num, denom);
      System.out.println();

      // Display the fractions after they've been stored in
      // objects
      System.out.println("First fraction: " + f1);
      System.out.println("Second fraction: " + f2 + "\n");

      // Compute and display the sum, difference, product,
      // and quotient of the two fractions
      System.out.println("Sum: " + f1.add(f2));
      System.out.println("Difference: " + f1.subtract(f2));
      System.out.println("Product: " + f1.multiply(f2));
      System.out.println("Quotient: " + f1.divide(f2));

      // Ask the user whether or not to test more fractions
      SimpleIO.prompt("\nTest more fractions (Y/N)? ");
      String userInput = SimpleIO.readLine();
      if (!userInput.equalsIgnoreCase("Y"))
        break;
    }
  }
}
