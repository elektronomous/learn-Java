//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FindAnagrams.java (Chapter 13, page 586)                 //
//////////////////////////////////////////////////////////////

// Program name: FindAnagrams
// Author: K. N. King
// Written: 1998-08-19
// 
// Prompts the user to enter a series of words. When the
// user presses the Enter key without entering a word, the
// program will then display the original words, with
// anagrams displayed on the same line.
//
// When determining whether two words are anagrams, the
// program will ignore punctuation and the case of the
// letters in the words.
//
// To find anagrams, the program computes a "signature" for
// each word, consisting of the letters in the word after
// they have been sorted. The words and their signatures are
// stored in parallel vectors, sorted by signature. After
// all words have been read, anagrams are located by
// looking for identical signatures. Because the signatures
// are sorted, identical signatures must be adjacent in the
// signatures vector.

import java.util.*;
import jpb.*;

public class FindAnagrams {
  private static Vector words = new Vector();
  private static Vector signatures = new Vector();

  public static void main(String[] args) {
    readWords();
    printAnagrams();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       readWords
  // BEHAVIOR:   Repeatedly prompts the user to enter words,
  //             stopping when the user enters an empty
  //             word. Computes the signature of each word,
  //             storing the signature in the signatures
  //             vector in such a way that the vector is
  //             always sorted in ascending order. Stores
  //             each word in the words vector at the same
  //             position as the signature in the
  //             signatures vector.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void readWords() {
    while (true) {
      // Prompt the user to enter a word; return if the word
      // is empty
      SimpleIO.prompt("Enter a word: ");
      String word = SimpleIO.readLine().trim();
      if (word.length() == 0)
        return;

      // Compute the signature of the word
      String signature = computeSignature(word);

      // Determine where the signature belongs in the
      // signatures vector
      int i;
      for (i = 0; i < signatures.size(); i++) {
        String signatureInVector =
          (String) signatures.elementAt(i);
        if (signature.compareTo(signatureInVector) < 0)
          break;
      }

      // Insert the signature into the signatures vector.
      // Insert the word at the corresponding location in the
      // words vector.
      signatures.insertElementAt(signature, i);
      words.insertElementAt(word, i);
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       printAnagrams
  // BEHAVIOR:   Prints the contents of the words vector,
  //             putting words that are anagrams of each
  //             other on the same line. Uses the signatures
  //             vector to determine which words are
  //             anagrams. Assumes that the i-th element of
  //             the signatures vector is the signature of
  //             the i-th word in the words vector. Also
  //             assumes that the elements of the signatures
  //             vector are in sorted order.
  // PARAMETERS: None
  // RETURNS:    Nothing
  ///////////////////////////////////////////////////////////
  private static void printAnagrams() {
    int anagramNumber = 1;
    int signatureCount = signatures.size();

    // Return if the signatures vector is empty
    if (signatureCount == 0)
      return;

    // Print a heading, followed by the first word in the
    // words vector
    System.out.println("\nAnagrams:\n---------");
    System.out.print("1. " + words.firstElement());

    // Print the remaining words in the words vector, placing
    // words on the same line if they have the same signature
    for (int i = 1; i < signatureCount; i++) {
      if (signatures.elementAt(i).equals
          (signatures.elementAt(i-1)))
        System.out.print(" ");
      else
        System.out.print("\n" + ++anagramNumber + ". ");
      System.out.print(words.elementAt(i));
    }
    System.out.println();
  }

  ///////////////////////////////////////////////////////////
  // NAME:       computeSignature
  // BEHAVIOR:   Computes the signature of a word by sorting
  //             the letters in the word. Characters other
  //             than letters are ignored, and uppercase
  //             letters are converted to lowercase.
  // PARAMETERS: word - the word whose signature is to be
  //                    computed
  // RETURNS:    String object containing the same letters
  //             as the original word, but in sorted order
  ///////////////////////////////////////////////////////////
  private static String computeSignature(String word) {
    // Create a new string buffer
    StringBuffer stringBuf = new StringBuffer(word.length());

    for (int i = 0; i < word.length(); i++) {
      // Extract the character at position i in word.
      // If the character is not a letter, ignore it; 
      // otherwise, convert it to lowercase.
      char ch = word.charAt(i);
      if (!Character.isLetter(ch))
        continue;
      ch = Character.toLowerCase(ch);
 
      // Insert the character into the string buffer, keeping
      // the characters in the buffer sorted at all times
      int j;
      for (j = 0; j < stringBuf.length(); j++)
        if (ch < stringBuf.charAt(j))
          break;
      stringBuf.insert(j, ch);
    }

    // Convert the string buffer into a string and return it
    return stringBuf.toString();
  }
}
