//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// VIN2.java (Chapter 3, page 116)                          //
//////////////////////////////////////////////////////////////

// Displays information from a VIN entered by the user

import jpb.*;

public class VIN2 {
  public static void main(String[] args) {
    // Prompt the user to enter a VIN
    SimpleIO.prompt("Enter VIN: ");
    String vin = SimpleIO.readLine();

    // Display the parts of the VIN
    System.out.println("World manufacturer identifier: " +
                       vin.substring(0, 3));
    System.out.println("Vehicle description section: " +
                       vin.substring(3, 8));
    System.out.println("Check digit: " + vin.substring(8, 9));
    System.out.println("Vehicle identification section: " +
                       vin.substring(9));
  }
}
