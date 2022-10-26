public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(5);

        dll.insertAfter(2,88);
        dll.printForward();
        dll.printBackward();

        dll.insertLast(99);
        dll.printForward();
        dll.printBackward();

        dll.deleteFirst();
        dll.printForward();
        dll.printBackward();

        dll.deleteLast();
        dll.printForward();
        dll.printBackward();

        dll.listLength();
        dll.printForward();
        dll.printBackward();

    }
}