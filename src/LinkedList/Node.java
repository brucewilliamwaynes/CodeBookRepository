package LinkedList;
/**
 * Base node class with integer type as data value.
 */
public class Node {
    private Node next;
    private int data;
    public Node(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
