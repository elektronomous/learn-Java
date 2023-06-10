//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Fraction.java (Chapter 10, page 409)                     //
//////////////////////////////////////////////////////////////

// Class name: Fraction
// Author: K. N. King
// Written: 1998-05-28
// Modified: 1999-07-12
// 
// Represents a mathematical fraction, consisting of a
// numerator and a denominator, both of which are integers.

public class Fraction {
  // Instance variables
  private int numerator;    // Numerator of fraction
  private int denominator;  // Denominator of fraction

  ///////////////////////////////////////////////////////////
  // NAME:       Fraction
  // BEHAVIOR:   Constructs a fraction with the specified
  //             numerator and denominator
  // PARAMETERS: num - numerator of fraction
  //             denom - denominator of fraction
  ///////////////////////////////////////////////////////////
  public Fraction(int num, int denom) {
    numerator = num;
    denominator = denom;
    reduce();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       Fraction
  // BEHAVIOR:   Constructs a fraction with the specified
  //             numerator and a denominator of 1
  // PARAMETERS: num - numerator of fraction
  ///////////////////////////////////////////////////////////
  public Fraction(int num) {
    this(num, 1);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       Fraction
  // BEHAVIOR:   Constructs a fraction with a numerator of 0
  //             and a denominator of 1
  // PARAMETERS: None
  ///////////////////////////////////////////////////////////
  public Fraction() {
    this(0, 1);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       add
  // BEHAVIOR:   Adds this fraction and another fraction
  // PARAMETERS: f - the fraction to be added
  // RETURNS:    The sum of this fraction and f
  ///////////////////////////////////////////////////////////
  public Fraction add(Fraction f) {
    int num = numerator * f.denominator + 
              f.numerator * denominator;
    int denom = denominator * f.denominator;
    return new Fraction(num, denom);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       divide
  // BEHAVIOR:   Divides this fraction by another fraction
  // PARAMETERS: f - the fraction to use as a divisor
  // RETURNS:    The quotient of this fraction and f
  ///////////////////////////////////////////////////////////
  public Fraction divide(Fraction f) {
    int num = numerator * f.denominator;
    int denom = denominator * f.numerator;
    return new Fraction(num, denom);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getDenominator
  // BEHAVIOR:   Returns the denominator of this fraction
  // PARAMETERS: None
  // RETURNS:    The denominator of this fraction
  ///////////////////////////////////////////////////////////
  public int getDenominator() {
    return denominator;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getNumerator
  // BEHAVIOR:   Returns the numerator of this fraction
  // PARAMETERS: None
  // RETURNS:    The numerator of this fraction
  ///////////////////////////////////////////////////////////
  public int getNumerator() {
    return numerator;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       multiply
  // BEHAVIOR:   Multiplies this fraction by another fraction
  // PARAMETERS: f - the fraction to be multiplied
  // RETURNS:    The product of this fraction and f
  ///////////////////////////////////////////////////////////
  public Fraction multiply(Fraction f) {
    int num = numerator * f.numerator;
    int denom = denominator * f.denominator;
    return new Fraction(num, denom);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       subtract
  // BEHAVIOR:   Subtracts a fraction from this fraction
  // PARAMETERS: f - the fraction to be subtracted
  // RETURNS:    The difference between this fraction and f
  ///////////////////////////////////////////////////////////
  public Fraction subtract(Fraction f) {
    int num = numerator * f.denominator - 
              f.numerator * denominator;
    int denom = denominator * f.denominator;
    return new Fraction(num, denom);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       toDouble
  // BEHAVIOR:   Converts this fraction into a double value
  // PARAMETERS: None
  // RETURNS:    A double value obtained by dividing the
  //             fraction's numerator by its denominator
  ///////////////////////////////////////////////////////////
  public double toDouble() {
    return (double) numerator / denominator;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       toFloat
  // BEHAVIOR:   Converts this fraction into a float value
  // PARAMETERS: None
  // RETURNS:    A float value obtained by dividing the
  //             fraction's numerator by its denominator
  ///////////////////////////////////////////////////////////
  public float toFloat() {
    return (float) numerator / denominator;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       toString
  // BEHAVIOR:   Converts this fraction into a string
  // PARAMETERS: None
  // RETURNS:    A string of the form "num/denom". If the
  //             denominator is 1, returns a string
  //             containing only the numerator.
  ///////////////////////////////////////////////////////////
  public String toString() {
    if (denominator == 1)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       reduce
  // BEHAVIOR:   Reduces this fraction to lowest terms
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private void reduce() {
    // Compute GCD of numerator and denominator
    int g = gcd(numerator, denominator);

    // Divide numerator and denominator by GCD
    if (g != 0) {  
      numerator /= g;
      denominator /= g;
    }

    // Adjust fraction so that denominator is never negative
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       gcd
  // BEHAVIOR:   Computes the greatest common divisor of two
  //             integers
  // PARAMETERS: m - an integer
  //             n - an integer
  // RETURNS:    The greatest common divisor of m and n
  ///////////////////////////////////////////////////////////
  private static int gcd(int m, int n) {
    while (n != 0) {
      int r = m % n;
      m = n;
      n = r;
    }
    return m;
  }
}
