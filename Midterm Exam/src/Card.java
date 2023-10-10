import java.util.EmptyStackException;

public class Card {
    private Node top;
    private int size;

    private static class Node {
        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
        }
    }

    public Card() {
        size = 0;
        initializeDeck();
    }

    private void initializeDeck() {
        String[] names = {
                "A", "A", "A", "A", "A", "A", "A", "A", "A", "A",
                "B", "B", "B", "B", "B", "B", "B", "B", "B", "B",
                "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
                
        };
        for (String name : names) {
            push(name);
        }
    }
    
    public void push(String name) {
        Node newNode = new Node(name);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String name = top.name;
        top = top.next;
        size--;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.name;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void transfer(Card Target) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        String transferredCard = pop();
        Target.push(transferredCard);
    }
    public static void main(String[] args) {
        Card cardDeck = new Card();
        System.out.println("Size: " + cardDeck.size());
    }
}