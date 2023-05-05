//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Card.java (Chapter 10, page 421)                         //
//////////////////////////////////////////////////////////////

// Class name: Card
// Author: K. N. King
// Written: 1998-05-26
// Modified: 1999-07-11
// 
// Represents a playing card with a rank and a suit.

public class Card {
  // Instance variables
  private int rank;
  private int suit;

  // Names for ranks
  public static final int TWO = 0;
  public static final int THREE = 1;
  public static final int FOUR = 2;
  public static final int FIVE = 3;
  public static final int SIX = 4;
  public static final int SEVEN = 5;
  public static final int EIGHT = 6;
  public static final int NINE = 7;
  public static final int TEN = 8;
  public static final int JACK = 9;
  public static final int QUEEN = 10;
  public static final int KING = 11;
  public static final int ACE = 12;

  // Names for suits
  public static final int CLUBS = 0;
  public static final int DIAMONDS = 1;
  public static final int HEARTS = 2;
  public static final int SPADES = 3;

  // Constants for use within the class
  private static final String RANKS = "23456789TJQKA";
  private static final String SUITS = "CDHS";

  ///////////////////////////////////////////////////////////
  // NAME:       Card
  // BEHAVIOR:   Constructs a card with the specified rank
  //             and suit
  // PARAMETERS: rank - rank of card
  //             suit - suit of card
  ///////////////////////////////////////////////////////////
  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getRank
  // BEHAVIOR:   Returns the rank of this card
  // PARAMETERS: None
  // RETURNS:    The rank of this card (0-12)
  ///////////////////////////////////////////////////////////
  public int getRank() {
    return rank;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getSuit
  // BEHAVIOR:   Returns the suit of this card
  // PARAMETERS: None
  // RETURNS:    The suit of this card (0-3)
  ///////////////////////////////////////////////////////////
  public int getSuit() {
    return suit;
  }

  ///////////////////////////////////////////////////////////
  // NAME:       toString
  // BEHAVIOR:   Converts this card into a string
  // PARAMETERS: None
  // RETURNS:    A string of the form "rs", where r is a rank
  //             (2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, or A)
  //             and s is a suit (C, D, H, or S)
  ///////////////////////////////////////////////////////////
  public String toString() {
    return RANKS.charAt(rank) + "" + SUITS.charAt(suit);
  }

  ///////////////////////////////////////////////////////////
  // NAME:       pickRandom
  // BEHAVIOR:   Creates a new card containing a random rank
  //             and suit
  // PARAMETERS: None
  // RETURNS:    A card containing a random rank and suit
  ///////////////////////////////////////////////////////////
  public static Card pickRandom() {
    return new Card((int) (Math.random() * 13),
                    (int) (Math.random() * 4));
  }
}
