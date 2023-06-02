package exercise1;

import static exercise1.Card.SUITS;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            card.setValue(getRandomValue());
            card.setSuit(getRandomSuit());
            hand[i] = card;

        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-10, 11 for Jack, 12 for Queen, 13 for King, 14 for Ace): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(SUITS[userSuit - 1]);

        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            printInfo();
        }
    }

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(13) + 2;
    }

    private static String getRandomSuit() {
        Random random = new Random();
        int index = random.nextInt(4);
        return SUITS[index];
    } 

    


        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Yash Patel May 2023
     * I'am Done
     */

    
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Yash Patel, but you can call me Yash");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active in Learning");
        System.out.println("-- Have a semester with full focus on study");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Driving");
        System.out.println("-- Volleyball");
        System.out.println("-- Hiking");
       

        System.out.println();
        
    
    }

}
