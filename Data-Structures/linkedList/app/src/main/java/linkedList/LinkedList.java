package linkedList;

public class LinkedList {
    Node head = null;
    private int size =0;


    public void insert(int value) {
            Node newNode = new Node(value);
            newNode.next = this.head;
            this.head = newNode;
            size++;
    }

    public void append(int value) {
        Node currentNode = this.head;
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            size++;
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;
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

    public int getSize() {
        return size;
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
        size++;
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

    public int kthFromEnd(int k){
        if(k<0){
            System.out.println("K must be positive number");
            return -1;
        }
        int index = this.size - k;
        if(index > 0 ){
            Node currentNode = this.head;
            int count = 1;
            while(count!=index){
                currentNode = currentNode.next;
                count++;
            }
            return currentNode.value;
        }
        else{
            System.out.println("K is larger than or equal the size of linked list..");
            return -1;
        }
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
