//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// Blackjack.java (Chapter 10, page 425)                    //
//////////////////////////////////////////////////////////////

// Program name: Blackjack
// Author: K. N. King
// Written: 1998-05-26
// Modified: 1999-07-11
// 
// Plays the game of Blackjack. At the beginning of each hand,
// the dealer (the program) and the player (the user) are
// each dealt two cards. If the player's cards total to 21,
// the hand is over and the player wins (unless the dealer
// also has 21, in which case the hand is a tie). The player
// may now draw additional cards in an attempt to get close
// to 21. If the player exceeds 21, the hand is over and the
// player loses. Otherwise, the dealer begins drawing cards
// until reaching a total of 17 or more. If the dealer
// exceeds 21, the player wins. If the player's final count
// exceeds the dealer's final count, the player wins. If the
// dealer and the player have identical counts, the hand is
// a tie. Otherwise, the dealer wins.
//
// At the end of each hand, the program will display the
// total number of wins for both the dealer and the player.
// The player will then be asked whether or not to play
// another hand.

import jpb.*;

public class Blackjack {
  public static void main(String[] args) {
    int playerWins = 0;
    int dealerWins = 0;

    while (true) {
      // Choose two cards for both player and dealer
      Card playerCard1 = Card.pickRandom();
      Card playerCard2 = Card.pickRandom();
      Card dealerCard1 = Card.pickRandom();
      Card dealerCard2 = Card.pickRandom();

      // Display player's cards
      System.out.println("Your cards: " + playerCard1 +
                         " " + playerCard2);

      // Compute initial counts for player and dealer
      int playerCount = getCount(playerCard1) +
                        getCount(playerCard2);
      int dealerCount = getCount(dealerCard1) +
                        getCount(dealerCard2);

      // Check whether player's count is 21. If so, dealer
      // must have 21 or lose automatically.
      if (playerCount == 21) {
        if (dealerCount != 21)
          dealerCount = 0;
      } else {
        // Player's count was not 21. Ask player to draw
        // additional cards and determine new value of
        // player's hand.
        playerCount = getPlayerCards(playerCard1,
                                     playerCard2);

        // Player loses if new count exceeds 21
        if (playerCount > 21)
          playerCount = 0;
        else {
          // Player's count does not exceed 21. Show dealer's
          // cards.
          System.out.println("Dealer's cards: " + 
                             dealerCard1 + " " + dealerCard2);

          // Draw additional cards for dealer and determine
          // new value of dealer's hand
          dealerCount = getDealerCards(dealerCard1,
                                       dealerCard2);

          // Dealer loses if new count exceeds 21
          if (dealerCount > 21)
            dealerCount = 0;
        }
      }

      // Compare player's count with dealer's count to
      // determine the winner; display the outcome and
      // update the win counts
      if (playerCount > dealerCount) {
        System.out.println("You win!");
        playerWins++;
      } else if (playerCount < dealerCount) {
        System.out.println("Dealer wins");
        dealerWins++;
      } else
        System.out.println("Tie");

      // Display the win counts
      System.out.println("Dealer: " + dealerWins +
                         " Player: " + playerWins);

      // See if user wants to play again; exit from loop if
      // answer is no
      SimpleIO.prompt("Play again (Y/N)? ");
      String userInput = SimpleIO.readLine();
      if (!userInput.equalsIgnoreCase("Y"))
        break;
      System.out.println();
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getDealerCards
  // BEHAVIOR:   Adds cards to the dealer's hand until the
  //             value reaches 17 or more
  // PARAMETERS: card1 - One of dealer's original two cards
  //             card2 - The other original card
  // RETURNS:    Value of the dealer's hand, including
  //             original cards and new cards
  ///////////////////////////////////////////////////////////
  private static int getDealerCards(Card card1, Card card2) {
    int dealerCount = getCount(card1) + getCount(card2);
    int aceCount = 0;

    // Determine number of aces among original pair of cards
    if (card1.getRank() == Card.ACE)
      aceCount++;
    if (card2.getRank() == Card.ACE)
      aceCount++;

    while (true) {
      // If the dealer's count exceeds 21 and the hand
      // contains aces still valued at 11, then reduce the
      // number of aces by 1 and reduce the count by 10
      if (aceCount > 0 && dealerCount > 21) {
        aceCount--;
        dealerCount -= 10;
      }

      // Return if dealer's count is at least 17
      if (dealerCount >= 17)
        return dealerCount;

      // Pick a new card and update the dealer's count
      Card newCard = Card.pickRandom();
      System.out.println("Dealer drew: " + newCard);
      dealerCount += getCount(newCard);

      // Check whether the new card is an ace
      if (newCard.getRank() == Card.ACE)
        aceCount++;
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getPlayerCards
  // BEHAVIOR:   Adds cards to the player's hand until the
  //             value exceeds 21 or the player decides to
  //             stand
  // PARAMETERS: card1 - One of player's original two cards
  //             card2 - The other original card
  // RETURNS:    Value of the player's hand, including
  //             original cards and new cards
  ///////////////////////////////////////////////////////////
  private static int getPlayerCards(Card card1, Card card2) {
    int playerCount = getCount(card1) + getCount(card2);
    int aceCount = 0;

    // Determine number of aces among original pair of cards
    if (card1.getRank() == Card.ACE)
      aceCount++;
    if (card2.getRank() == Card.ACE)
      aceCount++;

    while (true) {
      // If the player's count exceeds 21 and the hand
      // contains aces still valued at 11, then reduce the
      // number of aces by 1 and reduce the count by 10
      if (aceCount > 0 && playerCount > 21) {
        aceCount--;
        playerCount -= 10;
      }

      // Return if player's count exceeds 21
      if (playerCount > 21)
        return playerCount;

      // Ask user whether to stand or hit
      SimpleIO.prompt("(S)tand or (H)it? ");
      String userInput = SimpleIO.readLine();
      if (!userInput.equalsIgnoreCase("H"))
        return playerCount;

      // Pick a new card and update the player's count
      Card newCard = Card.pickRandom();
      System.out.println("You drew: " + newCard);
      playerCount += getCount(newCard);

      // Check whether the new card is an ace
      if (newCard.getRank() == Card.ACE)
        aceCount++;
    }
  }

  ///////////////////////////////////////////////////////////
  // NAME:       getCount
  // BEHAVIOR:   Returns the Blackjack value of a particular
  //             card
  // PARAMETERS: c - a Card object
  // RETURNS:    The Blackjack value of the card c. The value
  //             of a card is the same as its rank, except
  //             that face cards have a value of 10 and aces
  //             have a value of 11.
  ///////////////////////////////////////////////////////////
  private static int getCount(Card c) {
    switch (c.getRank()) {
      case Card.TWO:   return 2;
      case Card.THREE: return 3;
      case Card.FOUR:  return 4;
      case Card.FIVE:  return 5;
      case Card.SIX:   return 6;
      case Card.SEVEN: return 7;
      case Card.EIGHT: return 8;
      case Card.NINE:  return 9;
      case Card.ACE:   return 11;
      default:         return 10;  // TEN, JACK, QUEEN, KING
    }
  }
}
