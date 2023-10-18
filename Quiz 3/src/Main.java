import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Player> playerQueue = new LinkedList<>();
        LinkedList<Player> playerList = new LinkedList<>();
        playerList.add(new Player("John Marston"));
        playerList.add(new Player("Jack Marston"));
        playerList.add(new Player("Abigail Roberts"));
        playerList.add(new Player("Arthur Morgan"));
        playerList.add(new Player("Dutch van der Linde"));
        playerList.add(new Player("Javier Escuella"));
        playerList.add(new Player("Bill Williamson"));
        playerList.add(new Player("Micah Bell"));
        playerList.add(new Player("Sadie Adler"));
        playerList.add(new Player("Leviticus Cornwall"));

        Scanner scanner = new Scanner(System.in);
        int numberOfGames = 0;
        Random random = new Random();

        while (numberOfGames < 10) {
            int playersInQueue = 0;
            int extraPlayersInQueue = playerQueue.size();
            playersInQueue = playersInQueue + extraPlayersInQueue;

            while (playersInQueue < 5) {
                System.out.println("\nGames made: " + numberOfGames);
                System.out.println("Number of players in the queue: " + playerQueue.size());
                System.out.println("Current Player Queue: " + playerQueue);
                System.out.println("\nPress Enter to add between 1-7 players to the queue...");
                scanner.nextLine();
                int numPlayers = random.nextInt(7) + 1;
                System.out.println("\nAdding " + numPlayers + " players to the queue.\n");

                for (int i = 0; i < numPlayers; i++) {
                    if (!playerList.isEmpty()) {
                        Player player = playerList.removeFirst();
                        playerQueue.add(player);
                        System.out.println("Added " + player.getName() + " to the queue.");
                        playersInQueue++;
                    } else {
                        System.out.println("No more players in the list.");
                        break;
                    }
                }
            }System.out.println("\n5 players reached, Starting new game...");
            int numDequeue = Math.min(5, playerQueue.size());
            System.out.println("\nDequeuing " + numDequeue + "\n");

            for (int i = 0; i < numDequeue; i++) {
                Player player = playerQueue.poll();
                playerList.add(player);
                System.out.println("Removed " + player.getName() + " from the queue.");
            }

            numberOfGames++;
        }
            System.out.println("\n10 games completed. Press Any Key to End the Program...");
            new java.util.Scanner(System.in).nextLine();
            System.exit(0);
        }
    }

// rand 1-7 players enqueued
// game can be started with at least 5 players queued
// when game starts first 5 players are dequeued
// Program ends when 10 games complete