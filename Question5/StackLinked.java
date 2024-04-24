package Question5;

public class StackLinked implements Stack {

    private Node top;
    
    public StackLinked() {
        top = null;
    }

    @Override
    public void push(int data) {
        try {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        } catch (OutOfMemoryError e) {
            System.out.println("Stack memory is full, Overflow");
        }
    }

    @Override
    public int pop() {
        try {
            int data = top.data;
            top = top.next;
        } catch ()
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
    
}
