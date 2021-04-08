package linkedList;

public class LinkedList {
    Node head = null;

    public void insert(int value) {
        if (this.head == null) {
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public boolean includes(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public String toString() {
        String output = "";
        Node currentNode = head;
        while (currentNode != null) {

            output+=" { "+currentNode.value+" } --> ";

            currentNode = currentNode.next;
        }
        output += "NULL";


        return output;
    }
}
