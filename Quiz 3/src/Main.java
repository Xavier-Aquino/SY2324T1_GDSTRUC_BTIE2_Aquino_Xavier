import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            QueueSystem.main(args);
            System.out.println("\nPress Any Key to Continue...");
            new java.util.Scanner(System.in).nextLine();
        }
    }
}

// rand 1-7 players enqueued
// game can be started with at least 5 players queued
// when game starts first 5 players are dequeued
// Program ends when 10 games complete