public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(20);
        tree.insert(5);
        tree.insert(50);
        tree.insert(1);
        tree.insert(17);
        tree.insert(38);
        tree.insert(69);
        tree.insert(420);

        System.out.println("\nTraverse in order (default):");
        tree.traverseInOrder();

        System.out.println("\nGetting value(s):");
        System.out.println(tree.get(69));

        System.out.println("\nTraverse in order descending:");
        tree.traverseInOrderDescending();

        System.out.println("\nGet Min:");
        System.out.println(tree.getMin());

        System.out.println("\nGet Max:");
        System.out.println(tree.getMax());
    }
}