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

        System.out.println("Starting sizes:");
        System.out.println("playerdeck: " + playerdeck.size());
        System.out.println("playerhand: " + playerhand.size());
        System.out.println("discard: " + discard.size());

        while (true) {
            int action = rand.nextInt(3);

            switch (action) {
                case 0:
                    playerdeck.transfer(playerhand);
                    System.out.println("COMMAND 1");
                    System.out.println("\nPress Any Key to Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 1:
                    System.out.println("COMMAND 2");
                    System.out.println("\nPress Any Key to Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.println("COMMAND 3");
                    System.out.println("\nPress Any Key to Continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}


//hand deck and discard pile stack
//while loop, player hand still has cards in it

// for (int i = 0; i < 10; i++)
//    {
//        randomNumber = rand.nextInt(3);
//        randomNumber++;
//        System.out.println(randomNumber);
//        System.out.println("\nPress Any Key to Continue...");
//        new java.util.Scanner(System.in).nextLine();
//    }