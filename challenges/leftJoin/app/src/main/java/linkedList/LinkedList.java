package linkedList;

public class LinkedList <T> {
    public Node head = null;
    public Node tail = null;
    private int size =0;


    public void insert(String key ,T value) {


            Node newNode = new Node(key,value);
            if(isListEmpty())
                this.tail = newNode;
            newNode.next = this.head;
            this.head = newNode;
            size++;
    }

    public void append(String key, T value) {
        Node newNode = new Node(key, value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            size++;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;
        size++;
    }



    public int getSize() {
        return size;
    }



    private void addNodeHere(Node currentNode,String key, int value) {
        Node newNode = new Node(key, value);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    public boolean isListEmpty() {
        return this.head == null;
    }

    public boolean includes(String key) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.key == key) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public Node getNode(String key){
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public String toString() {
        String output = "";
        Node currentNode = head;
        while (currentNode != null) {

            output += " { "+ currentNode.key+ " , " + currentNode.value + " } --> ";
            currentNode = currentNode.next;
        }
        output += "NULL";

        return output;
    }
}
