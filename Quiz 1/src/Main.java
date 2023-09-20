public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 33;
        numbers[1] = 100;
        numbers[2] = 25;
        numbers[3] = 10;
        numbers[4] = 75;

        System.out.println("Unsorted:");
        printArray(numbers);
        System.out.println("\n");

        bubbleSort(numbers);

        System.out.println("Bubble Sorted in descending order:");
        printArray(numbers);
        System.out.println("\n");

        numbers[0] = 33;
        numbers[1] = 100;
        numbers[2] = 25;
        numbers[3] = 10;
        numbers[4] = 75;

        System.out.println("Unsorted:");
        printArray(numbers);
        System.out.println("\n");

        selectionSort(numbers);

        System.out.println("Selection Sorted, smallest value found first and placed at end:");
        printArray(numbers);
        System.out.println("\n");

    }

    // bubble sort stuff - descending order
    public static void bubbleSort(int[] array)
    {
        // i = pass
        for (int i = 0; i < array.length - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] < array[j+1])
                {
                    // Switch Values
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }

            System.out.println("\nbubble sort pass " + (i+1) + ":");
            printArray(array);
            System.out.print("\n ");
        }
    }

    // selection sort stuff - look for smallest value and put at end
    public static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int smallIndex = i;

            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] > array[smallIndex])
                {
                    smallIndex = j;
                }
            }

            // Switch Values
            int temp = array[smallIndex];
            array[smallIndex] = array[i];
            array[i] = temp;

            System.out.println("\nselection sort pass " + (i+1) + ":");
            printArray(array);
            System.out.print("\n ");
        }
    }

    public static void printArray(int[] array)
    {
        for (int number : array)
        {
            System.out.print(number + ", ");
        }
    }
}
