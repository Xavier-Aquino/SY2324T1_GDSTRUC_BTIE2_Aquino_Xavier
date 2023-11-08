import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static boolean bogoSearch(int[] array, int target)
    {
        int attempts = 0;
        while (true)
        {
            bogoTheArray(array);
            attempts++;
            if (array[0] == target)
            {
                System.out.println("Bogo's final number of failed attempts: " + (attempts - 1));
                return true;
            } try {
                Thread.sleep(1000); //even with the RNG, Bogo is not as inefficient as I wanted him to be, added a 1 second delay to make him even more inefficient
        } catch (InterruptedException e) {
                e.printStackTrace();

        }
            if(attempts % 1 == 0)
            {
                System.out.println("Bogo's failed attempts: " + attempts); //remove the 1 second delay and enter an element that does not exist in the array to experience true horror
            }
        }
    }

    private static void bogoTheArray(int[] array) //RNG
    {
        int n = array.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++)
        {
            int change = i + random.nextInt(n - i);
            swap(array, i, change);
        }
    }

    private static void swap(int[] array, int i, int change)
    {
        int helper = array[i];
        array[i] = array[change];
        array[change] = helper;
    }

    public static void main(String[] args)
    {
        int[] array = {420, 69, 1337, 1, 1453, 1945, 2023, 9001, 50, 100, 10, 7, 13, 50000, 12345, 2048, 1648, 1993};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BogoSearch!\n\nMe Bogo, me find what you want!\n\n" + "Array: " + Arrays.toString(array) + "\n");

        System.out.print("Enter target for Bogo to look!: ");
        int target = scanner.nextInt();
        if (bogoSearch(array, target))
        {
            System.out.println("Bogo find it!");
        } else
        {
            System.out.println("Oopsie, Bogo no find!"); //Bogo will not say this, he will continue to search for a nonexistent element until the heat death of the universe
        }
    }
}