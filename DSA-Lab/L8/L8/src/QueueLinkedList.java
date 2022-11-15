public class QueueLinkedList {
    private Node first;

    public QueueLinkedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void enqueue(int data) {
        if (isEmpty()) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = first;
            first = newNode;
        }

        Node currentNode = first;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;
    }


    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty");

        Node temp = first;
        first = first.next;
        return temp.data;
    }

    public void printQueue() {
        while (!isEmpty()) {
            System.out.print(dequeue() + " ");
        }
        System.out.println();
    }
}

