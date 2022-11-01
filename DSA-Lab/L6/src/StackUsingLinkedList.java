public class StackUsingLinkedList {
    private Node first;

    public StackUsingLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void push(int data) {
        Node extraNode = first;
        first = new Node();
        first.data = data;
        first.next = extraNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        }
        int value = first.data;
        first = first.next;
        return value;
    }

    public void printStack() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty");
        } else {
            System.out.print("\nPoping Out Element: ");
            while (!isEmpty()) {
                System.out.print(pop() + " ");
            }
        }
    }
}
