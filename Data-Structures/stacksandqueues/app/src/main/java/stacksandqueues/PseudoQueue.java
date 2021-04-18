package stacksandqueues;

public class PseudoQueue<T> {

    private int size = 0;
    private Stack<T> primaryStack;
    private Stack<T> secondaryStack;


    public PseudoQueue() {
        this.primaryStack = new Stack<>();
        this.secondaryStack = new Stack<>();
    }

    public void enqueue(T value) {
        this.primaryStack.push(value);
    }

    public T dequeue() {
        moveTheStackContentToAnotherOneByReversingThem(primaryStack, secondaryStack);
        T returnedValue = secondaryStack.pop();
        moveTheStackContentToAnotherOneByReversingThem(secondaryStack, primaryStack);
        return returnedValue;
    }

    public T peek() {
        moveTheStackContentToAnotherOneByReversingThem(primaryStack, secondaryStack);
        T returnedValue = secondaryStack.peek();
        moveTheStackContentToAnotherOneByReversingThem(secondaryStack, primaryStack);
        return returnedValue;

    }

    public int getSize() {
        return primaryStack.size;
    }

    public void moveTheStackContentToAnotherOneByReversingThem(Stack from, Stack to) {

        while (from.top != null)
            to.push(from.pop());


    }

    @Override
    public String toString() {
        StringBuilder stackString = new StringBuilder();
        Node current = primaryStack.top;
        if(current == null)
            stackString.append("null");

        while (current != null) {
            stackString.append(current.value);

            if(current.next != null)
            stackString.append(" --> ");
            
            current = current.next;
        }

        return stackString.toString();
    }

}
