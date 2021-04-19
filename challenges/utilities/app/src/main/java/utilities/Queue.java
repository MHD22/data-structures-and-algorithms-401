package utilities;

public class Queue <T> {
    Node front;
    Node rear;
    int size=0;

    public void enqueue(T value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            size++;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;

    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node temp = front;
            front = front.next;
            temp.next = null;
            size--;
            return (T) temp.value;
        }
        return null;
    }

    public T peek(){
        if(!this.isEmpty()){
            return (T) front.value;
        }
        return null;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        StringBuilder queueString = new StringBuilder();
        Node currentNode = front;
        if(currentNode==null)
            queueString.append("null");
        while(currentNode != null){
            queueString.append(currentNode.value);
            if(currentNode.next != null)
            queueString.append(" <-- ");
            currentNode = currentNode.next;
        }

        return queueString.toString();
    }
}
