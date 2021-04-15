package stacksandqueues;

public class Stack <T> {
    Node top = null;
    int size =0;

    public void push(T value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop(){
        Node tempNode = top;
        if(!this.isEmpty()){
            top = top.next;
            tempNode.next = null;
            size--;
            return (T) tempNode.value;
        }
        return null;
    }

    public T peek(){
        if(!this.isEmpty())
            return (T)top.value;

        return null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
      StringBuilder stackString = new StringBuilder();
      Node current = top;

      while(current != null){
          stackString.append(current.value);
          stackString.append("\n");
          current = current.next;
      }
        stackString.append("null");
      return stackString.toString();
    }
}
