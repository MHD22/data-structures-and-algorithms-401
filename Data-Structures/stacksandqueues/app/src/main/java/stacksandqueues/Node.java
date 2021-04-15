package stacksandqueues;

public class Node <T> {
    T value;
    Node next = null;

    public Node(T value) {
        this.value = value;
    }

    public Node() {
    }

    public T getValue() {
        return value;
    }
}
