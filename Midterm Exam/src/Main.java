import java.io.*;
import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Card playerdeck = new Card();
        Card playerhand = new Card();
        Card discard = new Card();

        // TEMPORARY FIX, WORK ON IT AGAIN LATER
        while (!playerhand.isEmpty()) {
            playerhand.pop();
        }

        while (!discard.isEmpty()) {
            discard.pop();
        }

        while (!playerdeck.isEmpty()) {
            int action = rand.nextInt(3);
            switch (action) {
                case 0:
                    playerdeck.transfer(playerhand);
                    System.out.println("cards were drawn from the deck.");
                    System.out.println("player deck: " + playerdeck.size());
                    System.out.println("player hand: " + playerhand.size());
                    System.out.println("discard: " + discard.size());
                    playerhand.showCards();
                    System.out.println("\nPress Any Key to Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 1:
                    playerhand.transfer(discard);
                    System.out.println("cards were discarded from your hand.");
                    System.out.println("player deck: " + playerdeck.size());
                    System.out.println("player hand: " + playerhand.size());
                    System.out.println("discard: " + discard.size());
                    playerhand.showCards();
                    System.out.println("\nPress Any Key to Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    discard.transfer(playerhand);
                    System.out.println("cards were taken from the discard pile.");
                    System.out.println("player deck: " + playerdeck.size());
                    System.out.println("player hand: " + playerhand.size());
                    System.out.println("discard: " + discard.size());
                    playerhand.showCards();
                    System.out.println("\nPress Any Key to Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
        System.out.println("Game Over! The Player Deck is Empty");
        System.out.println("\nPress Any Key to End the Program...");
        new java.util.Scanner(System.in).nextLine();
        System.exit(0);
    }
}
