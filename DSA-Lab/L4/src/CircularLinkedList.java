public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
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
        }

        newNode.next = first;
        first = newNode;
        last.next = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
            newNode.next = first;
        } else {
            last.next = newNode;
            newNode.next = first;
            last = newNode;
        }
    }

    public void removeFirst() {
        Node temp = first;
        if (!isEmpty()) {
            first = first.next;
            last.next = first;
        }
    }

    public void even() {
        Node current = first;
        if (current.data % 2 == 0) {
            System.out.print(current.data + " ");
        }
        current = current.next;
        while (current != first) {
            if (current.data % 2 == 0) {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void odd() {
        Node current = first;
        if (current.data % 2 != 0) {
            System.out.print(current.data + " ");
        }
        current = current.next;
        while (current != first) {
            if (current.data % 2 != 0) {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void max() {
        Node current = first;
        int max = -999999999;
        if (current.data > max) {
            max = current.data;
        }
        current = current.next;
        while (current != first) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        System.out.println("Max: " + max);
    }

    public void min() {
        Node current = first;
        int min = 999999999;
        if (current.data < min) {
            min = current.data;
        }
        current = current.next;
        while (current != first) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        System.out.println("Min: " + min);
    }

    public void displayList() {
        Node current = first;
        current.displayNode();  //used to display first value
        current = current.next;
        while (current != first) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
