import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueSystem {

    public static void main(String[] args) {
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

        Queue<Player> playerQueue = new LinkedList<>();

        Random random = new Random();
        int numPLayers = random.nextInt(7) + 1;

        for (int i = 0; i < numPLayers; i++) {
            int index = random.nextInt(playerList.size());
            Player player = playerList.remove(index);
            playerQueue.add(player);
        }

        System.out.println("Players in the queue: " + playerQueue);
    }
}