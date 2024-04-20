/*
(Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
Here is a sample run of the program:
The card you picked is Jack of Hearts
*/


public class Exercise3_24 {
    public static void main(String[] args) {
        // Generate random number to pick a rank of the card
        int rankOfCard = (int)(Math.random() * 12) + 1;
        // Generate random the suit of the card
        int suitOfCard = (int)(Math.random() * 3);

        switch (rankOfCard) {
            case 1: System.out.print("The card you pick is ");
                    System.out.print("Ace of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 2: System.out.print("The card you pick is ");
                    System.out.print("2 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 3: System.out.print("The card you pick is ");
                    System.out.print("3 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 4: System.out.print("The card you pick is ");
                    System.out.print("4 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 5: System.out.print("The card you pick is ");
                    System.out.print("5 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 6: System.out.print("The card you pick is ");
                    System.out.print("6 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 7: System.out.print("The card you pick is ");
                    System.out.print("7 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 8: System.out.print("The card you pick is ");
                    System.out.print("8 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 9: System.out.print("The card you pick is ");
                    System.out.print("9 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 10: System.out.print("The card you pick is ");
                    System.out.print("10 of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 11: System.out.print("The card you pick is ");
                    System.out.print("Jack of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 12: System.out.print("The card you pick is ");
                    System.out.print("Queen of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
            case 13: System.out.print("The card you pick is ");
                    System.out.print("King of ");
                    
                    switch (suitOfCard) {
                        case 0: System.out.println("Clubs"); break;
                        case 1: System.out.println("Diamonds"); break;
                        case 2: System.out.println("Hearts"); break;
                        case 3: System.out.println("Spades"); break;
                    }
                    break;
        }
    }
}