public class Tree {
    private Node root;

    public void insert(int value)
    {
        if (root != null)
        {
            root.insert(value);
        }
        else
        {
            root = new Node(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
        else
        {
            System.out.println("No root yet");
        }
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderDescending();
        } else
        {
            System.out.println("No root yet");
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        else
        {
            System.out.println("No root yet");
            return null;
        }
    }

    public Node getMin()
    {
        if (root != null)
        {
            return root.getMin();
        } else
        {
            System.out.println("No root yet");
            return null;
        }
    }

    public Node getMax()
    {
        if (root != null)
        {
            return root.getMax();
        } else
        {
            System.out.println("No root yet");
            return null;
        }
    }
}
