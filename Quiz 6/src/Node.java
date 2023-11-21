public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(int value)
    {
        if (value == data)
        {
            System.out.println("duplicate detected, will not insert value: " + value);
            return;
        }

        if (value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder()
    {
        if (leftChild != null )
        {
            leftChild.traverseInOrder();
        }

        System.out.println("Data: " + data);

        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        traverseInOrderDescending(this);
    }

    //encapsulating because it feels easier to work with

    private void traverseInOrderDescending(Node node)
    {
        if (node != null)
        {
            traverseInOrderDescending(node.rightChild);
            System.out.println("Data: " + node.data);
            traverseInOrderDescending(node.leftChild);
        }
    }

    public Node getMin()
    {
        return getMin(this);
    }

    private Node getMin(Node node)
    {
        while (node.leftChild != null)
        {
            node = node.leftChild;
        }
        return node;
    }

    public Node getMax()
    {
        return getMax(this);
    }

    private Node getMax(Node node)
    {
        while (node.rightChild != null)
        {
            node = node.rightChild;
        }
        return node;
    }

    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }
        else
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
