//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Sieve.java (Chapter 13, page 577)                        //
//////////////////////////////////////////////////////////////

// Finds primes using the sieve of Eratosthenes

import java.util.*;
import jpb.*;

public class Sieve {
  public static void main(String[] args) {
    // Prompt user to enter a bound on the largest prime
    SimpleIO.prompt("Enter bound on largest prime: ");
    String userInput = SimpleIO.readLine().trim();
    int bound = Integer.parseInt(userInput);

    // Create a bit set; bits 0 and 1 will not be used
    BitSet primes = new BitSet(bound + 1);

    // Set all bits, starting at position 2
    for (int i = 2; i <= bound; i++)
      primes.set(i);

    // Clear bits that correspond to multiples of a prime
    for (int i = 2; i * i <= bound; i++)
      if (primes.get(i))
        for (int j = 2 * i; j <= bound; j += i)
          primes.clear(j);

    // Display all numbers whose bits are still set
    System.out.println("Primes: " + primes);
  }
}
