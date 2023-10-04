import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> daList = new ArrayList<Integer>(5);

        daList.add(1);
        daList.add(5);
        daList.add(10);
        daList.add(25);
        daList.add(50);
        daList.add(100);

        int size = getSize(daList);

        System.out.println("daList: " + daList);
        System.out.println("Elements present in daList: " + size);

        Scanner scan = new Scanner(System.in);
        System.out.print("Remove first element in daList? (Y/N): ");
        String yn = scan.nextLine();

        if (yn.equalsIgnoreCase("Y")){
            killfirstElement(daList);
            System.out.println("First element was removed.");
        } else if (yn.equalsIgnoreCase("N")){
            System.out.println("First element wasn't removed.");
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("daList updated: " + daList);

        System.out.print("Enter an element to see if it exists in daList: ");
        int contains = scan.nextInt();

        boolean doesitContains = contains(daList, contains);

        if (doesitContains) {
            System.out.println("daList contains " + contains);
        } else {
            System.out.println("daList does not contain " + contains);
        }

        System.out.print("Enter an element to find its index: ");
        int indexsearch = scan.nextInt();
        scan.close();

        int doesitIndex = indexOf(daList, indexsearch);

        if (indexsearch != -1) {
            System.out.println(indexsearch + " found at index " + doesitIndex);
        } else {
            System.out.println(indexsearch + " not found in daList.");
        }
    }

    // QUESTION 1: remove first element
    public static void killfirstElement(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }
    // QUESTION 2: size variable
    public static int getSize(ArrayList<Integer> list) {
        return list.size();
    }
    // QUESTION 3: contains and indexof function
    public static boolean contains(ArrayList<Integer> list, int element) {
        return list.contains(element);
    }
    public static int indexOf(ArrayList<Integer> list, int element) {
        return list.indexOf(element);
    }
}