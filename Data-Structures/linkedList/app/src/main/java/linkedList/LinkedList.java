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

    public void append(int value) {
        Node currentNode = this.head;
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertBefore(int value, int newVal) {
        if (isListEmpty()) {
            System.out.println("The value " + value + " is not exist!");
            return;
        }
        if (this.head.value == value) {
            this.insert(newVal);
            return;
        }
        Node currentNode = this.head;

        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                addNodeHere(currentNode, newVal);
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("The value " + value + " is not exist!");
    }

    public void insertAfter(int value, int newVal) {
        if (isListEmpty()) {
            System.out.println("The value " + value + " is not exist!");
            return;
        }
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                addNodeHere(currentNode, newVal);
                return;
            }
            currentNode = currentNode.next;
        }

        System.out.println("The value " + value + " is not exist!");

    }

    private void addNodeHere(Node currentNode, int value) {
        Node newNode = new Node(value);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public boolean isListEmpty() {
        return this.head == null;
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

            output += " { " + currentNode.value + " } --> ";

            currentNode = currentNode.next;
        }
        output += "NULL";


        return output;
    }
}
