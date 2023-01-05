//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// VIN.java (Chapter 3, page 115)                           //
//////////////////////////////////////////////////////////////

// Displays information from a VIN entered by the user

import jpb.*;

public class VIN {
  public static void main(String[] args) {
    // Prompt the user to enter a VIN
    SimpleIO.prompt("Enter VIN: ");
    String vin = SimpleIO.readLine();

    // Extract the parts of the VIN
    String manufacturer = vin.substring(0, 3);
    String description = vin.substring(3, 8);
    String checkDigit = vin.substring(8, 9);
    String identification = vin.substring(9);

    // Display the parts of the VIN
    System.out.println("World manufacturer identifier: " +
                       manufacturer);
    System.out.println("Vehicle description section: " +
                       description);
    System.out.println("Check digit: " + checkDigit);
    System.out.println("Vehicle identification section: " +
                       identification);
  }
}
