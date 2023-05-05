//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Rot13.java (Chapter 9, page 369)                         //
//////////////////////////////////////////////////////////////

// Uses the "rot13" algorithm to encrypt a message entered by
// the user

import jpb.*;

public class Rot13 {
  public static void main(String[] args) {
    // Prompt the user to enter the message to be encrypted
    SimpleIO.prompt("Enter message to be encrypted: ");
    String userInput = SimpleIO.readLine();

    // Display the encrypted message
    System.out.print("Encrypted message: ");
    for (int i = 0; i < userInput.length(); i++)
      System.out.print(encrypt(userInput.charAt(i)));
    System.out.println();
  }

  // Returns the encrypted version of ch using the "rot13"
  // algorithm
  private static char encrypt(char ch) {
    if (!Character.isLetter(ch))
      return ch;
    if (Character.isUpperCase(ch))
      return (char) (((ch - 'A') + 13) % 26 + 'A');
    return (char) (((ch - 'a') + 13) % 26 + 'a');
  }
}
