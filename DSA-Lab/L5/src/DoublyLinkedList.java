import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
            newNode.next = first;
        }
        first = newNode;
    }

    public void printForward() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public void deleteFirst() {
        Node temp = first;
        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty");
        } else if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        System.out.println("Deleted: " + temp.data);
    }

    public void deleteLast() {
        Node temp = last;
        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty");
        } else if (last.previous == null) {
            last = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        System.out.println("Deleted: " + temp.data);
    }

    public void listLength() {
        int length = 0;
        Node current = first;
        while (current != null) {
            length++;
            current = current.next;
        }
        System.out.print("Length: " + length);
    }

    public void insertAfter(int key, int data) {
        Node current = first;
        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty");
        } else {
            int position = 1;
            Node newNode = new Node();
            newNode.data = data;
            while (position != key + 1) {
                if (position == key) {
                    newNode.next = current.next;
                    newNode.previous = current;
                    current.next = newNode;
                    newNode.next.previous = newNode;
                }
                current = current.next;
                position++;
            }
        }
    }
}
