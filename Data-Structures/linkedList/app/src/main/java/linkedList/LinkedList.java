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

    public static LinkedList zipLists(LinkedList list1, LinkedList list2){

        int iterationNumbers = getLargerSize( list1.getSize(), list2.getSize());
        LinkedList newList = new LinkedList();
        Node currentNodeOfList1 = list1.head;
        Node currentNodeOfList2 = list2.head;
        for(int i =0 ; i < iterationNumbers; i++){
            if(currentNodeOfList1 != null){
                newList.append(currentNodeOfList1.value);
                currentNodeOfList1=currentNodeOfList1.next;
            }
            if(currentNodeOfList2 != null){
                newList.append(currentNodeOfList2.value);
                currentNodeOfList2=currentNodeOfList2.next;
            }

        }

        return newList;
    }

    private static int getLargerSize(int size1, int size2){
        if(size1 >= size2)
            return size1;
        else
            return size2;
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
