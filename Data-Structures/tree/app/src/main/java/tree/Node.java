package tree;

public class Node <T>{
    T value;
    Node left;
    Node right;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{value=" + value +
                "\nleft=" + left +
                "\nright=" + right +"}";
    }
}
