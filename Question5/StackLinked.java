package Question5;

public class StackLinked implements Stack {

    private Node top;

    public StackLinkedList() {
        top = null;
    }

    @Override
    public void push(int data) {
        try {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        } catch (OutOfMemoryError e) {
            throw new RuntimeException("Overflow: No memory");
        }
    }

    @Override
    public int pop() {
        int data;
        if (!isEmpty()) {
            data = top.data;
            top = top.next;
        } else {
            throw new RuntimeException("Underflow: No element left");
        }
        return data;
    }


    public boolean isEmpty() {
        return top == null;
    }
    
}
