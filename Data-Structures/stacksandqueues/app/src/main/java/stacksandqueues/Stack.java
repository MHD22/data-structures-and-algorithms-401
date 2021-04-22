package stacksandqueues;

public class Stack <T> {
    Node top = null;
    int size =0;
    MaxStack <T> maxStack = new MaxStack();

    public void push(T value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
        if(maxStack.isEmpty() || (int)value > (int) maxStack.peek() )
            maxStack.push(value);

    }

    public T pop(){
        Node tempNode = top;
        if(!this.isEmpty()){
            top = top.next;
            tempNode.next = null;
            size--;
            if(tempNode.value == maxStack.peek()){
                maxStack.pop();
            }
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

    public T getMax(){
        if(!maxStack.isEmpty())
            return (T)maxStack.peek();

        return null;
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
